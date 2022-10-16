/* 
 * 151. Reverse Words in a String (LeetCode)
 */
package HW_Java_1;

public class Task_2 {
   public static void main(String[] args) {
      String str = "the sky is blue";
      System.out.println('"' + reverseWords(str) + '"');

      System.out.println();
      str = "  hello world  ";
      System.out.println('"' + reverseWords(str) + '"');

      System.out.println();
      str = "a good example";
      System.out.println('"' + reverseWords(str) + '"');
   }

   public static String reverseWords(String s) {
      StringBuilder sp = new StringBuilder();
      int j = 0, k = 0;
      for (int i = s.length() - 1; i >= 0; i--) {
         // Подсчитываем количество пробелов в начале
         while (i >= 0 && s.charAt(i) == ' ') {
            i--;
         }
         j = i;
         while (i >= 0 && s.charAt(i) != ' ') {
            i--;
         }
         k = i + 1;
         while (k <= j) {
            sp.append(s.charAt(k));
            k++;
         }
         // Подсчитываем количество пробелов в конце
         while (i >= 0 && s.charAt(i) == ' ') {
            i--;
         }
         if (i != -1)
            sp.append(' ');
         i += 1;
      }
      return sp.toString();
   }
}
