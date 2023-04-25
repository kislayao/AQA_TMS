package Shapes;

public abstract class Shape {
    private String shapeTitle;
    private double radius;


    public Shape (String shapeTitle){
        this.shapeTitle = shapeTitle;
    }

    public String getShapeTitle() {
        return shapeTitle;
    }

    public double getRadius() {
        return radius;
    }

    abstract void getAreaOfTheShape();
    abstract void getPerimeterOfTheShape();

}