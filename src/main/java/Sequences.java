import java.util.Scanner;

public class Sequences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int number = scanner.nextInt();

        if(number > 20 || number < 1) {
            System.out.println("Zbyt duży numer");
        } else {

           // powSequence(number);
           // two4Two(number);
            fibo(number);
        }
        scanner.close();
    }

    private static void odd(int number){

            for (int i = 1; i < 2 * number; i += 2) {
                System.out.print(" " + i);
            }

    }

    private static void powSequence(int number){
        int sum = -1;
        System.out.print(" " + sum);
        for (int i = 1; i < number; i++){
            sum += Math.pow(2,i);
            System.out.print(" " + sum);
        }
    }

    private static void two4Two(int number){
        int sum = 0;
        boolean up = true;
        for (int i = 0; i < number ; i++){
            if (up) {
                sum += 2;
                System.out.print(" " + sum);
                if( sum == 8) {
                    up = false;
                    continue;
                }
            }
            if(!up){
                sum -= 2;
                System.out.print(" " + sum);
                if( sum == 2) {
                    up = true;
                }
            }
        }
    }

    private static void fibo(int number){
        int t1= 0;
        int t2= 1;
        int sum = 1;

        for (int i = 0; i <  number; i++){
            System.out.println(sum);
            sum = t1+t2;
            t1=t2;
            t2=sum;

        }


    }




}
