import pandas as pd

initial_deposites = 10
dataset = pd.read_csv("real_change (1).csv").iloc[:, 1].values
invest = pd.read_csv("change.csv")
invest = invest.iloc[:, 1].values

for i in range(len(invest)):
    if(invest[i]):
        if(dataset[i]>0):
            initial_deposites *= (1- abs(dataset[i]))
        else:
            initial_deposites *= (1+dataset[i])

print("The deposites are = ", initial_deposites)
