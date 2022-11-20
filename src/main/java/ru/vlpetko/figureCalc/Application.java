package ru.vlpetko.figureCalc;

public class Application {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Line(6.0),new Line(8.0), new Line(10.0));

        System.out.println(triangle.calculateSquare());

    }
}
