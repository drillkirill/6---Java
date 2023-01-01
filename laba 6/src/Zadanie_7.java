public class Zadanie_7 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j+"/"+i+"="+String.format("%.3f",((double)j/i)).replace(',', '.')+" ");
            }
            System.out.println("");
        }
    }
}