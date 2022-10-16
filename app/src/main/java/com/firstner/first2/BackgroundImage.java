package com.firstner.first2;

public class BackgroundImage {

    private int backgroundImageX, backgroundImageY, backgroundImageVelocity;

    public BackgroundImage() {
        backgroundImageX = 0;
        backgroundImageY = 0;
        backgroundImageVelocity =3;
    }

    //Getter and Setter

    public int getX() {
        return backgroundImageX;
    }

    public int getY() {
        return backgroundImageY;
    }

    public int getVelocity() {
        return backgroundImageVelocity;
    }

    public void setX(int backgroundImageX) {
        this.backgroundImageX = backgroundImageX;
    }

    public void setY(int backgroundImageY) {
        this.backgroundImageY = backgroundImageY;
    }
}
