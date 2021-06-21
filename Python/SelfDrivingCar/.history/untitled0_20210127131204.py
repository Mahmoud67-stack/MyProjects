# -*- coding: utf-8 -*-
"""
Created on Sat Jan 23 17:29:25 2021

@author: hp
"""
from tensorflow.python.client import device_lib 

print(device_lib.list_local_devices())

