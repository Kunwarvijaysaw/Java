package Overloading;

public class Shape {

	// Method to calculate area of rectangle
	
    public static double calculateArea1(double length, double width) {
        return length * width;
    }
    
    // Method to calculate area of circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate area of triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        
        double rectangleArea = calculateArea1(5, 4);
        double circleArea = calculateArea(3);
        double triangleArea = calculateArea1(6, 8);
        
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
