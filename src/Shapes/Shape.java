package Shapes;

public abstract class Shape {
    private String shapeTitle;


    public Shape (String shapeTitle){
        this.shapeTitle = shapeTitle;
    }

    public String getShapeTitle() {
        return shapeTitle;
    }

    abstract void getAreaOfTheShape();
    abstract void getPerimeterOfTheShape();

}