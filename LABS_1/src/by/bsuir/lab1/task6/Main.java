package by.bsuir.lab1.task6;

public class Main {
    public static void main(String[] args) {
        showMatrix(new double[] {1,2,3,4,5,6,7,8,9});
    }

    public static void showMatrix(double[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                System.out.printf("%2.0f ",arr[j]);
            }
            for (int j = 0; j < i; j++){
                System.out.printf("%2.0f ",arr[j]);
            }
            System.out.println();
        }
    }
}
