"""  Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.
    Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.
"""

## Note : For printing multiple values in one line, put them inside print separated by space.
## You can follow this syntax for printing values of two variables val1 and val2 separaetd by space -
## print(val1, " ", val2)

n=int(input())
sum_even=0
sum_odd=0
while (n>0):
    rem=int(n%10)
    if (rem%2==0):
        sum_even+=rem
    else:
        sum_odd+=rem
    n=n//10
print(sum_even," ",sum_odd)