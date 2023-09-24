package by.bsuir.lab1.task14;

import java.util.Arrays;

public class Main {
    public static void main(String []args){
        Book mas[]={new Book("a",77),new Book("b",17),new Book("c",95),new Book("d",37),
                new Book("e",58),new Book("f",19),new Book("g",35)};
        shellSort(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static void shellSort(Book[] arr) {
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Book temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap].compareTo(temp) > 0) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
            gap /= 2;
        }
    }
}
