package com.github.altrunner.javamarathon;

public class ProductTest {

    public static void main(String args[]){
        Product pr1 = new Product("pen", 2.75);
        Product pr2 = new Product();
        Product pr3 = new Product("Notebook", 8.25);
        System.out.println (Product.productCount+" new products created!");
        System.out.println ("Product 1 "+ pr1.getName() + " with price " + pr1.getPrice());
        System.out.println ("Product 2 "+ pr2.getName() + " with price " + pr2.getPrice());
        System.out.println ("Product 3 "+ pr3.getName() + " with price " + pr3.getPrice());
    }



}
