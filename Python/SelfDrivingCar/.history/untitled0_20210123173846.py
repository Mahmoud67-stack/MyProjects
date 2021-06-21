# -*- coding: utf-8 -*-
"""
Created on Sat Jan 23 17:29:25 2021

@author: hp
"""


l = []

for i in range(1000000):
    l.append([])
    for j in range(1000000):
        l[i].append([])
        for k in range(1000000):
            l[i][j].append(i)
