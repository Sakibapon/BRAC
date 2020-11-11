# -*- coding: utf-8 -*-
"""
Created on Wed Nov 11 01:06:12 2020

@author: Sakib
"""

import re
r=open('AA.txt')
w=r.read()
#a=re.findall('[Aa]+[Pp]+\S+[$Nn]', w)
# print(a)
#w=str(['Apon','aponn','aPan','apian','APuN','sakib','aPiN'])
a=re.findall('[Aa]+[Pp]+\S+[$Nn]', w)
print(a)

'''This Simple code opens up a .txt file which contains
Apon
aponnn
apan
apian
APuN
Sakib
aPin
APON
18301297
With Regular Expression it matches
['Apon', 'aponnn', 'apan', 'apian', 'APuN', 'aPin', 'APON']'''