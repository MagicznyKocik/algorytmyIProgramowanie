package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static java.util.Collections.sort;

public class EmbeddedSort {
    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers();
        generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers);
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
