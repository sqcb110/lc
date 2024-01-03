package data_structrue.p1_arrays;

public class Test11_Reverse_Words_Standard {
    public static void main(String[] args) {

    }

    public static String reverseWords(String s) {
        //从后往前遍历字符数组，跳过空格，得到单词，填充新数组
        char[] initialArr = s.toCharArray();//原字符数组
        //新的用来填充的字符数组，最后只返回有效长度。填充的时候会在每个单词末尾加上空格，所以长度比原数组增加1，防止溢出
        char[] newArr = new char[initialArr.length + 1];
        int newArrPos = 0;//记录新数组有效元素的长度
        int i = initialArr.length - 1;
        while (i >= 0) {
            while (i >= 0 && initialArr[i] == ' ') {i--;}//跳过空格，找到每个单词的末尾
            if (i < 0) {
                break;
            }
            int right = i;//记录每个单词末尾的索引
            while (i >= 0 && initialArr[i] != ' ') {i--;}//找到每个单词的开头
            for (int j = i + 1; j <= right; j++) {
                newArr[newArrPos++] = initialArr[j];
                if (j == right) {
                    newArr[newArrPos++] = ' ';//每个单词结束后在末尾加上空格
                }
            }
        }
        return new String(newArr, 0, newArrPos - 1);
    }
}
