package data_structrue.p1_arrays;
import java.util.ArrayList;
public class Axial_Symmetry_Enum {
    public static void main(String[] args) {
        //A点坐标(a1,a2)，B点坐标(b1,b2)
        double a1 = 1.0, a2 = 1.0, b1 = 2.0, b2 = 4.0;
        if ((a1 == b1 && (a1 + b1) % 2 == 0) || (a2 == b2 && (a2 + b2) % 2 == 0)) {
            System.out.println("C的坐标有无数个");
        } else {
            System.out.println("坐标个数为：" + getLoc(a1, a2, b1, b2).size());
            System.out.println("坐标为：" + getLoc(a1, a2, b1, b2));
        }
    }
    public static ArrayList<String> getLoc(double a1, double a2, double b1, double b2) {
        int x = 0;
        int y = 0;
        if (a1 != b1 && a2 != b2) {
            x = (int) Math.round((a1 + b1) / 2 + (a2 + b2) * (b2 - a2) / 2 * (b1 - a1));
            y = (int) Math.round((a2 + b2) / 2 + (a1 + b1) * (b1 - a1) / 2 * (b2 - a2));
        }
        ArrayList<String> loc_c = new ArrayList<>();
        for (int i = 1; i <= Math.max(a1 + a2 + b1 + b2, x); i++) {
            for (int j = 1; j <= Math.max(a1 + a2 + b1 + b2, y); j++) {
                if (((Math.pow((b1 - a1), 2) + Math.pow((b2 - a2), 2) == Math.pow((i - a1), 2) + Math.pow((j - a2), 2)) ||
                        Math.pow((b1 - a1), 2) + Math.pow((b2 - a2), 2) == Math.pow((i - b1), 2) + Math.pow((j - b2), 2) ||
                        Math.pow((b1 - i), 2) + Math.pow((b2 - j), 2) == Math.pow((a1 - i), 2) + Math.pow((a2 - j), 2)
                )
                        && !(
                        ((a1 - b1) == (b1 - i) && (a2 - b2) == (b2 - j)) ||
                                ((a1 - i) == (i - b1) && (a2 - j) == (j - b2)) ||
                                ((b1 - a1) == (a1 - i) && (b2 - a1) == (a2 - j)) ||
                                (((i - a1) == 0 && (j - a2) == 0)) || ((i - b1) == 0 && (j - b2) == 0))
                ) { loc_c.add("(" + i + "," + j + ")");}
            }
        }
        return loc_c;
    }
}
