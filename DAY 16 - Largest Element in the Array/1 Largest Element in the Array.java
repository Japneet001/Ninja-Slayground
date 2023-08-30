/*  Given an array 'arr' of size 'n' find the largest element in the array.
    Example:
        Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
        Output: 5
        Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
*/

import java.util.* ;
import java.io.*;

public class Solution {
    static int largestElement(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            int temp=arr[i];
            while(j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        return arr[arr.length-1];
    }
}