import static java.lang.Math.*;
public class Zadanie_3 {
    public static void main(String[] args) {
        double a=0,b=0,c=0;
        for (int i=1; i<=8; i++) {
            for (int j=1; j<=i; j++) {
                a+=tan(pow(cos(j),2));
            }
            b+=a;
        }
        System.out.println(b);
        a=1;
        b=0;
        for (int i=1; i<=8; i++) {
            for (int j=1; j<=3; j++) {
                a*=pow(cos(j+i),j-i);
            }
            b+=a;
        }
        System.out.println(b);
        a=1;
        b=0;
        for (int i=1; i<=8; i++) {
            for (int j=i; j<=i; j++) {
                for (int k=1; k<=2*i+j; k++) {
                    a*=(2*tan(j+1)-3*log(sin(i-k)));
                }
                b+=a;
            }
            c+=b;
        }
        System.out.println(c);
    }
}
