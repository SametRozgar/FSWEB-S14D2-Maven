package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
   private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void lying()
    {
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    private PaintColor color;
}
