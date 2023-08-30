/*  Ninja has been assigned to convert temperature from Fahrenheit to Celsius. He has been given a starting Fahrenheit Value (S), ending Fahrenheit value (E), and step size (W). Unfortunately, he does not know how to convert from Fahrenheit to Celsius. Please help him to find the result. 
*/

import java.util.* ;

import java.io.*; 

public class Solution {
    public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
        List<List<Integer>> conversion = new ArrayList<>();
        for (int i = s; i <= e; i = i + w) {
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add((i - 32) * 5 / 9);
            conversion.add(temp);
        }
       return conversion;
    }

}