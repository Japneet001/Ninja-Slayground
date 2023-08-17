''' You are given an integer 'n'.
    Your task is determining the sum of the first 'n' natural numbers and returning it.
'''

from typing import List

def sumFirstN(n: int) -> int:
    # Write your code here.
    return (n*(n+1)//2)
    pass