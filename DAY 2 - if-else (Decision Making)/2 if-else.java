/*  Programming languages have some conditional/decision-making statements that execute when some specific condition is fulfilled.
    If-else is one of the ways to implement them.
        You are given two numbers 'a'and 'b'.
        Compare the numbers and print the relation.
        Print "smaller", "greater" or "equal" when 'a' is smaller than 'b', greater than 'b', or equal to 'b' respectively.  */
public class Solution {
    public static String compareIfElse(int a, int b) {
        if (a > b)
            return "greater";
        else if (a < b)
            return "smaller";
        else
            return "equal";
    }
}