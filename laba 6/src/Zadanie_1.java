import java.util.*;
import static java.lang.Math.*;
public class Zadanie_1 {
    public static double chisl(int n) {
        double r=0;
        for (int i=1; i<=n; i++) {
            r+=cos(i);
        }
        return r;
    }
    public static double znam(int n) {
        double r=1;
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                r*=cos(i);
            }
            else {
                r*=sin(i);
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s = 0, s2=0;
        int n=1;
        System.out.println("Введите M");
        double  M = in.nextDouble();
        System.out.println("Введите N");
        double N = in.nextDouble();
        while (pow(-1,n-1)*(chisl(n)/znam(n))<M) {
            s+=pow(-1,n-1)*(chisl(n)/znam(n));
            n++;
        }
        for (n=1; n<N; n++) {
            s2+=pow(-1,n-1)*(chisl(n)/znam(n));
        }
        System.out.println(s2+" "+s);
    }
}