package com.company;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        Car car2 = car1;
        System.out.println(car1.getMaxSpeed());
        System.out.println(car2.getMaxSpeed());
        car2.setMaxSpeed(200);
        System.out.println(car1.getMaxSpeed());
        System.out.println(car2.getMaxSpeed());
        car1.setMaxSpeed(100);
        car2 = new Car(100);
        System.out.println(car1.getMaxSpeed());
        System.out.println(car2.getMaxSpeed());
        car2.setMaxSpeed(200);
        System.out.println(car1.getMaxSpeed());
        System.out.println(car2.getMaxSpeed());
    }

    int maxSpeed;


    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
