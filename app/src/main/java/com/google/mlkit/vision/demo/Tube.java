package com.google.mlkit.vision.demo;

import java.util.Random;

public class Tube {
    // tubeX = Tube X-coordinate, topTubeOffsetY = top tube bottom edge coordinate
    private int tubeX, topTubeOffsetY;
    private Random random;
    private int tubeColor;

    public Tube(int tubeX, int topTubeOffsetY){
        this.tubeX = tubeX;
        this.topTubeOffsetY = topTubeOffsetY;
        random = new Random();
    }

    public void setTubeColor(){
        tubeColor = random.nextInt(2);
    }

    public int getTubeColor(){
        return tubeColor;
    }

    public int getTopTubeOffsetY(){
        return topTubeOffsetY;
    }

    public int getTubeX(){
        return tubeX;
    }

    public int getTopTubeY(){
        return topTubeOffsetY - AppConstants.getBitmapBank().getTubeHeight();
    }

    public int getBottomTubeY(){
        return topTubeOffsetY + AppConstants.gapBetweenTopAndBottomTubes;
    }

    public void setTubeX(int tubeX){
        this.tubeX = tubeX;
    }

    public void setTopTubeOffsetY(int topTubeOffsetY){
        this.topTubeOffsetY = topTubeOffsetY;
    }
}
