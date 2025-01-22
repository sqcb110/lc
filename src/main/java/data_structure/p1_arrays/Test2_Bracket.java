package data_structure.p1_arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。

示例 1：输入：s = "()" 输出：true
示例 2：输入：s = "()[]{}" 输出：true
示例 3：输入：s = "(]" 输出：false
* */

public class Test2_Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = sc.next();
        String s = "()[]{}";
        //System.out.println(s.length());
        System.out.println(checkString(s));

    }

    public static boolean checkString(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        ArrayList arr = new ArrayList();
        for (int i = 0; i < str.length(); i += 2) {
            str.charAt(i);
            arr.add(String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1)));
            if (arr.get(arr.size() - 1).equals("()")||arr.get(arr.size() - 1).equals("[]")||arr.get(arr.size() - 1).equals("{}")){
                arr.remove(arr.size() - 1);
            }
        }

        if (arr.size() != 0) {
            return false;
        } else {
            return true;
        }

    }
}
