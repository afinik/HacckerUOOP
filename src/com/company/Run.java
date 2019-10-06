package com.company;

public class Run {
    public static void main(String[] args) {
        Run run1 = new Run(4, "First", 10);
        Run run2 = new Run(6, "Second");
        System.out.println("Количество бегунов - " + run1.numberOfRunners);
        System.out.println("Количество бегунов - " + run2.numberOfRunners);
        System.out.println("Погода - " + run1.weather);
        System.out.println("Погода - " + run2.weather);


    }

    int numberOfRunners;
    String stadiumName;
    double weather;

    Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }

    Run(int numberOfRunners, String stadiumName) {
        this(numberOfRunners, stadiumName, 0);
    }

    Run(Run run) {
        this.numberOfRunners = run.numberOfRunners;
        this.stadiumName = run.stadiumName;
        this.weather = run.weather;
    }


}
