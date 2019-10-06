package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Main class");
        Cat cat = new Cat("red");
        Cat cat1 = new Cat("white", "Kolya");
        System.out.println(CatForStatic.weight);
    }
}
