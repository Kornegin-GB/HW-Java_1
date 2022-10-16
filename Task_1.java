/* 
 * 88. Merge Sorted Array (LeetCode)
 */
package HW_Java_1;

import java.util.Arrays;

public class Task_1 {
   public static void main(String[] args) {
      int[] nums1 = { 1, 2, 3, 0, 0, 0 };
      int m = 3;
      int[] nums2 = { 2, 5, 6 };
      int n = 3;
      merge(nums1, m, nums2, n);

      System.out.println();
      int[] nums3 = { 1 };
      m = 1;
      int[] nums4 = {};
      n = 0;
      merge(nums3, m, nums4, n);

      System.out.println();
      int[] nums5 = { 0 };
      m = 0;
      int[] nums6 = { 1 };
      n = 1;
      merge(nums5, m, nums6, n);
   }

   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] arr = nums1.clone();
      int write = 0;
      int i = 0;
      int j = 0;
      while (write < nums1.length) {
         if (j < n) {
            if (arr[i] <= nums2[j] && arr[i] != 0) {
               nums1[write] = arr[i++];
            } else {
               nums1[write] = nums2[j++];
            }
         } else {
            nums1[write] = arr[i++];
         }
         write++;
      }
      Arrays.sort(nums1);
      // Вывод
      System.out.println(Arrays.toString(nums1));
   }
}
