#AI for Breakout

#Imporing the Libraries
import numpy as np
import torch
import torch.nn as nn
import torch.nn.functional as F

#Initialzing and setting the variance of a tesnor of weights
def normalized_columns_initializer(weights, std = 1.0): # this function will normalize the weights to a range of small numbers
    out = torch.randn(weights.size()) #initializng the weights to random numbers that follow a random distribution
    out *= std / torch.sqrt(out.pow(2).sum(1).expand_as(out)) # This will get the wights of out and then standerize the numbers to a small range of numbers (var(out))=std^2)
    return out

#Initializing the weights of the nueral network for an omptimal learning
def weights_init(m):
    classname = m.__class__.__name__ # to get the name of wehther it is a conv nn or a forword nn
    if classname.find("Conv") != -1: # if ther is "Conv" in the name
        weights_shape = list(m.weight.data.size()) # here we are getting the shape of the weight matrix
        fan_in = np.prod(weights_shape[1:4]) # we want to get the product of the three dimensions from 1 to 3
        fan_out = np.prod(weights_shape[2:4])*weights_shape[0] # we want to get the product of the three dimensions from 0 to 3 with no 1 dim0*dim2*dim3
        w_bound = np.sqrt(6. / fan_in + fan_out) # to put the bounderies for weight initialization
        m.weight.data.uniform_(-w_bound, w_bound) # geting the weights through a uniform distribution function
        m.bias.data.fill_(0)# initializng the biases to 0

    elif classname.find("Linear") != -1: # if ther is "Linear" in tyhe name
        weights_shape = list(m.weight.data.size()) # here we are getting the shape of the weight matrix
        fan_in = weights_shape[1] # we want to get dimension of the index 1 which is the in weight
        fan_out = weights_shape[0] # we want to get dimension of the index 0 which is the out weight
        w_bound = np.sqrt(6. / fan_in + fan_out) # to put the bounderies for weight initialization
        m.weight.data.uniform_(-w_bound, w_bound) # geting the weights through a uniform distribution function
        m.bias.data.fill_(0)# initializng the biases to 0

# Making the A3C brain
class ActorCritic(torch.nn.Module):
    def __init__(self, num_input, action_space):
        super(ActorCritic, self).__init__()
        self.conv1 = nn.Conv2d(num_input, 32, 3, stride = 2, padding = 1)
        self.conv2 = nn.Conv2d(32, 32, 3, stride = 2, padding = 1)
        self.conv3 = nn.Conv2d(32, 32, 3, stride = 2, padding = 1)
        self.conv4 = nn.Conv2d(32, 32, 3, stride = 2, padding = 1)
        self.lstm = nn.LSTMCell(32 * 3 * 3, 256)
        num_outputs = action_space.n
        self.critic_linear = nn.Linear(256, 1) # this is output thta will be shared by all agents the V value 
        self.actor_linear = nn.Linear(256, num_outputs) # this is the out for each action Q values
        self.apply(weights_init)
        self.actor_linear.weight.data = normalized_columns_initializer(self.actor_linear.weight.data, 0.01)
        self.actor_linear.bias.data.fill_(0)
        self.critic_linear.weight.data = normalized_columns_initializer(self.critic_linear.weight.data, 1)
        self.critic_linear.bias.data.fill_(0)
        self.lstm.bias_ih.data.fill_(0)
        self.lstm.bias_hh.data.fill_(0)
        self.train()
    
    def forward(self, inputs):
        inputs, (hx, cx) = inputs
        x = F.elu(self.conv1(inputs))
        x = F.elu(self.conv2(x))
        x = F.elu(self.conv3(x))
        x = F.elu(self.conv4(x))
        x = x.view(-1, 32 * 3* 3)
        (hx, cx) = self.lstm(x, (hx, cx))
        x = hx
        return self.critic_linear(x), self.actor_linear(x), (hx, cx)
