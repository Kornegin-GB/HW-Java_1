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
      s = s.replaceAll("[^A-Za-z0-9]", "");
      StringBuilder sb = new StringBuilder();
      boolean palindrom = true;
      for (int i = 0; i < s.length(); i++) {
         sb.append(Character.toLowerCase(s.charAt(i)));
      }
      System.out.println(sb.toString());
      int start = 0;
      int end = sb.toString().length() - 1;
      while (end > start) {
         if (sb.toString().charAt(start++) != sb.toString().charAt(end--)) {
            palindrom = false;
         }
      }
      return palindrom;
   }
}
