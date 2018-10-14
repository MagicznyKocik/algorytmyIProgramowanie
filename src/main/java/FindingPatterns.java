import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chain = scanner.nextLine();
        String pattern = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(chain);


        int counter = 0;
        while (m.find()) {
            counter++;
        }

        int[][] table = new int[counter][2];
        int counter2 = 0;
        m.reset();
        while (m.find()) {
            table[counter2][0] = m.start();
//            System.out.print(table[counter2][0] + " ");
            table[counter2][1] = m.end() - 1;
//            System.out.print(table[counter2][1] + " ");
//            System.out.println(m.end());
            //           System.out.println();
            counter2++;
        }

        print2DArray(table);



    }

    public static void print2DArray(int[][] tab) {
        System.out.print("(");

        for (int i = 0; i < tab.length; i++) {
            System.out.print("{" + tab[i][0] + " " + tab[i][1] + "}");
            }
        System.out.print(")");
    }

}
