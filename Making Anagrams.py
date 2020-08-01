#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the makeAnagram function below.
def makeAnagram(a, b):
    dicti={}
    count=0
    for i in a:
        if i in dicti:
            dicti[i]+=1
        else:
            dicti[i]=1
    for j in b:
        if j in dicti:
            dicti[j]-=1
        else:
            dicti[j]=-1
    for k in dicti:
        if dicti[k]!=0:
            count+=abs(dicti[k])
    return count

    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    res = makeAnagram(a, b)

    fptr.write(str(res) + '\n')

    fptr.close()
