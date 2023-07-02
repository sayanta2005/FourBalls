package org.example;

public class Circle {
    private int position;
    private int distance;
    private int speed;

    public Circle(int position, int distance, int speed) {
        this.position = position;
        this.distance = distance;
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
