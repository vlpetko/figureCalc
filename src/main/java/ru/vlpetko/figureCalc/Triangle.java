package ru.vlpetko.figureCalc;

public class Triangle implements Figure{

    private Line line1;

    private Line line2;

    private Line line3;

    public double calculateSquare() {

        double polper = calculatePerimetr() / 2;

        double pas = Math.sqrt(polper * (polper - line1.getLength()) * (polper - line2.getLength()) * (polper - line3.getLength()));

        double h = 2 * pas / line1.getLength();

        return line1.getLength() * h / 2;
    }

    public double calculatePerimetr() {

        return line1.getLength() + line2.getLength() + line3.getLength();
    }

    public Triangle(Line line1, Line line2, Line line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public Line getLine1() {
        return line1;
    }

    public void setLine1(Line line1) {
        this.line1 = line1;
    }

    public Line getLine2() {
        return line2;
    }

    public void setLine2(Line line2) {
        this.line2 = line2;
    }

    public Line getLine3() {
        return line3;
    }

    public void setLine3(Line line3) {
        this.line3 = line3;
    }
}
