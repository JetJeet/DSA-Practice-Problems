package com.oop;

public class Main {
    public static void main(String[]args){

        Shape s1 = new Shape(1,2,3);
        Shape s2 = new Triangle(1,2,90);
        if(s2 instanceof Shape){
            s2=(Triangle)s2;
        }
        s1.toString();

    }
}
