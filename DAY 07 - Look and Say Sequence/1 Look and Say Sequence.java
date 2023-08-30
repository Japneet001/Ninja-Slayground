/*  The Look-And-Say sequence is a sequence of positive integers. 
    The sequence is as follows:
        1, 11, 21, 1211, 111221, 312211, 13112221,...
        This sequence is constructed in the following way:
            The first number is 1.
            This is read as "One 1".
            Hence, the second number will be 11.
            The second number is read as "Two 1s”. Hence, the third number will be 21.
            The third number is read as "One 2, One 1".
            Hence, the fourth number will be 1211. And so on.
            The fourth term is read as "One 1, One 2, Two 1s".
            Hence, the fifth term will be 111221. And so on.
    Given an integer N, find the Nth term of the sequence. 
*/
public class Solution {
	public static String lookAndSaySequence(int n) {
		StringBuilder sb = new StringBuilder("1");

    while (--n > 0) {
      StringBuilder next = new StringBuilder();
      for (int i = 0; i < sb.length(); ++i) {
        int count = 1;
        while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
          ++count;
          ++i;
        }
        next.append(count).append(sb.charAt(i));
      }
      sb = next;
    }

    return sb.toString();
	}
}