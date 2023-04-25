package Shapes;

public class Circle extends Shape{

    private double radius;

    public Circle (String shapeTitle, double radius){
        super (shapeTitle);
        this.radius = radius;
    }

    @Override
    void getAreaOfTheShape(){
        double areaOfTheShape = Math.PI * Math.pow(radius,2);
        System.out.println("Area shape of " + getShapeTitle() + " is " + areaOfTheShape);
    }

    @Override
    void getPerimeterOfTheShape(){
        double perimeterOfTheShape = 2 * Math.PI * radius;
        System.out.println("Perimeter of the " + getShapeTitle() + " is " + perimeterOfTheShape);
    }

}
