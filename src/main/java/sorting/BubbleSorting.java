package sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int tab[] = {4, 3, 2, 1, 5};
        sortTable(tab);

    }

    private static void sortTable(int[] table) {
        int lenght = table.length;
        int temp;
        while (lenght > 0) {

            for (int i = 1; i < lenght; i++) {
                if (table[i] < table[i - 1]) {
                    temp = table[i];
                    table[i] = table[i - 1];
                    table[i - 1] = temp;
                }
            }
            for (int obj : table) {
                System.out.print(obj);
            }
            System.out.println();
            lenght--;
        }
    }

}
