package com.learnProgramming;

public class Healthy_Hamburger extends Hamburger{
    //Declare the field
    private double Total_Price_healthy;


    //Create the constructor for init the field
    public Healthy_Hamburger(String type_BreadRoll, String type_Meat, int size) {
        super(type_BreadRoll, type_Meat,size);
        this.Total_Price_healthy = 0;
    }


    @Override
    public void AddOns_Additional(int User_AddOn, int index_AddOn) {
        int size = 6;
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

    @Override
    public void TotalPrice_Hamburger(double[] Price_Additional_data) {
        double Current_Price = getPrice_BasicBurger();
        int size = 6;
        double[] additional_price = new double[size];


        for (int i = 0; i < Price_Additional_data.length; i++){
            additional_price[i] = Price_Additional_data[i];
        }

        for (int i = 0; i < additional_price.length; i++){
            Current_Price += additional_price[i];
            this.Total_Price_healthy = Current_Price;
        }
        System.out.println("Total Price for Healthy HamBurger set RM" + this.Total_Price_healthy);
    }
}
