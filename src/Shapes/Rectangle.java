package Shapes;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;
    public Rectangle (String shapeTitle, double sideA, double sideB){
        super (shapeTitle);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void getAreaOfTheShape(){
        double areaOfTheShape = sideA * sideB;
        System.out.println("Area shape of " + getShapeTitle() + " is " + areaOfTheShape);
    }

    @Override
    void getPerimeterOfTheShape(){
        double perimeterOfTheShape = 2 * (sideA + sideB);
        System.out.println("Perimeter of the " + getShapeTitle() + " is " + perimeterOfTheShape);
    }

}
