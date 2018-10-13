import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CesarCode {
    public static void main(String[] args) {
        encriptingCaesar();

    }

    public static String initAlphabetTable() {
        return "abcdefghijklmnopqrstuvwxyz".toUpperCase();
    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.toString().toUpperCase();
        scanner.close();
        return input;
    }

    private static void encriptingCaesar() {
        String input = userInput();
        String origin = initAlphabetTable();
        //char[] originTable = initAlphabetTable();
        char[] inputTable = input.toCharArray();
        char[] outputTable = new char[inputTable.length];
        int i = 0;
        for (char obj : inputTable) {
            outputTable[i] = origin.indexOf(obj)
        }


        System.out.println(outputTable);

    }


}
