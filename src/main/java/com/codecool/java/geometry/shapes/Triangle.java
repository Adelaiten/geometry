package com.codecool.java.geometry.shapes;
import java.lang.Math;

public class Triangle extends Shape {
    private float a,b,c;
    private String fileName = "Triangle";

    public Triangle(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        checkIfArgsGreaterThanZero(a,b,c);
    }

    public double calculateArea(){
        float s = (this.a + this.b + this.c)/2;
        double area = Math.sqrt(s*(s - this.a)*(s - this.b)*(s - this.c));
        return area;
    }


    public double calculatePerimeter(){
        double perimeter = this.a + this.b + this.c;
        return perimeter;
    }


    public String getAreaFormula(){
        String formula = "sqrt(s(s-a)(s-b)(s-c))";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "a + b + c";
        return formula;
    }
    

    public float getA(){
        return this.a;
    }

    public float getB(){
        return this.b;
    }

    public float getC(){
        return this.c;
    }

    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString = "a = " + getA() + ", b = " + getB() + ", c = " + getC();
        return returnString;
    }
}
