''' Ninja loves playing with numbers. So one day, he wants to arrange a few numbers in the 'N' number of rows. The first row contains 1 number, the second row has two numbers, the third row has 3 digits, and so on.
    Ninja starts placing numbers in increasing order, with absolute difference 1, starting from 1 and continuing till he encounters 9, and then he again restarts from 1.
    You are given an integer 'N' denoting the given number of rows. Can you print the pattern that Ninja wants to create?
    Pattern for N = 4:
                   1
                  23
                 456
                7891
'''

from os import *
from sys import *
from collections import *
from math import *

def numberPattern(n):
    a = 1
    b = []
    for i in range(n - 1, -1, -1):
        c = []
        for j in range(n):
            if j < i:
                c.append(-1)
            else:
                c.append(a)
                a += 1
                if a == 10:
                    a = 1
        b.append(c)
    return b