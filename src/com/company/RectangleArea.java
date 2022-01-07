package com.company;

public class RectangleArea {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public RectangleArea(int[] coords) {
        this.startX = coords[0];
        this.startY = coords[1];
        this.endX = coords[2];
        this.endY = coords[3];
    }

    public int getArea() {
        double result = Math.abs(startX - endX) * Math.abs(startY - endY);
        return (int) Math.round(result);
    }
}
