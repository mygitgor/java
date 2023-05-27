package com.example.lesson;


public class Main 
{
    public static void main( String[] args )
    {
        Notebook sony = new Notebook("sony", 1024, 240, "Microsoft", "black");
        Notebook samsung1 = new Notebook("Samsung", 1050, 500, "Linux", "blue");
        NotPhone phone = new NotPhone("iphon", 64, 120, "linux", "gold", 1500);
        Notebook samsung2 = new Notebook("Samsung", 1000, 500, "Linux1", "blue");
        Notebook samsung3 = new Notebook("Samsung", 2000, 1000, "Linux2", "blue");
        Notebook samsung4 = new Notebook("Samsung", 3000, 1500, "Linux3", "blue");
        Notebook samsung5 = new Notebook("Samsung", 4000, 2000, "Linux4", "blue");

        Ellectronic ellectronic = new Ellectronic();
        ellectronic.addProduct(sony);
        ellectronic.addProduct(phone);
        ellectronic.addProduct(samsung1);
        ellectronic.addProduct(samsung2);
        ellectronic.addProduct(samsung3);
        ellectronic.addProduct(samsung4);
        ellectronic.addProduct(samsung5);
        
        System.out.println(ellectronic.getProductList());
        System.out.println();
    }

    
}
