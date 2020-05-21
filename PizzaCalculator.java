// Copyright (c) Ac industries All rights reserved  
//
// Created by: Andrew Coxall
// Created on: May 21, 2020
// Cost of a pizza calculator

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.NumberFormat;
import java.util.Locale;

public class PizzaCalculator {



    public static void main(String[] args) throws IOException { 

        final double HST = 0.13;
        final double labor = 0.75;
        final double rent = 1.00;
        final double costPerInch = 0.50;

        String radius1;
        double subTotal;
        double total;
        double radiusAsDouble;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.print("Enter the diameter of the pizza you would like (inch): ");

        

        try {

            radius1 = br.readLine();
            
            radiusAsDouble = Double.parseDouble(radius1);

            subTotal = labor + rent * (radiusAsDouble*costPerInch);
            total = subTotal + (subTotal*HST);
            
            System.out.println("");
            System.out.println("The cost of your pizza is: ");
            System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(total));

        } catch(NumberFormatException nfe) {

            System.err.println("Invalid input!");

        }

        

        System.out.println();

        System.out.println("Done.");

    }



}
