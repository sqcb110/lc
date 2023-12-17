package data_structrue.p1_arrays;

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
输入：strs = ["flower","flow","flight"]
输出："fl"
输入：strs = ["dog","racecar","car"]
输出：""
*/

public class Test9_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (true) {
            char cmpChar = '0';
            for (String s :
                    strs) {
                if (i == s.length()) {
                    return sb.toString();
                }

                char c = s.charAt(i);
                if (cmpChar == '0') {
                    cmpChar = c;
                    continue;
                }

                if (cmpChar != c) {
                    return sb.toString();
                }
            }

            sb.append(cmpChar);
            i++;
        }
    }
}
