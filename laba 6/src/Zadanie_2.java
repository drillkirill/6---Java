import java.util.*;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        System.out.println("Введите натуральное N");
        int n = in.nextInt();
        while (n!=1) {
            if (n%2==0) {
                n/=2;
            } else {
                n=(n*3+1)/2;
            }
            s+=1;
        }
        System.out.println("Количество шагов "+s);
    }
}
