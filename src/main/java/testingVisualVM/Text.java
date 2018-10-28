package testingVisualVM;

import sorting.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 5;
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Person p = new Person("WEs", "wewsd", 20 + i);
            people.add(p);
            scanner.nextLine();
        }

        System.out.println(people);

    }

}
