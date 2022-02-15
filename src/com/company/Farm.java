package com.company;

public class Farm {
    private String address;
    private String ownerName;
    private Sheep[] sheep;
    private Horse[] horses;
    private Cow[] cows;

    public Farm() {
    }

    public Farm(String address, String ownerName, Sheep[] sheep, Horse[] horses, Cow[] cows) {
        this.address = address;
        this.ownerName = ownerName;
        this.sheep = sheep;
        this.horses = horses;
        this.cows = cows;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    @Override
    public String toString() {
        return "address: " + address + ',' + " ownerName: " + ownerName
                + ',' + " sheep: " + sheep.length + ',' + " horses: " +
                horses.length + ',' + " cows: " + cows.length + '.';

    }
}