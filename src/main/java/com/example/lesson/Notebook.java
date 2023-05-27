package com.example.lesson;

public class Notebook {
    private String name;
    private int ram;
    private int hdd;
    private String operationSysten;
    private String color;

    public Notebook(String name, int ram, int hdd, String operationSysten, String color){
        this.name=name;
        this.ram=ram;
        this.hdd=hdd;
        this.operationSysten=operationSysten;
        this.color=color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }

    public int getHdd(){
        return hdd;
    }
    public void setHdd(int hdd){
        this.hdd=hdd;
    }

    public String getOperationSystem(){
        return operationSysten;
    }
    public void setOperationSystem(String operationSysten){
        this.operationSysten=operationSysten;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "name:" + name + " ram:" + ram + " hdd:" + hdd + 
        " operationSysten:" + operationSysten + " color:" + color;
    }

}
