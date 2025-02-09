package Methods;

//Author: Sharwan jung kunwar
//Purpose: To calculate area of circle using method.
public class circle_area {
    public static void main(String[] args) {
        double result = calculateArea(7);
        System.out.println("Area of Circle: " + result);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

