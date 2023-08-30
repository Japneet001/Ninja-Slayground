/*  You are given a sorted integer array 'arr' of size 'n'. You need to remove the duplicates from the array such that each element appears only once. Return the length of this new array. 
*/

import java.util.ArrayList;
public class Solution {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        // Write your code here.
        int count = 1;
        for(int i = 0 ; i < n ; i++){
            int j = arr.get(i);
            if(i == n-1 || arr.get(i+1) == j){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}