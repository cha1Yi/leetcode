//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1556 👎 0


package com.shuzijun.leetcode.editor.en;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        final String s = solution.longestCommonPrefix(new String[]{"cir", "car"});
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            char[] result = new char[0];
            for (int strIndex = 0; strIndex < strs.length; strIndex++) {
                final String str = strs[strIndex];
                final int length = str.length();
                if (length == 0) {
                    return "";
                }
                int maxSameSize = 0;
                for (int charIndex = 0; charIndex < length; charIndex++) {
                    final char cur = str.charAt(charIndex);
                    //把第一个字符串当成比较模版
                    if (strIndex == 0) {
                        result = str.toCharArray();
                        break;
                    }
                    //如果索引下标越界，则跳出当前循环
                    if (charIndex >= result.length) {
                        break;
                    }
                    //如果元素相匹配，则索引+1,不匹配直接跳出循环
                    if (result[charIndex] != cur) {
                        break;
                    }
                    if (result[charIndex] == cur) {
                        maxSameSize++;
                    }
                }
                if (strIndex == 0) {
                    continue;
                }
                final char[] newResult = new char[maxSameSize];
                System.arraycopy(result, 0, newResult, 0, maxSameSize);
                result = newResult;
            }
            return String.valueOf(result);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
