package oop1.ex;

public class Rectangle {
    int width ;
    int height;
    int area = calculateArea();


    int calculateArea() {
        this.width = width;
        return width * height;
    }

    int calculatePerimeter() {
        this.width = width;
        this.height = height;
        return  2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

}
