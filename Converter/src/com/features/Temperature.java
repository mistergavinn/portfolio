package com.features;

import java.lang.Math;

public class Temperature {

    public static void convert(int source, int target, float temp) {
        float result=0;
        float constant=(5f/9f);
        //defining input metric
        switch (source) {
            case 1: // Celsius 
            if (target==2){ //Celsius to Kelvin
                result = temp + 273.15F;
                break;
            } 
            else if(target==3) { //Celsius to Fahrenheit 
                result = (temp*1.8f)+32;
                break;
            }
            else {
                System.out.println("Invalid option");
            }

            case 2: // Kevin
            if (target==1){ //Kelvin to Celsius
                result = temp - 273.15F;
                break;
            } 
            else if(target==3) { //Kelvin to Fahrenheit 
                result = (temp - 273.15f)*1.8f+32;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            
            case 3: // Fahrenheit
            if (target==1){ //Fahrenheit to Celsius
                result = (temp - 32f)*constant;
                break;
            } 
            else if(target==2) { //Fahrenheit to Kelvin 
                result = ((temp - 32f)*constant) +273.15f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
        }
        double roundOff = Math.round(result * 100.0)/100.0;
        System.out.println("\nConverted value is: "+roundOff);
    }
}