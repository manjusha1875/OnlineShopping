
package com.vcube.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.onlineshopping.service.Onlineservice;

@RestController
@RequestMapping("/online")
public class onlinecontroller {

    @Autowired
    Onlineservice onlineservice;

    // 1. Login API
    @GetMapping("/login")
    public String login() {
        onlineservice.login();
        return "Login Successfully";
    }

    // 2. Register API
    @PostMapping("/register")
    public String register() {
        onlineservice.register();
        return "Registered Successfully";
    }

    // 3. View Products API
    @GetMapping("/viewproducts")
    public String viewproducts() {
        onlineservice.viewproducts();
        return "Viewing All Products";
    }

    // 4. Search Products API
    @GetMapping("/searchproducts")
    public String searchproducts() {
        onlineservice.searchproducts();
        return "Searching Products";
    }

    // 5. Add To Cart API
    @PostMapping("/addtocart")
    public String addtocart() {
        onlineservice.addtocart();
        return "Product Added To Cart";
    }
}