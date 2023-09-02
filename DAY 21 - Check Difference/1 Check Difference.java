/*  You are given an array 'ARR' of 'N' integers and a non-negative integer 'K'. Your task is to find if there exists two indices 'i' and 'j' such that ARR[i]-ARR[j] = K, given 'i' is not equal to 'j'. If there exist such indices you have to return TRUE else you have to return FALSE. According to the return value, 'YES' or 'NO' will be printed, 'YES' for TRUE and 'NO' for FALSE.
    For Example:
        1. ARR = [5,3,7,1] and K=2 We can see for i=1 and j =2, ARR[i]-ARR[j] = 2. So we will return TRUE.
        2. ARR = [-2,7,3,1,5] and K=10 We can see for any two indices it is not possible that the difference in their value is equal to K. So we will return FALSE.
*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean checkDiff(int[] arr, int N, int K){
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                if(arr[i] - arr[j] == K && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}