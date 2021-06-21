# AI for Autonomous Vehicles - Build a Self-Driving Car

#Importing the libraries
import os # The operating system library so we can load the saved model
import random # The random library so we can have random transitions from the memory for experience replay
import torch # We import the torch library because we will build our AI using it
import torch.nn as nn # The nn module from the torch library, used to build the fully connect network layers 
import torch.nn.functional as F # Th Function module helps us to choose the activation function that we want to choose (in our example relu and
#softmax)
import torch.optim as optim # The optim module helps us to optimize our model by applying gradients of the losses with respect to the weights
# so we can choose the best weight that minimizes the loss
from torch.autograd import Variable # The Variable module helps us to associate each tensor and its gradient into the same variable
import torch.autograd as autograd
import numpy as np # We will use numpy because we are dealing with arrays further on

#Creating the architecture of the Neural Network 

class Network(nn.Module): # Creating the Network class that will consist of the architecture of the Neural Network and to help us achieve that
    # We make the Network class inherit from the nn.Module which has all the functions needed to achieve the Neural network operations
    def __init__(self, input_size, nb_action): # we initialize the class variables and declare them, we give the class two inputs 1) input size
        # the number of actions that the agent should make
        super(Network, self).__init__() # calling the initializer of the parent class to activate the inheritance
        self.input_size = input_size # Here we are initializing the input size (4 in our example)
        self.nb_action = nb_action # Here we are initializing the number of actions (3 in our example)
        self.fc1 = nn.Linear(input_size, 30) # Here we are initializing the first layer and set it as a linear layer with inputs neurons
        # equal to the input size (4) and outputs to 30 neurons
        self.fc2 = nn.Linear(30, nb_action) # Here we are initializing the first layer and set it as a linear layer with inputs neurons
        # equal to the input size 30 and outputs to neurons equal to the number of actions that we have (4)
        
    
    def forward(self, state): # Here we are defining a function that will forward propagate through the metwork and outputs the 4 Q-values
        # from the last layer
        x = F.relu(self.fc1(state)) # Here we are inputing the state vector which contains the number of inputs that we have (orientation, 
        # signal1, signal2 and signal3)
        q_values = self.fc2(x) # Here we are getting the output of the last layer from the neural network by putting the output of the previous
        # layer as input
        return q_values # Here we are return the Q-values that we got from the last layer 

# Implementing Experience replay

class ReplayMemory(object): # Declaring the Experience Replay Class that will make the AI remember the experiences it had from the past
    
    def __init__(self, capacity): # Initializing the variables of the Experience Replay class and declaring them, we have to pass it only 
        # The capacity of the memory it has
        self.capacity = capacity # Initializing the capacity variable 
        self.memory = [] # Initializing the memory as an empty list
        
    
    def push(self, event): # Declaring a function so we can push the events so the AI can gather some experience from the past
        self.memory.append(event) # Adding the event to the memory of the AI 
        if len(self.memory) > self.capacity: # Here we are checking if the memory exceeds the allowed memory capacity then we delete
            # the first memory that we have since it is the least relevant to the present
            del self.memory[0] # deleting the first memory
    
    def sample(self, batch_size): # Declaring a function that takes the number of inputs we want to have per batch so we can forward 
        # propagate through them then back propagate to adjust the weights
        
        samples = zip(*random.sample(self.memory, batch_size)) # Here we are grouping the states, actions and rewards into a sparate lists each
        # list containing the batch size amount of memory data, how zip works is as follows: lets say we have list1 = [(1,2,3), (4,5,6)] and we
        # apply zip(*list1) we get => [(1,4), (2,3), (5,6)] so it is some kind reshaping of the elements where in our example it groups the same 
        # batch type in the same columns or tuple in the previous example
        return map(lambda x: Variable(torch.cat(x, 0)), samples) # Here we are applying the map function so we can map the tensors inside the
        # the sample list to its gradient value using the Variable class that encompasses the tensor to a gradient, this helps to improve
        # the computation speed, and using tensors also helps a lot with the computational process, also the cat helps to concatenate the
        # each sample in each column

# Implementing the Deep Q-Learning (DQN)

class Dqn(object): # Declaring the Deep Q-Learning class where we will build the whole model
    
    def __init__(self, input_size, nb_action, gamma): # Initializing the class and passing to it three parameters the inputs size that is to
        # fed into the neural network and the number of actions that the Deep Q-learning model will have to predict the Q-values for them
        # and the gamma parameter which decides the number at which there will be discount from the previous state to the next one
        # (discount factor)
        self.gamma = gamma # Initializing the gamma parameter
        self.reward_window = [] # We want to get the rewards of the last 100 rewards and get their average to evaluate how good our model is
        # learning so we store here the average overtime
        self.model = Network(input_size, nb_action) # making the neural network layers with given input size and number of parameters
        self.memory = ReplayMemory(capacity=1e5) # Building the memory of our AI with a capacity of 100000 of past memory experiences 
        self.optimizer = optim.Adam(params = self.model.parameters(), lr = 0.001) # the optimizer of the Deep Q-learning model with the parameters 
        # resulted from our model note the best optimizer for recurrent neural network which is a type of unsupervised deep learning is the rmsprop
        # The lower the learning rate the more time the AI model has to adjust the weights and explore more and vice versa
        self.last_state = torch.Tensor(input_size).unsqueeze(0) # getting the last state that the model has been in, also we use the Tensor class
        # so we can make a tensor of last_state concatenated with the coressponding batch we do this by adding an extra dimension at index 0
        # by using the unsqueeze method then add the batch number in that dimension
        self.last_action = 0 # Initializing the last action that the model has taken to 0 because it hasn't been trained yet to do actions
        self.last_reward = 0 # Initializing the last reward the model has acquired to 0 because it hasn't been trained yet to get rewards
    
    def select_action(self, state): # Here we define the select_action method that takes as input the states that we have
        # in this example we have orientation, signal1, signal2 ,signal3, and -orientation, after taking the inputs we get the output as a 
        # Q-value array
        probs = F.softmax(self.model(Variable(state, volatile = True))*100) # Here we apply the softmax function to get so we can get the 
        # action that the model should take and that is determined from the output of the self.model(Variable(state))*100) here we calling the 
        # feedforward explicitly we can do thi syntax because we only have one method, we wrap the input vector with the Variable class so we 
        # can feed it to the neural network, we multiply by 100 (the temperature parameter)so we can give the AI more exploring capabilities 
        # it is like giving it confidence, to explore, remember the softmax function returns the distribution probabilities of the Q-values 
        # (each Q-value has its own probability) the volatile is sat to True so we don't include the gradient when inputing the state in 
        # the model this will improve memory usage and make it more efficient 
        action = probs.multinomial(num_samples = len(probs)) # Here we are getting a random action from the softmax distribution and assign it as an action
        return action.data[0, 0] # returning the action that we want (0, 1 or 2) we get the action from the data tensor at index [0, 0]
    
    def learn(self, batch_states, batch_actions, batch_rewards, batch_next_states): # This function helps us to compute the temporal
        # difference which is the loss, which results in updating the weights with the optimizer we defined for the AI model, also in this
        # function we guide the AI to go for the actions with the highest awards, the batch_states is a batch of input states
        # the batch_actions parameter contains a batch of the actions played, the batch_rewards contains the batch of rewards received
        # the batch_next_states contains a batch of the next states reached 
        batch_outputs = self.model(batch_states).gather(1, batch_actions.unsqueeze(1)).squeeze(1) #Collecting the output from each batch
        # for each input state of the batch, the algorithm picks the Q-values associated to the action in the batch of actions (batch_actions)
        # Then we combine the two tensors to get the Q values to it's corresponding action in the batch of actions, and choose the best one.
        # we apply unsqueeze on the batch_actions because the neural network is expecting the forum of batch and data in two columns so it
        # can the same as batch_states and the squeeze is used to kill the batch column so we can give the pure outputs as is without
        # the batch column
        batch_next_outputs = self.model(batch_next_states).detach().max(1)[0] # Here we are computing max(Q(s(tb+1), a)) so we can
        # calculate the temporal difference, here we are giving the s(tb+1) to the model so we can get its output as part of the target
        # then using .detach().max(1)[0] to get the maximum of three predicted Q-values resulted from the model
        # and after doing that we will have the batch of the next outputs 
        batch_targets = batch_rewards + (self.gamma * batch_next_outputs) # Here we are computing the target that we will take as reference
        # to our accuracy from the formula R(st, a) +gamma*max(a)(Q(s(tb+1), a) which represents the real value in some sense 
        td_loss = F.smooth_l1_loss(batch_outputs, batch_targets) # Here we are calculating the loss between the target and the predicted values
        # smooth_l1_loss is the loss function of the Q_learning
        self.optimizer.zero_grad() # Here we are using the zero_grad() method to initialize all the gradients of the weights that used to calculate
        # the optimal value for the weights so we can have the lowest cost
        td_loss.backward(retain_graph = True) # then we back propagate through the weights and make the adjustments on them, here after setting
        # retain_variable to True we are freeing some memory through backpropagation 
        self.optimizer.step() # Here we are making the actual adjustments to the weights.
    
    def update(self, new_state, new_reward): # Here we are defining the update function that dynamically works with the learn method, the update 
        # method helps adjust the weights, it receives the new states and th new reward that according ot them the weights will be adjusted
        new_state = torch.Tensor(new_state).float().unsqueeze(0) # Here we converting the state into a tensor and unsqueeze the it to create
        # an additional dimension at index 0 corresponding to the batch, to ease future operations the elements should be converted to floats
        self.memory.push((self.last_state, torch.LongTensor([int(self.last_action)]), torch.Tensor([self.last_reward]), new_state)) # Here
        # we are using the push method so we can add the last state before the new state and the last action before the new state and the reward
        # before performing the last action, also the new state that we just reached, the LongTensor class create a tensor for integers only in
        # our case (0, 1, 2)
        new_action = self.select_action(new_state) # using the select_action from the DQN class to perform a new action from the new state reached
        if len(self.memory.memory) > 100: # here we check if the size of the memory is larger than 100 (the first memory is the Replay memory object
            # the second memory is the memory list that we have in that class) the 100 is the batch size and we make this batch to the AI to learn 
            # from
            batch_states, batch_actions, batch_rewards, batch_next_states = self.memory.sample(100) # here we are calling the sample method to return
            # four batches, that are the batch states that corresponds to the current state at which the transition occurred, the batch of actions
            # performed at batch_states, the rewards the are gained from the batch actions, and the next states batch the states reached after
            # playing the actions in batch actions.
            self.learn(batch_states, batch_actions, batch_rewards, batch_next_states) # here we calling the learn method so we can initiate the weight
            # update procedure
        self.last_state = new_state # here we update the last_state to be the new state that we reached so we can load to the memory
        self.last_action = new_action # here we update the last_action to be the new action that we reached so we can load to the memory
        self.last_reward = new_reward # here we update the last_reward to be the new reward that we reached so we can load to the memory
        self.reward_window.append(new_reward) # Here we appending every reward we make to the reward list to then visualize the average reward
        if len(self.reward_window) > 1000: # Here we are checking if the sliding window that we have for the rewards have the size of 1000 to know 
            # that we have covered 1000 rewards so far
            del self.reward_window[0] # deleting the first reward the AI earned
        return new_action # Here we return the action that we are going to perform
    
    
    def score(self):
        return sum(self.reward_window)/(len(self.reward_window)+1)
    
    def save(self):
        torch.save({'state_dict': self.model.state_dict(),# Here we save the parameter
                    'optimizer': self.optimizer.state_dict(), #Here we save the optimizer
                    }, 'last_brain.pth')
    
    def load(self):
        if os.path.isfile('last_brain.pth'):
            print("=> loading checkpoint...")
            checkpoint = torch.load('last_brain.pth')
            self.model.load_state_dict(checkpoint['state_dict'])
            self.optimizer.load_state_dict(checkpoint['optimizer'])
            print("done !")
        
        else:
            print("no checkpoint found...")