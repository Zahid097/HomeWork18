package com.company;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow(600, (byte) 6, "Bessie", 'F');
        Cow cow2 = new Cow(520, (byte) 6, "Angus", 'M');
        Cow cow3 = new Cow(460, (byte) 4, "Smokey", 'M');
        Cow cow4 = new Cow(345, (byte) 3, "Clara", 'F');
        Cow cow5 = new Cow(280, (byte) 2, "Bella", 'F');
        Cow cow6 = new Cow(175, (byte) 1, "Magic", 'F');

        Sheep sheep1 = new Sheep(25, (byte) 1, "Ala", 'M');
        Sheep sheep2 = new Sheep(40, (byte) 2, "Gissar", 'M');
        Sheep sheep3 = new Sheep(59, (byte) 3, "Jaydar", 'F');
        Sheep sheep4 = new Sheep(80, (byte) 4, "Tulo", 'F');

        Horse horse1 = new Horse(150, (byte) 1, "Amaro", 'M', "Green");
        Horse horse2 = new Horse(265, (byte) 2, "Baron", 'M', "Silver");
        Horse horse3 = new Horse(380, (byte) 3, "Halk", 'F', "Brown");

        Farm farm1 = new Farm("Alabuka", "Bek", new Sheep[]{sheep1, sheep2, sheep3},
                new Horse[]{horse1, horse2}, new Cow[]{cow1, cow2, cow3, cow4, cow5});
        Farm farm2 = new Farm("Chatkal", "Zamir",
                new Sheep[]{sheep4}, new Horse[]{horse3}, new Cow[]{cow6});

        System.out.println("Farm1- " + farm1);
        System.out.println();
        System.out.println("Farm2- " + farm2);

    }
}
