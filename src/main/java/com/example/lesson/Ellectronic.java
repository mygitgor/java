package com.example.lesson;

import java.util.ArrayList;
import java.util.List;

public class Ellectronic {
    private int capacity;
    private List<Notebook> productList;

    public Ellectronic(){
        productList = new ArrayList<>();
        capacity = 20;
    }

    public void addProduct(Notebook notebook){
        if (productList.size()< capacity){
            productList.add(notebook);
        }
    }

    public String getProductList(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Notebook notebook: productList){
            stringBuilder.append(notebook);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
