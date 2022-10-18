/* 
 * 151. Reverse Words in a String (LeetCode)
 */
package HW_Java_1;

public class Task_2 {
   public static void main(String[] args) {
      String str = "the sky is blue";
      System.out.println('"' + reverseWords(str) + '"');

      System.out.println();
      str = " hello world ";
      System.out.println('"' + reverseWords(str) + '"');

      System.out.println();
      str = "a good example";
      System.out.println('"' + reverseWords(str) + '"');

      System.out.println();
      str = "EPY2giL";
      System.out.println('"' + reverseWords(str) + '"');
   }

   public static String reverseWords(String s) {
      StringBuilder sb = new StringBuilder();
      int start = 0;
      int end = 0;
      for (int i = s.length() - 1; i >= 0; i--) {
         if (Character.isLetterOrDigit(s.charAt(i)) && start >= end) {
            end = i;
            if (!sb.isEmpty()) {
               sb.append(" ");
            }
         } else if (!Character.isLetterOrDigit(s.charAt(i)) && start < end) {
            start = i + 1;
            while (end >= start) {
               sb.append(s.charAt(start++));
            }
            start = 0;
            end = 0;
         }
      }
      while (start <= end && Character.isLetterOrDigit(s.charAt(start))) {
         sb.append(s.charAt(start++));
      }
      return sb.toString();
   }
}
