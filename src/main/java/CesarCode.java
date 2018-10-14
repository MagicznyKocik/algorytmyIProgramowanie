
import java.util.Scanner;

public class CesarCode {
    public static void main(String[] args) {
        encriptingCaesar();
        decriptingCaesar();

    }

    private static char[] initAlphabetTable() {
        char[] originTable = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        return originTable;
    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputOut = input.toUpperCase();
        //scanner.close();
        return inputOut;
    }

    private static void encriptingCaesar() {
        String input = userInput();
        String origin = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        char[] originTable = initAlphabetTable();
        char[] inputTable = input.toCharArray();
        char[] outputTable = new char[inputTable.length];
        int indeksOfobj;
        int i = 0;
        for (char obj : inputTable) {
            if (obj == ' ') {
                outputTable[i] = ' ';
                i++;
            } else {
                indeksOfobj = origin.indexOf(obj);
                outputTable[i] = originTable[(indeksOfobj + 3) % 26];
                i++;
            }
        }
        System.out.println(outputTable);

    }

    private static void decriptingCaesar() {
        String input = userInput();
        String origin = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        char[] originTable = initAlphabetTable();
        char[] inputTable = input.toCharArray();
        char[] outputTable = new char[inputTable.length];
        int indeksOfobj;
        int i = 0;
        for (char obj : inputTable) {
            if (obj == ' ') {
                outputTable[i] = ' ';
                i++;
            } else {
                indeksOfobj = origin.indexOf(obj) - 3;
                if (indeksOfobj < 0) {
                    indeksOfobj = 26 + indeksOfobj;
                }
                outputTable[i] = originTable[(indeksOfobj) % 26];
                i++;
            }
        }
        System.out.println(outputTable);
    }
}
