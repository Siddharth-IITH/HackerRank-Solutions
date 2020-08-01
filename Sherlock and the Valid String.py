#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the isValid function below.
def isValid(s):
    d=dict()
    for i in s:
        if i not in d:
            d[i]=1
        else:
            d[i]+=1
    default=d[s[0]]
    for i in d:
        d[i]-=default
    count=0
    for i in d:
        if d[i]!=0:
            count+=1
    if count>1:
        return "NO"
    else:
        return "YES"
        

        



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = isValid(s)

    fptr.write(result + '\n')

    fptr.close()
