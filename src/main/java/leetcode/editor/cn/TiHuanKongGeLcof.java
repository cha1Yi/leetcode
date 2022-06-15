//////////请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//////////
////////// 
//////////
////////// 示例 1： 
//////////
////////// 输入：s = "We are happy."
//////////输出："We%20are%20happy." 
//////////
////////// 
//////////
////////// 限制： 
//////////
////////// 0 <= s 的长度 <= 10000 
////////// Related Topics字符串 
//////////
////////// 👍 297, 👎 0 
//////////
//////////
//////////
//////////
////////
//////
////
//


package leetcode.editor.cn;

public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        String s = solution.replaceSpace("We are happy.");
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //内存使用率高
//        public String replaceSpace(String s) {
//            String replaceElement = "%20";
//            StringBuffer stringBuffer = new StringBuffer();
//            char[] chars = s.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if (chars[i] == ' ') {
//                    stringBuffer.append(replaceElement);
//                } else {
//                    stringBuffer.append(chars[i]);
//                }
//            }
//            return stringBuffer.toString();
//        }

        //执行时间慢,内存使用率高
//        public String replaceSpace(String s) {
//            return s.replaceAll(" ","%20");
//        }

//        //
//        public String replaceSpace(String s) {
//            String replaceElement = "%20";
//            char[] chars = s.toCharArray();
//            char[] res = new char[s.length()];
//            int resIndex = 0;
//            for (int i = 0; i < chars.length; i++) {
//                char aChar = chars[i];
//                if (aChar != ' ') {
//                    res[resIndex] = aChar;
//                    resIndex++;
//                    continue;
//                }
//                res = Arrays.copyOf(res, replaceElement.length()+res.length-1);
//                for (char c : replaceElement.toCharArray()) {
//                    res[resIndex] = c;
//                    resIndex++;
//                }
//            }
//            return String.valueOf(res);
//        }

        /**
         * 大神解法
         */
        public String replaceSpace(String s) {
            String replaceElement = "%20";
            char[] temp = new char[s.length()*3];
            int size = 0;

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar != ' '){
                    temp[size] = aChar;
                    size++;
                    continue;
                }
                for (int i1 = 0; i1 < replaceElement.toCharArray().length; i1++) {
                    temp[size] = replaceElement.charAt(i1);
                    size++;
                }
            }
            return new String(temp,0,size);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}