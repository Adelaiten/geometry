package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    private float a, b;
    private String fileName = "Rectangle";

    public Rectangle(float a, float b){
        this.a = a;
        this.b = b;
        checkIfArgsGreaterThanZero(a,b);
    }

    public double calculateArea(){
        double area = this.a*this.b;
        return area;
    }


    public double calculatePerimeter(){
        double perimeter = (2*this.a) + (2*this.b);
        return perimeter;
    }


    public String getAreaFormula(){
        String formula = "a*b";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "2*a + 2*b";
        return formula;
    }

    public float getA(){
        return this.a;
    }
    
    public float getB(){
        return this.b;
    }

    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString ="a = " + getA() + ", b = " + getB() ;
        return returnString; 
    }
}
