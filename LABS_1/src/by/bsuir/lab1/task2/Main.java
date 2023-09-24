package by.bsuir.lab1.task2;

public class Main {
    public static void main (String[] args){
        System.out.println(dotInArea(5, -2));
    }

    public static boolean dotInArea (double x, double y){
        boolean result = false;
        if (y >= 0 && y <=5 && x >= -4 && x <= 4){
            result = true;
        }
        if (y <= 0 && y>= -3 && x >= -6 && x<= 6){
            result = true;
        }
        return result;
    }
}
