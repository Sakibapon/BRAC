# -*- coding: utf-8 -*-
"""
Created on Sun May 26 22:21:57 2019

@author: Musavvir
"""

year = int( input (" Please enter the year: "))

if (year % 4 == 0 and year % 100 != 0) or year % 400 == 0:
    print(year, " is a leap year ")
else:
    print (year, " is not a leap year ")