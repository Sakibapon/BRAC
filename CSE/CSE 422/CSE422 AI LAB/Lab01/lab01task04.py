# -*- coding: utf-8 -*-
"""
Created on Sun May 26 22:10:43 2019

@author: Musavvir
"""

num = int( input ( "Please enter the number of copies to be printed: "))

if num > 100:
    print ("\n Total cost: ", 5000 + (num-100)*30)
else:
    print ("\n Total cost: ", num * 50)