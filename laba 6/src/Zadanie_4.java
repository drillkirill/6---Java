import java.util.*;

public class Zadanie_4 {
    public static double perevod(double x,int s) {
        String x2 = "0.";
        for (int a=0; a<10; a++) {
            x=x*s-(int)x*s;
            x2+=Integer.toString((int)x);
        }
        return Double.parseDouble(new StringBuilder(x2).toString());
    };
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=0;
        while (a>=1 | a<=0) {
            System.out.println("Введите число (0<s<1)");
            a=in.nextDouble();
        }
        int s=0;
        while (s<1 | s>10) {
            System.out.println("Введите систему счисления (1<=s<=10)");
            s=in.nextInt();
        }
        System.out.println(perevod(a,s));
    }
}
