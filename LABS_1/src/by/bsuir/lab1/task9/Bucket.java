package by.bsuir.lab1.task9;

import java.util.ArrayList;

public class Bucket {
    private int bucketWeight;
    private ArrayList<Ball> bucketArrayList = new ArrayList<Ball>();
    private int numberOfBlueBolls;
    public Bucket() {
        bucketWeight = 0;
        numberOfBlueBolls = 0;
    };



    public void addBall(Ball ball) {
        bucketArrayList.add(ball);
        bucketWeight += ball.volume;
        if (ball.GetColor().equals("blue")){
            numberOfBlueBolls++;
        }
    }

    public int GetWeight() {
        return bucketWeight;
    }
    public int GetBlueBallCount() {
        return numberOfBlueBolls;
    }
}
