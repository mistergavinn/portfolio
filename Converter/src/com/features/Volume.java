package com.features;

public class Volume {
    
    public static void convert(int source, int target, float temp) {
        float result =0;
        //defining input metric
        switch (source) {
            case 1: // litre
            if (target==2){ //litre to ounce
                result = temp * 35.195f;
                break;
            } 
            else if(target==3) { //litre to cubic meter
                result = temp/1000f;
                break;
            }
            else if(target==4) { //litre to tablespoon
                result = temp*56.312f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            case 2: // Ounces
            if (target==2){ //Ounce to litre
                result = temp / 35.195f;
                break;
            } 
            else if(target==3) { //Ounce to cubic meter
                result = temp/33814f;
                break;
            }
            else if(target==4) { //Ounce to tablespoon
                result = temp*1.665f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            case 3: // Cubic meter
            if (target==2){ //Cubic meter to litre
                result = temp *1000f;
                break;
            } 
            else if(target==3) { //cubic meter to ounces
                result = temp/35195f;
                break;
            }
            else if(target==4) { //cubic meter to tablespoon
                result = temp*56312f;
                break;
            }
            else {
                System.out.println("Invalid option");
            }
            case 4: // Tablespoon
            if (target==2){ //tblspoon to litre
                result = temp /56.312f;
                break;
            } 
            else if(target==3) { //tblspn to ounces
                result = temp/1.6f;
                break;
            }
            else if(target==4) { //tblspn to cubic meter
                result = temp/56312f;
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

//litre, ounce, cubic meter, tablespoon