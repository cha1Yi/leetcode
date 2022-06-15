//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
// Related Topics数组 | 双指针 | 排序 
//
// 👍 230, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import utils.Printer;

import java.util.Arrays;

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        int[] exchange = solution.exchange(new int[]{2, 16, 3, 5, 13, 1, 16, 1, 12, 18, 11, 8, 11, 11, 5, 1});
        String array = Printer.printIntArray(exchange);
        System.out.println(array);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exchange(int[] nums) {
            int leftIndex = 0;

            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                if (nums[leftIndex] % 2 == 0) {
                    cwp(nums, leftIndex, rightIndex);
                    rightIndex--;
                    continue;
                }
                leftIndex++;
            }
            return nums;
        }

        /**
         * 数组元素未知交换
         *
         * @param nums        数组
         * @param index       需要交换的坐标
         * @param targetIndex 交换的目标坐标
         */
        public void cwp(int[] nums, int index, int targetIndex) {
            int temp = nums[index];
            nums[index] = nums[targetIndex];
            nums[targetIndex] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}