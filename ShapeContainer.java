import java.util.ArrayList;

public class ShapeContainer extends Shape{
    private String name;
    private ArrayList <Shape> shapes;
    public void add(Shape s){
        shapes.add(s);
    }
    public ShapeContainer(String name){
        shapes = new ArrayList<>();
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    double getArea() {
        double totalArea = 0;
        for (Shape s: shapes) {
            totalArea += s.getArea();
        }
        return totalArea;
    }

    @Override
    double getPerimeter() {
        double totalPerimeter = 0;
        for (Shape s: shapes) {
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }

    public String toString(){
        int count = 0;
        String toStringMessage = "";
        for (Shape s: shapes) {
            count++;
            toStringMessage += count + ". shape: " + s.getName() + "\n";
        }
        return toStringMessage + "\n" + "Total Area: " + getArea() + "\nTotal Perimeter: " + getPerimeter();
    }
}
