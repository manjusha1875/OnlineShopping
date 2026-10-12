
package com.vcube.onlineshopping.service;

import org.springframework.stereotype.Service;

@Service
public class Onlineserviceimpl implements Onlineservice {

    @Override
    public void login() {
        System.out.println("User Login Successfully");
    }

    @Override
    public void register() {
        System.out.println("User Registered Successfully");
    }

    @Override
    public void viewproducts() {
        System.out.println("Viewing All Products");
    }

    @Override
    public void searchproducts() {
        System.out.println("Searching Products");
    }

    @Override
    public void addtocart() {
        System.out.println("Product Added to Cart");
    }
}