/* 
 * 125. Valid Palindrome (LeetCode)
 */
package HW_Java_1;

public class Task_3 {
   public static void main(String[] args) {
      String s = "A man, a plan, a canal: Panama";
      System.out.println(isPalindrome(s));

      s = "race a car";
      System.out.println(isPalindrome(s));

      s = " ";
      System.out.println(isPalindrome(s));
   }

   public static boolean isPalindrome(String s) {
      if (s.length() > Integer.MAX_VALUE) {
         return false;
      }
      s = s.toLowerCase();
      int start = 0;
      int end = s.length() - 1;
      if (s.length() == 1) {
         return true;
      }
      while (start < end) {
         if (!Character.isLetterOrDigit(s.charAt(start))) {
            start++;
         } else if (!Character.isLetterOrDigit(s.charAt(end))) {
            end--;
         } else {
            if (s.charAt(start) != s.charAt(end)) {
               return false;
            }
            start++;
            end--;
         }
      }
      return true;
   }
}
