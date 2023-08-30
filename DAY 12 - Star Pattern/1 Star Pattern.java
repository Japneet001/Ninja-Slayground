/* Print the following pattern Pattern For N = 4
            ...*
            ..***
            .*****
            *******
The Dots Represent Spaces. 
*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void printPattern(int n){
		// Write your code here.
		for (int i = 1 ; i <= n; i++){
			for (int j = 1 ; j <= n-i; j++){
				System.out.print(" ");
			}
			for (int k = 1 ; k <= 2*i-1 ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}