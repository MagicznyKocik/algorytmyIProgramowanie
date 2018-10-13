import java.util.Scanner;

public class MinimalChange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        minimalChange(number);
    }

    private static void minimalChange(double number){
        int count;
        int dolars = (int)number;
        number= number*100;
        int pennies = (int)number%100;
        int[] bankNote = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] coin = {50, 20, 10, 5, 2, 1};
        for(int i = 0; i < 8; i++){
            count = dolars/bankNote[i];
            if (count > 0) {

                if (i > 4) {
                    System.out.println(count + " monet po " + bankNote[i] + "zł");
                } else {
                    System.out.println(count + " banknotów po " + bankNote[i] + "zł");
                }
                dolars %= bankNote[i];
            }
        }
        for(int i = 0; i < 6; i++){
            count = pennies/coin[i];
            if(count > 0) {
                System.out.println(count + " monet po " + coin[i] + " groszy");
                pennies %= coin[i];
            }
        }
    }

}
