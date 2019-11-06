#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
  numOfA = 0
  if(len(s) >= n):
    for i in range(n):
      if s[i] == 'a':
        numOfA += 1
    return numOfA
  # truncate division (returns floor)
  reps = n // len(s)
  prefix = s.count('a') * reps
  suffix = s[:n % len(s)].count('a')
  numOfA = prefix + suffix
  return numOfA

if __name__ == '__main__':
  # fptr = open(os.environ['OUTPUT_PATH'], 'w')

  s = input()

  n = int(input())

  result = repeatedString(s, n)
  print(result)

  # fptr.write(str(result) + '\n')

  # fptr.close()
