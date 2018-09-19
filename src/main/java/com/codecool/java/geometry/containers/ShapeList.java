package com.codecool.java.geometry.containers;
import java.util.ArrayList;
import com.codecool.java.geometry.shapes.*;
import java.lang.StringBuilder;


public class ShapeList {
    private ArrayList<Shape> shapes;


    public ShapeList(){
        shapes = new ArrayList<Shape>();
    }


    public void addShape(Shape shape){
        shapes.add(shape);
    }


    public Shape getShapeAt(int index){
        return shapes.get(index);
    }


    public String getShapesTable(){
        StringBuilder sb = new StringBuilder();
        String leftAlignFormat = "| %-3s | %-23s | %-28s | %-15s | %-13s | %-8s | %-28s |%n";
        sb.append(String.format("| idx |        Class            |           toString           |    Perimeter    |    Formula    |   Area   |           Formula            |%n"));
        for(int i = 0; i < shapes.size(); i++){
            sb.append(String.format(leftAlignFormat, i, shapes.get(i).returnFileName(), shapes.get(i).toString(), String.format("%.2f",shapes.get(i).calculatePerimeter()), shapes.get(i).getPerimeterFormula(), String.format("%.2f",shapes.get(i).calculateArea()), shapes.get(i).getAreaFormula()));
        }
        
        return sb.toString();
            
    
    }


    


    public Shape getLargestShapeByPerimeter(){
        double perimeter = 0, largestPerimeter = 0;
        int index = 0;

        for(int i = 0; i < shapes.size(); i++){
            perimeter = shapes.get(i).calculatePerimeter();
            
            if(perimeter > largestPerimeter){
                largestPerimeter = perimeter;
                index = i;
            }
                
        }

        return shapes.get(index);
    }


    public Shape getLargestShapeByArea(){
        double area, largestArea = 0;
        int index = 0;
        for(int i = 0; i < shapes.size(); i++){
            area = shapes.get(i).calculateArea();

            if(area > largestArea)
                largestArea = area;
                index = i;
        }

        return shapes.get(index);
    }

    private void addItemsToArray(ArrayList titles){
        titles.add("idx");
        titles.add("Class");
        titles.add("toString");
        titles.add("Perimeter");
        titles.add("Formula");
        titles.add("Area");
        titles.add("Formula");
    }

    public ArrayList getArrayListShapes(){
        return this.shapes;
    }

    public String getLargestPerimeterTable(){
        StringBuilder sb = new StringBuilder();
        String leftAlignFormat = "| %-3s | %-23s | %-28s | %-15s | %-13s | %-8s | %-28s |%n";
        Shape largestPerimeterShape;
        sb.append(String.format("| idx |        Class            |           toString           |    Perimeter    |    Formula    |   Area   |           Formula            |%n"));
        largestPerimeterShape = getLargestShapeByPerimeter();
        sb.append(String.format(leftAlignFormat, 0, largestPerimeterShape.returnFileName(), largestPerimeterShape.toString(), String.format("%.2f",largestPerimeterShape.calculatePerimeter()), largestPerimeterShape.getPerimeterFormula(), String.format("%.2f",largestPerimeterShape.calculateArea()), largestPerimeterShape.getAreaFormula()));
        
        
        return sb.toString();
            
    
    }

    public String getLargestAreaTable(){
        StringBuilder sb = new StringBuilder();
        String leftAlignFormat = "| %-3s | %-23s | %-28s | %-15s | %-13s | %-8s | %-28s |%n";
        Shape largestAreaShape;
        sb.append(String.format("| idx |        Class            |           toString           |    Perimeter    |    Formula    |   Area   |           Formula            |%n"));
        largestAreaShape = getLargestShapeByArea();
        sb.append(String.format(leftAlignFormat, 0, largestAreaShape.returnFileName(), largestAreaShape.toString(), String.format("%.2f",largestAreaShape.calculatePerimeter()), largestAreaShape.getPerimeterFormula(), String.format("%.2f",largestAreaShape.calculateArea()), largestAreaShape.getAreaFormula()));
        
        
        return sb.toString();
            
    
    }

    public void showFormulas(){
        for(int i = 0; i < shapes.size(); i++){
            System.out.println(shapes.get(i).returnFileName() + " formulas are:\n" + "Perimeter: " + shapes.get(i).getPerimeterFormula() + "\nArea: " + shapes.get(i).getAreaFormula());
        }
    }
}


