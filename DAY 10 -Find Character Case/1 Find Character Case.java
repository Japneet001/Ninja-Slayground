/*  You are given a character 'CH' as input, return either 1, 0 or -1 according to the following rules:
        1, if the character is an uppercase alphabet (A - Z).
        O, if the character is a lowercase alphabet (a - z).
        -1, if the character is not an alphabet.
    For Example:
        If 'CH' = 'a', then since it is a lowercase letter, your program should return 0.
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findCase(char ch) {
        if (Character.isLowerCase(ch)){
            return 0;
        }
        else if (Character.isUpperCase(ch)){
            return 1;
        }
        return -1;
        // Write your code here.
    }
}