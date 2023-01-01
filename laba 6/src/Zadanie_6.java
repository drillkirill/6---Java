import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_6 {
    public static boolean okr(double x, double y) {
        if (36 >= x*x + y*y & y <= 0) {
            return true;
        }
        return false;
    }
    public static boolean notDirHit(double x, double y) {
        if (4 > pow(x-3,2) + pow(y+2,2) || (y > 5*x - 5
                & y > -5/2*(x+5) & y > -5 & y < 0)) {
            return true;
        }
        return false;
    }
    public static boolean DirHit(double x, double y) {
        if (1 >= pow(x-3,2) + pow(y+2,2) ||
                1 >= pow(x+1,2) + pow(y+3,2) ||
                1 >= pow(x+3,2) + pow(y+1,2)) {
            return true;
        }
        return false;
    }
    public static void oblast(double x, double y) {
        if (okr(x,y)) {
            if (notDirHit(x,y)) {
                if (DirHit(x,y)) {
                    System.out.println("Попадание в фигуру");
                } else {
                    System.out.println("Не попала");
                }
            } else {
                System.out.println("Попадание в фигуру");
            }
        } else {
            System.out.println("Не попала");
        }
    }
    public static void main(String[] args) {
        double x=0, y=0;
        Scanner in = new Scanner(System.in);
        boolean stop=false;
        while (!stop) {
            System.out.println("Введите \"stop\", если хотите прекратить поиск координат.");
            String vvod = in.nextLine();
            if (vvod.equals("stop")) {
                stop = true;
            } else {
                System.out.println("Введите координаты х");
                x = Double.parseDouble(in.nextLine());
                System.out.println("Введите координаты y");
                y = Double.parseDouble(in.nextLine());
                oblast(x,y);
            }
        }
    }
}