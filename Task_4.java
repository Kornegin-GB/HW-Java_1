/* 
 * 27. Remove Element (LeetCode)
 */
package HW_Java_1;

import java.util.Arrays;

public class Task_4 {
   public static void main(String[] args) {
      int[] arr = { 3, 2, 2, 3 };
      int val = 3;
      System.out.println(removeElement(arr, val));

      int[] arr1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
      val = 2;
      System.out.println(removeElement(arr1, val));
   }

   public static int removeElement(int[] nums, int val) {
      int count = 0;
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] != val) {
            nums[count] = nums[i];
            count++;
         }
      }
      System.out.println(Arrays.toString(nums));
      return count;
   }
}
