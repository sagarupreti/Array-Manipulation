package com.sgr.second.util;

public class PriceCalculator {
    private double price;

    public void setPrice(double price){
        this.price=price;
    }
    
    public void addSurbicesCharge(double charge){
        price=price+(price*charge)/100;
    }
    public void addVat(double vat){
        price=price+(price*vat)/100;
    }
    public void addDiscount(double discount){
        price=price-(price*discount)/100;
    }
    public double getTotal(){
        return price;
    }
}