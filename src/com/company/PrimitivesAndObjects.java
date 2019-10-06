package com.company;

public class PrimitivesAndObjects {
    static int a;

    public static void main(String[] args) {
        int a;
        // System.out.println(a);
        System.out.println(PrimitivesAndObjects.a);
        Cat2 basik = new Cat2();
        Cat2 murka = new Cat2();

        basik.name = "basik";
        murka.name = "murka";
        System.out.println("basik:" + basik.name);
        System.out.println("murka:" + murka.name);
        murka = basik;
        System.out.println("murka:" + murka.name);
        System.out.println("basik:" + basik.name);
        murka.name = "new name";
        System.out.println("murka:" + murka.name);
        System.out.println("basik:" + basik.name);

    }
}

class Cat2 {
    String name;
}
