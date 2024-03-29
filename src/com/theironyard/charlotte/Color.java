package com.theironyard.charlotte;

/**
 * Created by Ben on 8/23/16.
 */
public class Color {
    private int red;
    private int green;
    private int blue;
    private String colorName;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Color color = (Color) o;

        if (red != color.red) return false;
        if (green != color.green) return false;
        return blue == color.blue;
    }

    @Override
    public int hashCode() {
        int result = red;
        result = 31 * result + green;
        result = 31 * result + blue;
        return result;
    }

//    @Override
//    public String toString() {
//        return "Color{" +
//                "red=" + red +
//                ", green=" + green +
//                ", blue=" + blue +
//                '}';
//    }
}
