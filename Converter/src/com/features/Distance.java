package com.features;

public class Distance {
    
    public static void convert(int source, int target, float temp) {
        float result =0;
        //defining input metric
        switch (source) {
            case 1: // Kilometers
            if (target==2){ //KM to Miles
                result = temp /1.609f;
                break;
            } 
            else if(target==3) { //KM to feet
                result = temp*3281f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            case 2: // Miles
            if (target==1){ //Miles to KM
                result = temp *1.609f;
                break;
            } 
            else if(target==3) { //Miles to feet
                result = temp*5280f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            case 3: // Feet
            if (target==2){ //Feet to Km
                result = temp /3280f;
                break;
            } 
            else if(target==3) { //Feet to miles
                result = temp/5280f;
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

//kilometers, miles, feet