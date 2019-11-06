#!/bin/python3

import math
import os
import random
import re

# Complete the hourglassSum function below.
def hourglassSum(arr):
  largestSum = -64
  for i in range(6):
    for j in range(6):
      if(i == 0 or i == 5 or j == 0 or j == 5):
        continue
      currentSum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]
      if currentSum > largestSum:
        largestSum = currentSum
  return largestSum

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    # fptr.write(str(result) + '\n')

    # fptr.close()
