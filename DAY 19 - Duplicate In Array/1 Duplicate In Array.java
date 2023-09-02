/*  You are given an array 'ARR' of size 'N' containing each number between 1 and 'N' - 1 at least once. There is a single integer value that is present in the array twice. Your task is to find the duplicate integer value present in the array.
    For example:
        Consider ARR = [1, 2, 3, 4, 4], the duplicate integer value present in the array is 4. Hence, the answe wer is 4 in this case.
    Note:
        A duplicate number is always present in the given array. 
*/

import java.util.ArrayList;

public class Solution {
    public static int findDuplicate(ArrayList<Integer> arr) {
        int sum = 0;
        for( int i = 1 ; i < arr.size() ; i++){
            sum += i;
        }
        int ans1 = 0;
        for( int i = 0 ; i < arr.size() ; i++){
            ans1 += arr.get(i);
        }
        return ans1 - sum;
    }
}