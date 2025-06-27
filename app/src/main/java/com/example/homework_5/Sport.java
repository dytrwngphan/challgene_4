package com.example.homework_5;

public class Sport {
    private String name;
    private int imageResId;

    public Sport(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
