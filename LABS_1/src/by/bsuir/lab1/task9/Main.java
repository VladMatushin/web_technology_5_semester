package by.bsuir.lab1.task9;

public class Main{
        public static void main(String[] args) {
            Ball ball1 = new Ball(5, "Green");
            Ball ball2 = new Ball(2, "Blue");
            Ball ball3 = new Ball(7, "Red");
            Ball ball4 = new Ball(9, "BLUE");

            Bucket bucket = new Bucket();

            bucket.addBall(ball1);
            bucket.addBall(ball2);
            bucket.addBall(ball3);
            bucket.addBall(ball4);

            System.out.println(bucket.GetWeight());
            System.out.println(bucket.GetBlueBallCount());
        }
}
