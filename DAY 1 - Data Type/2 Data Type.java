/*  Data type refers to the type of value a variable has and the way the computer interprets it.
    Each data type has a different size. You've studied 5 different data types and the sizes of the data types:
        Integer: 4 bytes
        Long: 8 bytes
        Float: 4 bytes 
        Double: 8 bytes
        Character: 1 byte
    You're given a data type. Print its size in bytes. 
*/

public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        char ch = type.charAt(0);
        switch (ch) {
            case 'I':
                return 4;
            case 'L':
                return 8;
            case 'F':
                return 4;
            case 'D':
                return 8;
            case 'C':
                return 1;
        }
        return 0;
    }
}