import java.util.Scanner;

public class PalindromePatterns {
    // zrobić dla dwóch przypadków ( palindromów parzystych i nieparzystych)
    public static void main(String[] args) {
        String input = userInput();
        searchingEven(input);

    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }

    private static void searchingEven(String line) {
        int lengthOfChain = line.length();
        for (int i = 1; i < lengthOfChain; i++) {
            boolean result = true;
            for (int j = 1, k = i; (i - j >= 0) && (i + j <= lengthOfChain); j++, k--) {

                if (line.charAt(i - j) != line.charAt(i + j)) {
                    //result = false;
                    break;
                }
                System.out.println(line.substring(i - j, i + j + 1));
            }
        }

    }


}
