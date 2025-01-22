package data_structure.p1_arrays;
/*
给你一个字符串 s ，请你反转字符串中 单词 的顺序。
单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
输入：s = "  hello world  "
输出："world hello"
解释：反转后的字符串中不能存在前导空格和尾随空格。
输入：s = "a good   example"
输出："example good a"
解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
作者：LeetCode
链接：https://leetcode.cn/leetbook/read/array-and-string/crmp5/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
public class Test11_Reverse_Words {
    public static void main(String[] args) {
//        String str = "  hello world  ";
        String str = "the sky is blue";
        System.out.println(str.length());
        String str_reverse_words = reverseWords(str);
        System.out.println(str_reverse_words);
        System.out.println(str_reverse_words.length());

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb + " world");
    }

    public static String reverseWords(String str){
        StringBuilder sb_all = new StringBuilder();
        StringBuilder sb_single = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                sb_single.append(str.charAt(i));
                if(i == str.length() - 1) {
                    sb_all.insert(0, sb_single + " ");
                }
            }else if(str.charAt(i) == ' ' & sb_single.length()==0){

            }else if(str.charAt(i) == ' ' & sb_single.length() != 0){
                sb_all.insert(0,sb_single + " ");
                sb_single.delete(0,sb_single.length());
            }
        }
        sb_all.deleteCharAt(sb_all.length()-1);
        return sb_all.toString();
    }
}
