import java.util.Scanner;

public class SwitchCipher {


    public static void main(String[] args) {
        encodingSwitchCipher(userInput());

    }

    public static char[] userInput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toUpperCase();
        char[] inputTab = line.toCharArray();
        scanner.close();
        return inputTab;
    }

    public static void encodingSwitchCipher(char[] inputTable) {
        char temp = ' ';
        for (int i = 0; i < inputTable.length - 1; i += 2) {
            temp = inputTable[i];
            inputTable[i] = inputTable[i + 1];
            inputTable[i + 1] = temp;
        }
        System.out.println(inputTable);
    }

}
