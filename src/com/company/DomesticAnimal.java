package com.company;

public abstract class DomesticAnimal {
    private double weight;
    private byte age;
    private String nickName;
    private char gender;

    public DomesticAnimal() {
    }

    public DomesticAnimal(double weight, byte age, String nickName, char gender) {
        this.weight = weight;
        this.age = age;
        this.nickName = nickName;
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "weight: " + weight + ',' + " age: " + age + ',' +
                " nickName: " + nickName + ',' + " gender: " + gender + ".";
    }
}
