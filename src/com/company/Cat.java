package com.company;

public class Cat {
    String color;
    String name;
    int weight;

    Cat() {

    }

    Cat(String color) {
        this.color = color;
    }

    Cat(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    Cat(String color, String name) {
        this("fff", "ff", 1);
    }


}
