package com.example.lesson;

public class NotPhone extends Notebook{
    private int price;

    public NotPhone(String name, int ram, int hdd, String operationSysten, String color, int price) {
        super(name, ram, hdd, operationSysten, color);
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return super.toString()+ " price:" + price;
    }
    
}
