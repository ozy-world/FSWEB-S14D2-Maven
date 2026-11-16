package org.example.model;

public class Bed {
    private String style;
    private int height;
    private int quilts;
    private int sheets;
    private int pillows;

    public Bed(String style, int height, int quilts, int sheets, int pillows) {
        this.style = style;
        this.height = height;
        this.quilts = quilts;
        this.sheets = sheets;
        this.pillows = pillows;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }

    public int getPillows() {
        return pillows;
    }
}
