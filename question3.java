
    //desgin an abstract class named shape hat represents the common operation of calculatingarea. crreate a reactangle class dervied from shape
    // the reactangle should calculate and display the area for a length of 5 width of 4.
    abstract class Shape {
    // Abstract method
    abstract void calculateArea();
}
class Rectangle extends Shape {
    private int length;
    private int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    // Implementing abstract method
    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class question3{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        r.calculateArea();
    }
}

