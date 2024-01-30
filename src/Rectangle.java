public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height){
        super();
        this.height = height;
        this.width = width;

    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(){
        this.width = width;
    }
    public void setHeight(){
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
