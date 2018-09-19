package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    private String fileName = "Equilateral Triangle"; //20

    public EquilateralTriangle(float a){
        super(a, a, a);
        checkIfArgsGreaterThanZero(a);
    }


    public String getAreaFormula(){
        String formula = "sqrt(s(s-a)(s-b)(s-c))";
        return formula;
    }

    public String getPerimeterFormula(){
        String formula = "a + b + c";
        return formula;
    }


    public String returnFileName(){
        return this.fileName;
    }

    public String toString(){
        String returnString ="a" + " = " + getA();
        return returnString;
    }
}
