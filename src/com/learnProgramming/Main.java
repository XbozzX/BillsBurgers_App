package com.learnProgramming;

import java.util.Scanner; // import Scanner class

public class Main {

    //Create Hamburger Menu interface for display to the user
    public static void Hamburger_Menu(){
        System.out.println("***   BillsBurger   ***");
        System.out.println("*[1] Custom Hamburger *");
        System.out.println("*[2] Healthy Hamburger*");
        System.out.println("*[3] Deluxe Hamburger *");
        System.out.println("*[0] Quit             *");
        System.out.println("***********************");
    }

    public static void Additional_CustomHamburger() {
        System.out.println("***   BillsBurger   ***");
        System.out.println("!!! Can add 4 additional item !!!");
        System.out.println("*[1] Lettuce*");
        System.out.println("*[2] Carrot*");
        System.out.println("*[3] Tomato*");
        System.out.println("*[4] Salad");
        System.out.println("*[0] Don't want additional");
    }

    public static void Additional_HealthyHamburger() {
        System.out.println("***   BillsBurger   ***");
        System.out.println("!!! Can add 6 additional item !!!");
        System.out.println("*[1] Lettuce*");
        System.out.println("*[2] Carrot*");
        System.out.println("*[3] Tomato*");
        System.out.println("*[4] Salad");
        System.out.println("*[0] Don't want additional");
    }

    public static void Deluxe_Hamburger(){
        System.out.println("***   BillsBurger   ***");
        System.out.println("!!! Cannot add any additional item !!!");
        System.out.println("!!!   However have already provide !!!");
        System.out.println("!!!      Chips and drink           !!!");
        System.out.println("======================================");
    }

    public static void main(String[] args) {

        Scanner mykeyboard = new Scanner(System.in); // create a Scanner Object

        Hamburger_Menu(); // Call the Hamburger Menu method
        System.out.println("Enter your choice: "); // give prompt to the user
        int User_Menu_Choice = mykeyboard.nextInt(); // Collect the user input

        while (User_Menu_Choice != 0){ // give option to the user whether to still using or exit the app
            if (User_Menu_Choice == 1) {
                // create the object for Custom_Hamburger class
                Hamburger hamburger = new Hamburger("roti","Ayam", 4);

                //Create the array to store the data come from the Hamburger class
                String[] User_SelectAdditional = new String[4];
                double[] Price_Additional = new double[4];

                //To valid the user input
                for (int i = 0; i < 4; i++){
                    Additional_CustomHamburger(); // Call the Additional_CustomHamburger method
                    System.out.println("Enter your choice: "); // give prompt to the user
                    int User_Choice = mykeyboard.nextInt(); //Collect user input

                    if (User_Choice == 1){
                        hamburger.AddOns_Additional(1, i); // the data will send to Hamburger class to store the data on specific field
                        User_SelectAdditional[i] = hamburger.getAdditional_Name(i); // Request the data from Hamburger class for storing the data
                        Price_Additional[i] = hamburger.getAdditional_Price(i); // Request the data from Hamburger class for storing the data

                    } else if (User_Choice == 2){
                        hamburger.AddOns_Additional(2,i); // the data will send to Hamburger class to store the data on specific field
                        User_SelectAdditional[i] = hamburger.getAdditional_Name(i); // Request the data from Hamburger class for storing the data
                        Price_Additional[i] = hamburger.getAdditional_Price(i); // Request the data from Hamburger class for storing the data

                    } else if (User_Choice == 3){
                        hamburger.AddOns_Additional(3,i); // the data will send to Hamburger class to store the data on specific field
                        User_SelectAdditional[i] = hamburger.getAdditional_Name(i); // Request the data from Hamburger class for storing the data
                        Price_Additional[i] = hamburger.getAdditional_Price(i); // Request the data from Hamburger class for storing the data

                    } else if (User_Choice == 4){
                        hamburger.AddOns_Additional(4,i); // the data will send to Hamburger class to store the data on specific field
                        User_SelectAdditional[i] = hamburger.getAdditional_Name(i); // Request the data from Hamburger class for storing the data
                        Price_Additional[i] = hamburger.getAdditional_Price(i); // Request the data from Hamburger class for storing the data

                    } else if (User_Choice == 0){ // will indicate the user don't want the additional item
                        break; //TODO: CANNOT GET OUT FROM ADDITIONAL ITEM DISPLAY,,,, FIXED THE BUG
                    }
                }


                System.out.println("======================================");
                for (int k = 0; k < User_SelectAdditional.length; k++){  // Print the data from array
                    System.out.println("* " + (User_SelectAdditional[k]) + " RM" + (Price_Additional[k])); //Display the item that user choose
                }

                System.out.println("======================================");
                hamburger.TotalPrice_Hamburger(Price_Additional); // Display the total price
                System.out.println("======================================");


            } else if (User_Menu_Choice == 2){

                // create the object for Healthy_Hamburger class
                Healthy_Hamburger healthyHamburger = new Healthy_Hamburger("roti","Ayam", 6);

                String[] User_SelectAdditional_healthy = new String[6];
                double[] Price_Additional_healthy = new double[6];

                Additional_HealthyHamburger();
                for (int i = 0; i < 6; i++){
                    System.out.println("Enter your choice: "); // give prompt to the user
                    int User_Choice = mykeyboard.nextInt(); // Collect the user input

                    if (User_Choice == 1){
                        healthyHamburger.AddOns_Additional(1, i);
                        User_SelectAdditional_healthy[i] = healthyHamburger.getAdditional_Name(i);
                        Price_Additional_healthy[i] = healthyHamburger.getAdditional_Price(i);

                    } else if (User_Choice == 2){
                        healthyHamburger.AddOns_Additional(2,i);
                        User_SelectAdditional_healthy[i] = healthyHamburger.getAdditional_Name(i);
                        Price_Additional_healthy[i] = healthyHamburger.getAdditional_Price(i);

                    } else if (User_Choice == 3){
                        healthyHamburger.AddOns_Additional(3,i);
                        User_SelectAdditional_healthy[i] = healthyHamburger.getAdditional_Name(i);
                        Price_Additional_healthy[i] = healthyHamburger.getAdditional_Price(i);

                    } else if (User_Choice == 4){
                        healthyHamburger.AddOns_Additional(4,i);
                        User_SelectAdditional_healthy[i] = healthyHamburger.getAdditional_Name(i);
                        Price_Additional_healthy[i] = healthyHamburger.getAdditional_Price(i);

                    } else if (User_Choice == 0){
                        break;
                    }
                }

                System.out.println("======================================");
                for (int k = 0; k < User_SelectAdditional_healthy.length; k++){
                    System.out.println("* " + (User_SelectAdditional_healthy[k]) + " RM" + (Price_Additional_healthy[k]));
                }

                System.out.println("======================================");
                healthyHamburger.TotalPrice_Hamburger(Price_Additional_healthy);
                System.out.println("======================================");

            } else if (User_Menu_Choice == 3) {
                // create the object for Deluxe_Hamburger class
                Deluxe_Hamburger deluxeHamburger = new Deluxe_Hamburger("roti","Ayam");

                Deluxe_Hamburger();
                System.out.println("* Deluxe Hamburger RM" + deluxeHamburger.getPrice_DeluxeBurger());
                System.out.println("* 100Plus RM" + deluxeHamburger.getPrice_drinks());
                System.out.println("* Chips RM" + deluxeHamburger.getPrice_Chips());
                System.out.println("======================================");
                deluxeHamburger.TotalPrice_Hamburger();
                System.out.println("======================================");
                break;
            }
        }
    }
}
