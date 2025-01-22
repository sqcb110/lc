package data_structure.p1_arrays;

/*
文本串和模式串暴力匹配
*/

public class Test1_Violent_Match {
    public static void main(String[] args) {
        String sstr = "ababcabcd";
        String pstr = "abc";

        int index = violentMatch(sstr.toCharArray(),pstr.toCharArray());
        System.out.println(index);

    }

    public static int violentMatch(char[] s,char[] p){
        int sLen = s.length;
        int pLen = p.length;

        int i = 0;
        int j = 0;

        while(i < sLen && j < pLen){
            if(s[i] == p[j]){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        if(j==pLen){
            return i-j;
        }else {
            return -1;
        }
    }
}
