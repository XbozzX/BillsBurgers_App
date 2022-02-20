package com.learnProgramming;

public class Deluxe_Hamburger extends  Hamburger{
    //declare the field
    private double Price_DeluxeBurger;
    private double Price_Chips;
    private double Price_drinks;
    private double Total_Price_deluxe;

    //Create the constructor for init the field
    public Deluxe_Hamburger(String type_BreadRoll, String type_Meat) {
        super(type_BreadRoll, type_Meat, 0);
        Price_DeluxeBurger = 10.00;
        Price_Chips = 2.00;
        Price_drinks = 3.00;
        Total_Price_deluxe = 0.00;

    }

    public double getPrice_DeluxeBurger(){
        return Price_DeluxeBurger;
    }

    public double getPrice_Chips() {
        return Price_Chips;
    }

    public double getPrice_drinks() {
        return Price_drinks;
    }

    public  double getTotal_Price_deluxe() {
        return Total_Price_deluxe;
    }

    public void TotalPrice_Hamburger() {
        double Current_Price = getPrice_DeluxeBurger() + getPrice_Chips() + getPrice_drinks();
        this.Total_Price_deluxe = Current_Price;
        System.out.println("Total Price for Deluxe HamBurger set RM" + this.getTotal_Price_deluxe());
    }
}
