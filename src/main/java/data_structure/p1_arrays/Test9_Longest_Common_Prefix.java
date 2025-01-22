package data_structure.p1_arrays;

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
        System.out.println("str:" + longestCommonPrefix(strs));

        String[] strs2 = {"flink","france","flight"};
        System.out.println("str2:" + longestCommonPrefix(strs2));

        String[] strs1 = {"abc","def","ghi"};
        System.out.println("str1:" + longestCommonPrefix(strs1));

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        char cha;
        while(true){
            if(strs[0].length() == i){
                return sb.toString();
            }else{
                cha = strs[0].charAt(i);
            }

            for (String s:strs) {

                if (i==s.length()){
                    return sb.toString();
                }

                if(cha != s.charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(cha);
            i++;
        }
    }
}
