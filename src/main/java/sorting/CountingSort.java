package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] countingTable = new int[10];

        int[] tableToSort = {1, 5, 2, 5, 6, 3, 8, 5, 7, 9, 4, 4, 8, 2, 4, 9, 5, 7, 3, 1, 4, 3, 6, 2, 2, 2, 8, 9, 5};

        for (int obj : tableToSort) {
            countingTable[obj] += 1;
        }
        int[] sortedTable = new int[tableToSort.length];
        int sortedTableIndex = 0;

        for (int i = 0; i < countingTable.length; i++) {
            for (int j = 0; j < countingTable[i]; j++) {
                sortedTable[sortedTableIndex] = i;
                sortedTableIndex++;
            }
        }
        System.out.println(Arrays.toString(sortedTable));

    }


}
