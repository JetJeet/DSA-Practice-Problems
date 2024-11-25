package com.oop;

public class Shape {
    float  lenght;
    float width;
    float height;
    Shape(float lenght,float width,float height)
    {
        this.height=height;
        this.lenght=lenght;
        this.width=width;

    }
    @Override
    public String toString(){

        return ("Length:"+this.lenght+"width"+this.width);
    }
}
