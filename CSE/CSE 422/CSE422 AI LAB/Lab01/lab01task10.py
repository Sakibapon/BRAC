import math

a = int (input ("Please enter the size of the one side of the triangle"))
b = int (input ("Please enter the size of the another side of the triangle"))
c = int (input ("Please enter the size of the remaining side of the triangle"))

s = (a + b + c) / 2

area = math.sqrt(s * (s-a) * (s-b) * (s-c))
print ("\n The area of the triangle is ", area)