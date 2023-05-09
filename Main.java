//Name: Muhammad Firdaus Fadlizam
//Created date: February 6, 2023
//Modified date: February 20,2023
//Program name: Device Testing
//Description: This program utilizes abstract factory pattern and singleton pattern to conduct tests on devices.


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Modify pathname to change file.
        Scanner scanner = new Scanner (new File("C://Firdaus//Configuration.txt"));
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if(input.equals("Laptop")){

                AbstractFactoryDevice abstractLaptop = ConcreteLaptop.getInstance();
                //if two instances exist, the program will return null and skip the test.
                if(abstractLaptop == null)
                    continue;
                Client c = new Client(abstractLaptop);
                c.run();
                System.out.println();
            }

            if(input.equals("Smartphone")) {

                AbstractFactoryDevice abstractSmartphone = ConcreteSmartphone.getInstance();
                if (abstractSmartphone == null)
                    continue;
                Client c = new Client(abstractSmartphone);
                c.run();
                System.out.println();
            }

            if(input.equals("Smartwatch")) {

                AbstractFactoryDevice abstractSmartwatch = ConcreteSmartwatch.getInstance();
                if (abstractSmartwatch == null)
                    continue;
                Client c = new Client(abstractSmartwatch);
                c.run();
                System.out.println();
            }

            if(input.equals("Tablet")) {

                AbstractFactoryDevice abstractTablet = ConcreteTablet.getInstance();
                if (abstractTablet == null)
                    continue;
                Client c = new Client(abstractTablet);
                c.run();
                System.out.println();
            }
        }

    }
}