package data_structrue.p1_arrays;
/*给你一个字符串 s，找到 s 中最长的回文子串。
如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
*/

public class Test10_Longest_Palindrome {
    public static void main(String[] args) {
        String s = "babad";
        String subs = longestPalindrome(s);
        System.out.println(subs);
    }

    public static String longestPalindrome(String str){
        //整型数组记录开始、结尾、长度
        int[] pal = {0,0,0};
        for (int i = 1; i < pal.length - 1; i++) {
            boolean dan = true;
            boolean shuang = true;
            int bigin_dan = i;
            int end_dan = i;
            int bigin_shuang = i + 1;
            int end_shuang = i;
            //长度为奇数的回文子串：
            while(dan){
                bigin_dan -= 1;
                end_dan += 1;
                if(bigin_dan >=0 && end_dan <= str.length() - 1  && str.charAt(bigin_dan)==str.charAt(end_dan) && end_dan + 1 - bigin_dan > pal[2]){
                    pal[0] = bigin_dan;
                    pal[1] = end_dan;
                    pal[2] = end_dan + 1 -bigin_dan;
                }else{
                    dan = false;
                }
            }
            //长度为偶数的回文子串：
            while(shuang){
                bigin_shuang -= 1;
                end_shuang += 1;
                if(bigin_shuang >=0 && end_shuang <= str.length() - 1  && str.charAt(bigin_shuang)==str.charAt(end_shuang) && end_dan + 1 - bigin_dan > pal[2]){
                    pal[0] = bigin_shuang;
                    pal[1] = end_shuang;
                    pal[2] = end_shuang + 1 -bigin_shuang;
                }else{
                    shuang = false;
                }
            }
        }

        return str.substring(pal[0],pal[1]+1);
    }
}
