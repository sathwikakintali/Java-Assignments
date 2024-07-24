class Rectangle {
    double length;
    double width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10.5; // Set the length
        rect.width = 7.2;   // Set the width

        System.out.println("Length = " + rect.length);
        System.out.println("Width = " + rect.width);

        rect.calculateArea();
        rect.calculatePerimeter();
    }
}
