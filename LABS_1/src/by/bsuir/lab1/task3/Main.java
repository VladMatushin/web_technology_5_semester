package by.bsuir.lab1.task3;

public class Main {
    public static void main(String[] args) {
        printTableForFunction();
    }
    private static void printTableForFunction(){
        double h = 0.2;
        double a = -1;
        double b = 1;
        System.out.println("--------------------");
        for (double x = a; x <= b; x+=h )
            System.out.format("| %.2f | %.5f |\n", x, Math.tan(x));
        System.out.println("------------------");
    }
}
