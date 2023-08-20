/*  Ayush is given a number 'X'. He has been told that he has to find first 'X' terms of the series 3*N+2, which are not multiples of 4. Help Ayush to find it as he has not been able to answer.
    Example: Given an 'X' = 4. The output array/list which must be passed to Ayush will be [5,11,14,17].
*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int N=1;
		int arr[]=new int[x];
		int i=0;
		while(i<x){
			int term=3*N+2;
			if (term%4!=0){
				arr[i]=term;
				N++;
				i++;
			}
			else{
				N++;
			}
		}
		return arr;
	}
}