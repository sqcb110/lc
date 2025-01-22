package data_structure.p1_arrays;

public class Test12_KMP_Match {
    public static void main(String[] args) {
        String sstr = "ababcabcd";
        String pstr = "abc";

        int index = kmpMatch(sstr.toCharArray(),pstr.toCharArray());
        System.out.println(index);

    }

    public static int kmpMatch(char[] s,char[] p){
        int sLen = s.length;
        int pLen = p.length;

        int i = 0;
        int j = 0;

        int[] next = getNext(p);

        while(i < sLen && j < pLen){
            if(j == -1 || s[i] == p[j]){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }
        if(j==pLen)
            return i-j;
        else
            return -1;
    }

    public static int[] getNext(char[] p){
        int[] next = new int[p.length];
        int pLen = p.length;
        next[0] = -1;
        int j = 0;
        int k = -1;

        while(j < pLen -1){
            if(k == -1 || p[j] == p[k]){
                j++;
                k++;
                next[j] = k;
            }else{
                k = next[k];
            }
        }

        return next;
    }
}
























