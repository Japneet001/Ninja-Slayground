/*  You are given an integer n. 
    Your Task is to return an array containing integers from '1' to 'n' (in increasing order) without using loop. 
*/

import java.util.stream.IntStream;

public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        return IntStream.rangeClosed(1, x).toArray();
    }
}