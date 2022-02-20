package com.learnProgramming;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    // Declare the field
    private String Type_BreadRoll;
    private String Type_Meat;
    private double Total_Price;
    private double Price_BasicBurger;
    protected String[] Additional_Name;
    protected double[] Additional_price;

    //Create constructor for init the field
    public Hamburger(String type_BreadRoll, String type_Meat, int size){
        this.Type_BreadRoll = type_BreadRoll;
        this.Type_Meat = type_Meat;
        this.Total_Price = 0.00;
        this.Price_BasicBurger = 4.00;
        this.Additional_Name = new String[size];
        this.Additional_price = new double[size];
    }

    public String getType_BreadRoll() {
        return Type_BreadRoll;
    }

    public String getType_Meat() {
        return Type_Meat;
    }

    public String getAdditional_Name(int i) {
        return Additional_Name[i];
    }

    public double getAdditional_Price(int i){
        return Additional_price[i];
    }

    public double getPrice_BasicBurger(){
        return  Price_BasicBurger;
    }

    // Create method
    //DONE: PRICE BUG
    public void AddOns_Additional(int User_AddOn, int index_AddOn){

        int size = 4;
        String[] Name_AddOn = new String[size];
        double[] Price_AddOn = new double[size];

        if (User_AddOn == 1){ // 1 for lettuce
            Name_AddOn[index_AddOn] = "Lettuce";
            Price_AddOn[index_AddOn] = 2.00;
            this.Additional_Name = Name_AddOn;
            this.Additional_price = Price_AddOn;
        } else if (User_AddOn == 2){
            Name_AddOn[index_AddOn] = "Carrot";
            Price_AddOn[index_AddOn] = 3.00;
            this.Additional_Name = Name_AddOn;
            this.Additional_price = Price_AddOn;
        } else if (User_AddOn == 3){
            Name_AddOn[index_AddOn] = "Tomato";
            Price_AddOn[index_AddOn] = 4.00;
            this.Additional_Name = Name_AddOn;
            this.Additional_price = Price_AddOn;
        } else if (User_AddOn == 4){
            Name_AddOn[index_AddOn] = "Salad";
            Price_AddOn[index_AddOn] = 5.00;
            this.Additional_Name = Name_AddOn;
            this.Additional_price = Price_AddOn;
        }
    }

    public void TotalPrice_Hamburger(double[] Price_Additional_data){

        double Current_Price = this.Price_BasicBurger;
        int size = 4;
        double[] additional_price = new double[size];


        for (int i = 0; i < Price_Additional_data.length; i++){
            additional_price[i] = Price_Additional_data[i];
        }

        for (int i = 0; i < additional_price.length; i++){
            Current_Price += additional_price[i];
            this.Total_Price = Current_Price;
        }
        System.out.println("Total Price for Custom HamBurger set RM" + this.Total_Price);
    }
}
