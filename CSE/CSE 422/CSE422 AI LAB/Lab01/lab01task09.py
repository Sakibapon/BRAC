num = [12, 56, 37, 82, 23, 17, 78, 91, 39, 11]
smallest = num[0]
largest = num[0]
sum = 0


for i in range(0, 10, 1):
    sum = sum + num[i]
    if num[i] < smallest:
        smallest = num[i]
    
    if num[i] > largest:
        largest = num[i]
        
        
average = sum/10
print("\ndifference between average and the smallest number", average-smallest)
print("\ndifference between average and the larget number", largest-average)

        
