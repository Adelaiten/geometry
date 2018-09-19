package com.codecool.java.geometry.shapes;
import java.lang.Math;
public class Circle extends Shape {

    private float r;
    private String fileName = "Circle";
    

    public Circle(float r){
        this.r = r;
        checkIfArgsGreaterThanZero(r);
    }

    public double calculateArea(){
        double area = (Math.PI * (Math.pow(this.r, 2))) ;
        return area;
    }


    public double calculatePerimeter(){
        double perimeter = 2*Math.PI*this.r;
        return perimeter;
    }


    public String getAreaFormula(){
        String formula = "π*r^2";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "2*π*r";
        return formula;
    }

    public float getR(){
        return this.r;
    }

    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString = "r" + " = " + getR();
        return returnString;
    }

}
