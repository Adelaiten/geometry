package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {

    private String fileName = "Square";

    public Square(float a){
        super(a, a);
        checkIfArgsGreaterThanZero(a);
    }

    public String getAreaFormula(){
        String formula = "a^2";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "a*4";
        return formula;
    }

    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString = "a" + " = " + getA();
        return returnString;
    }
}
