package com.codecool.java.geometry.shapes;
import java.lang.Math;

public class RegularPentagon extends Shape {
    private float a;
    private String fileName = "Regular Pentagon";

    public RegularPentagon(float a){
        this.a = a;
        checkIfArgsGreaterThanZero(a);
    }


    public double calculateArea(){
        double area = ((a*a) * Math.sqrt(5*(5 + (2*Math.sqrt(5)))))/4;
        return area;
    }


    public double calculatePerimeter(){
        double perimeter = this.a*5;
        return perimeter;
    }


    public String getAreaFormula(){
        String formula = "a^2 *sqrt(5*(5+2sqrt(5))))/4";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "a*5";
        return formula;
    }

    public float getA(){
        return this.a;
    }

    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString ="a" + " = " + getA();
        return returnString;
    }
}
