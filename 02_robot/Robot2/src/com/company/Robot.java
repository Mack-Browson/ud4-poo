package com.company;

public class Robot {
    private int x;
    private int y;

    public Robot(){
        x = 0;
        y =0;
    }
    public void mover(int x, int y){
        if ((x<=1 && x>=-1)&& (y>=-1 && y<=1)) {
            x+=1;
            y+=1;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
