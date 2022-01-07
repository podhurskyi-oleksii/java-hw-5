package com.company;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public boolean canPlaceInto(Rectangle anotherRectangle) {
        return (this.getWidth() <= anotherRectangle.getWidth() && this.getLength() <= anotherRectangle.getLength()) ||
                (this.getWidth() <= anotherRectangle.getLength() && this.getLength() <= anotherRectangle.getWidth());
    }
}
