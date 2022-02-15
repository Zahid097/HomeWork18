package com.company;

public class Horse extends DomesticAnimal {

    private String color;

    public Horse() {
    }

    public Horse(double weight, byte age, String nickName, char gender, String color) {
        super(weight, age, nickName, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
