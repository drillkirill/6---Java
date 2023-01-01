import static java.lang.Math.*;

public class Zadanie_10 {
    public static void main(String[] args) {
        double sum;
        double h;
        for(double n = 10;n <= 10000; n *= 10){
            h = 1/n;
            sum = 0;
            for (int i = 0; i < n; i++){
                sum += log(abs(pow(n-h*i,2)-5*(n-h*i))+5*sin(n-h*i)) * h;
            }
            System.out.println(n + "\n" + h + "\n" + sum + "\n5.18\n" + abs(sum - 5.18)+ "\n");
        }
    }
}