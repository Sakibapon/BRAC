# -*- coding: utf-8 -*-
"""
Created on Mon May 27 15:00:41 2019

@author: 16301119
"""
import numpy as np

z = np.zeros((1, 10))
o = np.ones((1, 10))

z = z.reshape(2,5)
o = o.reshape(2, 5)

temp1 = np.concatenate((z, o), axis = 0)
print(temp1)

print("\n\n")
temp2 = np.concatenate((o, z), axis = 1)
print(temp2)