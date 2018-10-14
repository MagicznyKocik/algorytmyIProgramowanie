import java.util.Scanner;

public class VigenereCipher {

    private static final int ALPHABET_LENGTH = 26;
    private static final int ASCII_NUMBER_OF_A = 65;

    public static void main(String[] args) {
        String input = userInput();
        String key = generateKey(input);
        encryptVigenere(generating2DCharArray(), key, input);

    }

    private static char[][] generating2DCharArray() {
        char[][] table = new char[ALPHABET_LENGTH][ALPHABET_LENGTH];
        int counter = 0;
        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            for (int j = 0; j < ALPHABET_LENGTH; j++) {
                table[i][j] = (char) (((j + counter) % ALPHABET_LENGTH) + ASCII_NUMBER_OF_A);
                // System.out.print(table[i][j]);
            }
            counter++;
            //System.out.println();
        }
        return table;
    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toUpperCase();
    }

    private static String generateKey(String input) {
        String key = userInput();
        StringBuilder result = new StringBuilder();
        int spaceCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                result.append(' ');
                spaceCounter++;
            } else {
                result.append(key.charAt((i - spaceCounter) % key.length()));
            }
        }

        System.out.println(result);
        return result.toString();
    }

    private static void encryptVigenere(char[][] inputTab, String key, String input) {
        String origin = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        String line = input;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                result.append(" ");
            } else {
                int k = origin.indexOf(line.charAt(i));
                int w = origin.indexOf(key.charAt(i));
                result.append(inputTab[k][w]);
            }
        }
        System.out.println(result);
    }


}
