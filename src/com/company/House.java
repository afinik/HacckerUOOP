package com.company;

public class House {
    String color;
    int height;

    public String getColor() {
        return color;
    }

    public void setColor(String lightColor) {
        this.color = "light" + lightColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = 100 * height;
    }

    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();
        house1.setColor("white");
        house2.setColor("black");
        house1.setHeight(10);
        house2.setHeight(20);
        System.out.println("Дом 1, цвет:" + house1.getColor() + ", а высота " + house1.getHeight() + "м, а стоимость " + house1.cost(house1.color, house1.height));
        System.out.println("Дом 2, цвет:" + house2.getColor() + ", а высота " + house2.getHeight() + "м, а стоимость " + house2.cost(house2.color, house2.height));
    }

    public int cost(String color, int height) {
        this.color = color;
        this.height = height;
        int b;
        if (color == "white") {
            return 10 * height;
        } else {
            return height;
        }
    }


}
