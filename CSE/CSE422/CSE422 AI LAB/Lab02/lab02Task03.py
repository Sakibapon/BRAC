# -*- coding: utf-8 -*-
"""
Created on Mon May 27 15:20:56 2019

@author: 16301119
"""
import numpy as np

wineReader = np.genfromtxt("wine.csv", delimiter=",", skip_header=2)
print(wineReader)