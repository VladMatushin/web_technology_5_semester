package by.bsuir.lab1.task15;

import java.util.ArrayList;
import java.util.Comparator;

public class ShellSort {
    public static void shellSort(ArrayList<Book> arr, Comparator<Book> comparator) {
        int n = arr.size();
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Book temp = arr.get(i);
                int j = i;

                while (j >= gap && comparator.compare(arr.get(j - gap),temp) > 0) {
                    arr.set(j, arr.get(j - gap));
                    j -= gap;
                }
                arr.set(j,temp);
            }
            gap /= 2;
        }
    }
}
