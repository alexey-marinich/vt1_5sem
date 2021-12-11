package Task9;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> ballsInBasket;

    public Basket(ArrayList<Ball> balls) {
        if (balls != null)
            this.ballsInBasket = new ArrayList<Ball>(balls);
        else
            this.ballsInBasket = new ArrayList<Ball>();
    }

    public Basket() {
        ballsInBasket = new ArrayList<>();
    }

    public double getWeight() {
        double totalWeight = 0.;

        for (Ball ball : ballsInBasket) {
            totalWeight += ball.getWeight();
        }

        return totalWeight;
    }

    public void addBall(Ball ball) {
        ballsInBasket.add(ball);
    }

    public int getCountBlueBalls() {
        int count = 0;
        String currentColor;

        for (Ball ball : ballsInBasket) {
            currentColor = ball.getColor();
            if (currentColor.equalsIgnoreCase("Blue") || currentColor.equalsIgnoreCase("blue")) {
                count++;
            }
        }

        return count;
    }
}
