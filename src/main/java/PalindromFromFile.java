import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromFromFile {

    public static void main(String[] args) {
        readFromFile();

    }


    private static void readFromFile(){
        String fileName = "palindromy.txt";
        String line;

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null){
                if(checkIfPalindrome(line)){
                    System.out.println(line);
                }
            }

            bufferedReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkIfPalindrome(String line){
        StringBuilder stringBuilder = new StringBuilder(line);
        String reversedLine = stringBuilder.reverse().toString();
        return reversedLine.equals(line);
    }

}
