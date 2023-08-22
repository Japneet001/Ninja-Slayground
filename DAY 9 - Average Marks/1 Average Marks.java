/*  You are given the name of a student in the form of a character 'firstLetterOfName' and 3 integers 'M1', 'M2', 'M3' representing the marks of the student in 3 subjects. You have to print the 'firstLetterOfName' of the student and the average marks obtained by the student.
    Note: You need to print the integer part of the average only and neglect the decimal part. 
    For Example:
        If 'firstLetterOfName' = 'K', ‘M1′ = 10, ‘M2' = 6 and 'M3' = 9, then the average marks would be around 7.67. Hence, the output should be as follows:
        K 7
*/

import java.util.* ;
import java.io.*; 
/*******************************************
 *
 *   Following is the Pair class structure
 *
 *   class Pair{
 *
 *       char firstLetterOfName;
 *       int avgMarks;
 *
 *       Pair(char firstLetterOfName, int avgMarks){
 *           this.firstLetterOfName = firstLetterOfName;
 *           this.avgMarks = avgMarks;
 *       }
 *   } 
 *
 **********************************************/


public class Solution {
	public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
		// Write your code here.
		int total = (m1+m2+m3)/3;
		return new Pair (firstLetterOfName,total);
	}
}


