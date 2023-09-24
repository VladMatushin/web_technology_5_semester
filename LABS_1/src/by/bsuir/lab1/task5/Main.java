package by.bsuir.lab1.task5;

public class Main {

    public static void main(String[] args) {
        int[] exampleArray1 = {13, 51, 93, 91, 42, 36, 96, 37, 27, 18};
        System.out.println(findMinElementsToRemove(exampleArray1));
        int[] exampleArray2 =  {1,2,3,4,6,5,7,8};
        System.out.println(findMinElementsToRemove(exampleArray2));
    }

    public static int findMinElementsToRemove(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return n - maxLen;
    }
}
