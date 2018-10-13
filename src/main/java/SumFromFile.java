import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumFromFile {
    public static void main(String[] args) {
        sumFromFile();

    }

    private static void sumFromFile(){
        String fileName = "liczby.txt";

        String line;
        int sum = 0;
        int singleInt;

        try {
            FileReader reader =new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(reader);

            while((line = bufferedReader.readLine()) != null){
                singleInt = Integer.parseInt(line);
                sum+=singleInt;
                System.out.println(line);
            }
            System.out.println(sum);
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
