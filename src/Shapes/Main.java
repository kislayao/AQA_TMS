package Shapes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Triangle("Triangle 1", 10,12,11),
                new Rectangle("Rectangle 1", 22, 2),
                new Circle("Circle 1", 15),
                new Triangle("Triangle 2", 2, 3, 2),
                new Circle("Circle 2", 5),
        };

        for (Shape figure: shapes){
            figure.getAreaOfTheShape();
            figure.getPerimeterOfTheShape();
            System.out.println();
        }
    }
}