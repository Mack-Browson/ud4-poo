package com.company;

public class Robot {

      private int x;
      private int y;

      public Robot(){
          x = 0;
          y = 0;
      }

      public void mover(int x, int y){

          
              if (x == 0 && Math.abs (y) == 1) {
                  this.y += y;
              } else if (y == 0 && Math.abs (x) == 1) {
                  this.x += x;
              }

      }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
