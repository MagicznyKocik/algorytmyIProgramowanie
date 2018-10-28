package sorting;

import java.util.*;

import static java.util.Collections.sort;

public class EmbeddedSort {
    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers();
        generateNumbers();
        sort(numbers);
        System.out.println(numbers);


    }


    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers, (o1, o2) -> {
            if (o1 % 2 == 0 && o2 % 2 != 0) {
                return -1;
            } else if (o1 % 2 != 0 && o2 % 2 == 0) {
                return 1;
            } else return o1.compareTo(o2);


        });

    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(rand.nextInt(20));
        }
        return numbers;

    }

}
