package org.example;
import processing.core.PApplet;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class FourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;

    public static void main(String[] args) {
        PApplet.main("org.example.FourBalls",args);
    }
    Circle c1 = new Circle(0,HEIGHT/5,1);
    Circle c2 = new Circle(0,2*HEIGHT/5,2);
    Circle c3 = new Circle(0,3*HEIGHT/5,3);
    Circle c4 = new Circle(0,4*HEIGHT/5,4);

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){
    }

    private void drawCircle(int position, int distance) {
        ellipse(position,distance,DIAMETER,DIAMETER);
    }

    @Override
    public void draw(){
        drawCircle(c1.getPosition(), c1.getDistance());
        c1.setPosition(c1.getPosition()+c1.getSpeed());
        drawCircle(c2.getPosition(), c2.getDistance());
        c2.setPosition(c2.getPosition()+c2.getSpeed());
        drawCircle(c3.getPosition(), c3.getDistance());
        c3.setPosition(c3.getPosition()+c3.getSpeed());
        drawCircle(c4.getPosition(), c4.getDistance());
        c4.setPosition(c4.getPosition()+c4.getSpeed());
        //super.draw();
    }
}