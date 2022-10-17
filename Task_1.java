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

      System.out.println();
      int[] nums7 = { 2, 0 };
      m = 1;
      int[] nums8 = { 1 };
      n = 1;
      merge(nums7, m, nums8, n);

      int[] nums9 = { 1, 2, 3, 0, 0, 0 };
      m = 3;
      int[] nums10 = { 4, 5, 6 };
      n = 3;
      merge(nums9, m, nums10, n);
   }

   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int write = m + n - 1;
      int first = m - 1;
      int second = n - 1;
      while (write > 0 && second >= 0 && first >= 0) {
         if (nums1[first] < nums2[second]) {
            nums1[write--] = nums2[second--];
         } else {
            nums1[write--] = nums1[first--];
         }
      }
      while (write > 0) {
         if (second > 0) {
            nums1[write--] = nums2[second--];
         } else if (first > 0) {
            nums1[write--] = nums1[first--];
         }
      }
      if (second < 0) {
         nums1[0] = nums1[0];
      } else if (first < 0) {
         nums1[0] = nums2[0];
      }
      // Вывод
      System.out.println(Arrays.toString(nums1));
   }
}
