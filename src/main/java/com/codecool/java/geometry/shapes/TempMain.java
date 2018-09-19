package com.codecool.java.geometry.containers;
import java.util.ArrayList;
import com.codecool.java.geometry.shapes.*;
import com.codecool.java.geometry.containers.*;
class TempMain{
    public static void main(String args[]){

        ShapeList temp = new ShapeList();
        RegularPentagon tempPentagon = new RegularPentagon(3);
        temp.addShape(tempPentagon);
        System.out.println(temp.getShapesTable());
    }
}