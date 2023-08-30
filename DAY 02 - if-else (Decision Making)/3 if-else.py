# Programming languages have some conditional/decision-making statements that execute when some specific condition is fulfilled.
#     If-else is one of the ways to implement them.
#         You are given two numbers 'a'and 'b'.
#         Compare the numbers and print the relation.
#         Print "smaller", "greater" or "equal" when 'a' is smaller than 'b', greater than 'b', or equal to 'b' respectively. 

from typing import *

def compareIfElse(a: int, b: int):
    # Write your code here
    if (a>b):
        return "greater"
    elif (a==b):
        return "equal"
    else:
        return "smaller"