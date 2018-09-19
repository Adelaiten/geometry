package com.codecool.java.geometry.shapes;

import com.codecool.java.NotYetImplementedException;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    /**
     * Calculates shape's area.
     * 
     * @return area of the shape
     */

    
    public abstract double calculateArea();
//sygnatura metody, implementacja
    /**
     * Calculates shape's perimeter.
     * 
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Returns formula for the area of the shape as a string.
     * 
     * @return area formula
     */
    public abstract String getAreaFormula();
//polimorfizm, metody polimorficzne
    /**
     * Returns formula for the perimeter of the shape as a string.
     * 
     * @return perimeter formula
     */
    public abstract String getPerimeterFormula();

    /**
     * Check if any of args are not below 0. Throws IllegalArgumentException if any
     * of the parameters is 0 or less.
     * 
     * @param args
     * @return true if any of args are greater than 0
     */

    public abstract String returnFileName();

    public static boolean checkIfArgsGreaterThanZero(float... args) {
        boolean check = true;
        // throw new NotYetImplementedException();

        for (float arg : args) {
            if (arg > 0) {
                check = true;
            } else {
                throw new java.lang.IllegalArgumentException("All arguments must be greater than 0");
            }
        
        }
        return check;
    }
}
