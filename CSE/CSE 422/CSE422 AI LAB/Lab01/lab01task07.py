# -*- coding: utf-8 -*-
"""
Created on Sun May 26 20:37:09 2019

@author: Musavvir
"""
import math

c = int (input ("Please enter the year you were born in: "))

d = math.sqrt(1+4*c)

x1= (d + 1)/2
print( "\nI will be ", int(x1), "years old in the year ", int(x1*x1))