import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountingNumbersInFile {

    public static void main(String[] args) {
        readingFile();

    }

    private static void readingFile(){
        String fileName = "liczby2.txt";
        File file = new File(fileName);
        int[] tab = new int[10];
        Arrays.fill(tab, 0);

        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()){
                int digit = scanner.nextInt();
                tab[digit] += 1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i=0;
        int numberOfPresentNumbers = 0;
        for (int obj : tab){
            if(obj != 0 ){
                numberOfPresentNumbers++;
            }
            System.out.println(i + "   " + obj);
            i++;
        }
        System.out.println("There are " + numberOfPresentNumbers + " unique numbers");
        mostFrequentNumber(tab);
    }

    private static void mostFrequentNumber(int[] tab){
        int max =tab[0];
        int maxIndeks =0;
        for(int i = 0; i < tab.length; i++){
            if (tab[i] > max){
                max = tab[i];
                maxIndeks =i;
            }
        }
        System.out.println("Most frequent number: " + maxIndeks);
    }
}
