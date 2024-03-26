package Java0326Example1;

public class Triangle implements Shape {
    private double length;

    private double width;

    public Triangle() {
    }

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() { // 가급적 나누기보다 곱셈으로 활용하기(속도 등의 문제)
        return (length*width)*0.5;
    }

    @Override
    public double calculatePerimeter() {
        return width+((Math.pow(width*0.5,2)+Math.pow(length,2))/Math.sqrt((Math.pow(width*0.5,2)+Math.pow(length,2)))*2);
    }
}
