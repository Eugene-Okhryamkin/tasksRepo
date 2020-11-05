package ru.vsu.okhryamkin.Task3;

public class Square {
    public double xLeft;
    public double yDown;
    public double xRight;
    public double yUp;

    public Square(double x0, double x1, double y0, double y1) {
        this.xLeft = x0;
        this.yDown = y0;
        this.xRight = x1;
        this.yUp = y1;
    }

    /**
     * Проверяет, находится ли точка (x, y) выше линии
     */
    public boolean isPointInsideOfSquare(double x, double y) {
        return (x >= xLeft && x <= xRight && y >= yDown && y<= yUp);
    }

}
