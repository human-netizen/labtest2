package com.example.labtest2;
public abstract class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public String showColor() {
        return "Color: " + name;
    }
}
