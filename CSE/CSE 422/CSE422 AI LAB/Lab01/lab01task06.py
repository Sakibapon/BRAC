# -*- coding: utf-8 -*-
"""
Created on Sun May 26 22:17:43 2019

@author: Musavvir
"""

c = 0
sum = 0

for i in range (1, 100):
    if i % 3 == 0:
        sum = sum + i;
        c = c + 1;
print("\n Average of all the numbers divisible by 3 and less than 100 : ", sum/c)