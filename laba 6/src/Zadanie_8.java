import java.util.Scanner;

public class Zadanie_8 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Введите переменную y");
        double y = var1.nextDouble();
        System.out.print(fm1(y)+fm2(y));
    }
    public static double fm1(double var2) {
        double var4 = 8;
        double var6 = (Math.pow(Math.sin(2.0 * var2 + 1.0), 2.0) + 0.3 * var2) / (Math.log10(var2 * var4 + 0.8 * var4) - Math.pow(Math.E, 2.0));
        return var6;
    }
    public static double fm2(double var2) {
        double var1 = 3;
        double var5 = 5;
        double var3 = 7;
        double var7 = (var1 * var5 + var3 * var5 / (Math.pow(var1, 2.0) + 4.0 * var1 + Math.E)) * ((2.0 * var1 + var3) / Math.pow(Math.E, 2.0 * Math.pow(var5, 2.0)) + Math.tan(Math.cos(Math.sin(var1 + var5 + var3))));
        return var7;
    }
}
