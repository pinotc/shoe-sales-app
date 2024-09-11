package com.example.doanapp.model;

import java.util.ArrayList;

public class dataCart {
    public ArrayList<Products> arrProCart;

    public ArrayList<Products> getArrProCart() {
        return arrProCart;
    }

    public void setArrProCart(ArrayList<Products> arrProCart) {
        this.arrProCart = arrProCart;
    }

    public Products dataproCart;

    public dataCart(Products dataproCart) {
        this.dataproCart = dataproCart;
        arrProCart.add(dataproCart);
    }
}
