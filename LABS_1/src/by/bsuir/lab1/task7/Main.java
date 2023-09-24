package by.bsuir.lab1.task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 8, 2, 9, 1, 0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }
}
