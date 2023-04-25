package Shapes;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle (String shapeTitle, double sideA, double sideB, double sideC){
        super (shapeTitle);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    void getAreaOfTheShape(){
        double halfMeter = (sideA + sideB + sideC);
        double areaOfTheShape = Math.sqrt(halfMeter * (halfMeter - sideA) *
                (halfMeter - sideB) * (halfMeter - sideC));
        System.out.println("Area shape of " + getShapeTitle() + " is " + areaOfTheShape);
    }

    @Override
    void getPerimeterOfTheShape(){
        double perimeterOfTheShape = (sideA + sideB + sideC);
        System.out.println("Perimeter of the " + getShapeTitle() + " is " + perimeterOfTheShape);
    }



}
