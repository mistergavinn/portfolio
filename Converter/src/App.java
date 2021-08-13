import java.util.Scanner;

import com.features.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Temperature");
        System.out.println("2. Distance");
        System.out.println("3. Volume");
        System.out.println("4. Currency");
        System.out.println("Select parameters for conversion:");
        int option = input.nextInt();

        switch (option) {

            case 1: // Temperature conversion
            System.out.println("Temperature conversion selected");
            System.out.println("\n1. Celsius");
            System.out.println("2. Kelvin");
            System.out.println("3. Fahrenheit");
            System.out.println("Select source metric:");
            int tempIn = input.nextInt();
            System.out.println("Select desired metric:");
            int tempTarget = input.nextInt();
            System.out.println("Input temperature:");
            float tempOut = input.nextFloat();
        
            Temperature.convert(tempIn, tempTarget, tempOut);
            break;

            case 2: // Distance conversion
            System.out.println("Distance conversion selected");
            System.out.println("\n1. Kilometers");
            System.out.println("2. Miles");
            System.out.println("3. Feet");
            System.out.println("Select source metric:");
            int distIn = input.nextInt();
            System.out.println("Select desired metric:");
            int distTarget = input.nextInt();
            System.out.println("Input distance:");
            float distOut = input.nextFloat();

            Distance.convert(distIn, distTarget, distOut);
            break;

            case 3: // Volume conversion
            System.out.println("Volume conversion selected");
            System.out.println("\n1. Litres");
            System.out.println("2. Ounces");
            System.out.println("3. Cubic Meter");
            System.out.println("4. Imperial tablespoon");
            System.out.println("Select source metric:");
            int volIn = input.nextInt();
            System.out.println("Select desired metric:");
            int volTarget = input.nextInt();
            System.out.println("Input volume:");
            float volOut = input.nextFloat();

            Volume.convert(volIn, volTarget, volOut);
            break;

            default:
            System.out.println("Invalid selection! Please select from the given options!");
        }

        input.close();
    }
}


// Things to convert
// Temperature (done)
// Distance
// Volume
// Calculator