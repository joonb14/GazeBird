package com.google.mlkit.vision.demo;

public class Bird {

    private int birdX, birdY, currentFrame, velocity;
    public static int maxFrame;

    public Bird(){
        birdX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getBirdWidth()/2;
        birdY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getBirdHeight()/2;
        currentFrame = 0;
        maxFrame = 3;
        velocity = 0;
    }

    // Getter method for velocity
    public int getVelocity(){
        return velocity;
    }

    // Setter method for velocity
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }

    // Getter method for current frame
    public int getCurrentFrame(){
        return currentFrame;
    }

    // Setter method for current frame

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    // Getter method for getting X-coordinate of the Bird
    public int getX(){
        return birdX;
    }

    // Getter method for getting the Y-coordinate of the Bird
    public int getY(){
        return birdY;
    }

    // Setter method for setting the X-coordinate
    public void setX(int birdX){
        this.birdX = birdX;
    }

    // Setter method for setting the Y-coordinate
    public void setY(int birdY){
        this.birdY = birdY;
    }
}
