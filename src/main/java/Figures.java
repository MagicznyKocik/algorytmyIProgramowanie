import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        triangle(number);
        System.out.println();
        diagonal(number);
        System.out.println();
        rectangle(number);
        System.out.println();
        diagonalX(number);

        scanner.close();

    }

    private static void triangle(int number){
       for (int w = 0; w < number; w++){
           for (int k = 0; k <number; k++){
               if(k <= w) {
                   System.out.print("*");
               }
           }
           System.out.println();
       }
    }

    private static void diagonal(int number){
        for (int w = 0; w < number; w++){
            for (int k = 0; k <number; k++){
                if(k == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void rectangle(int number){
        for (int w = 0; w < number; w++){
            for (int k = 0; k <number; k++){
                if(k == 0 || w == 0 || k == number - 1 || w == number -1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void diagonalX(int number){
        for (int w = 0; w < number; w++){
            for (int k = 0; k <number; k++){
                if(k == w || w == number-k-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
