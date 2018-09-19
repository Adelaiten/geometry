package com.codecool.java.geometry;

import com.codecool.java.geometry.shapes.*;
import com.codecool.java.geometry.containers.ShapeList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args)
    throws IOException {
	    ShapeList shapes = new ShapeList();
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        Square square = new Square(3);
        Circle circle = new Circle(4);
        int a,b,c, r;

        // TODO: implement user interaction here. You can change the code below
	    while (isRunning) {
            System.out.println("What do you want to do: \n(1) Add new shape\n(2) Show all shapes\n(3) Show shape with the largest perimeter\n(4) Show shapes with the largest area\n(5) Show formulas");
            int option = 0; // TODO: get option from user
            option = scanner.nextInt();
            char choice;

            switch (option) {
                case 1:
                    System.out.println("(a) Circle\n(b) Equilateral Triangle\n(c) Rectangle\n(d) Regular Pentagon\n(e) Square\n(f) Triangle");
                    choice = (char) System.in.read();
                    switch (choice){
                        case 'a':
                            System.out.print("r = ");
                            r = scanner.nextInt();
                            shapes.addShape(new Circle(r));
                            break;
                        case 'b':
                            System.out.print("a = ");
                            a = scanner.nextInt();
                            shapes.addShape(new EquilateralTriangle(a));
                            break;
                        case 'c':
                            System.out.print("a = ");
                            a = scanner.nextInt();
                            System.out.print("\nb = ");
                            b = scanner.nextInt();
                            shapes.addShape(new Rectangle(a,b));
                            break;
                        case 'd':
                            System.out.print("a = ");
                            a = scanner.nextInt();
                            shapes.addShape(new RegularPentagon(a));
                            break;
                        case 'e':
                            System.out.print("a = ");
                            a = scanner.nextInt();
                            shapes.addShape(new Square(a));
                            break;
                        case 'f':
                            System.out.print("a = ");
                            a = scanner.nextInt();
                            System.out.print("\nb = ");
                            b = scanner.nextInt();
                            System.out.print("\nc = ");
                            c = scanner.nextInt();
                            shapes.addShape(new Triangle(a,b,c));
                            break;

                    }
                    break;
                case 2:
                    System.out.println(shapes.getShapesTable());
                    break;
                case 3:
                    System.out.print(shapes.getLargestPerimeterTable());
                    break;
                case 4:
                    System.out.print(shapes.getLargestAreaTable());
                    break;
                case 5:
                    shapes.showFormulas();
                    break;
                case 0:
                    isRunning = false;
                    break;

            }
        }
    }
}
