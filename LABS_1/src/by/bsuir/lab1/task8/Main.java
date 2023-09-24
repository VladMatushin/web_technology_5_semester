package by.bsuir.lab1.task8;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printInsertionPoints(new double[]{1, 2, 4, 5, 5, 6, 9}, new double[]{0, 4, 6, 8, 9, 10});
    }

        public static void printInsertionPoints(double[] firstArray, double[] secondArray) {
            int i = 0;
            int j = 0;

            while (i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] < secondArray[j]) {
                    i++;
                } else {
                    System.out.print(i + " ");
                    j++;
                }
            }

            while (j < secondArray.length) {
                System.out.print(i + " ");
                j++;
            }
        }
}
