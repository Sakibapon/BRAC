# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import numpy as np

def factorial (n):
    if n == 1:
        return 1
    else:
        return n*factorial(n-1)

n1 = int(input("Input a number to compute the factiorial : "))
n2 = int(input("Input a number to compute the factiorial : "))
n3 = int(input("Input a number to compute the factiorial : "))
n4 = int(input("Input a number to compute the factiorial : "))
n5 = int(input("Input a number to compute the factiorial : "))

a = np.array([n1, n2, n3, n4, n5])

for i in range(0, a.size, 1):
    temp = factorial(a[i])
    print("\n ",temp)
    


