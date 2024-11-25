package com.oop;

public class Triangle extends Shape{
    float angle;
    Triangle(float lenght, float width, float height) {
        super(lenght, width, height);
        this.angle=angle;

    }


     void isTri(){
        if(angle>=90){
            System.out.println("Obtuse angle triangle");
        } else if (angle==90) {
            System.out.println("Rigth  angle triangle");
        }
        else {
            System.out.println("acute angle triangle");
        }
     }
}



