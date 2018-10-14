import java.util.Scanner;

public class SwitchCipher {


    public static void main(String[] args) {
        char[] encrypted = encodingSwitchCipher(userInput());
        System.out.println(encrypted);
        char[] decrypted = encodingSwitchCipher(encrypted);
        System.out.println(decrypted);


    }

    public static char[] userInput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toUpperCase();
        char[] inputTab = line.toCharArray();
        scanner.close();
        return inputTab;
    }

    public static char[] encodingSwitchCipher(char[] inputTable) {
        char temp = ' ';
        for (int i = 0; i < inputTable.length - 1; i += 2) {
            temp = inputTable[i];
            inputTable[i] = inputTable[i + 1];
            inputTable[i + 1] = temp;
        }
        return inputTable;
    }

}
