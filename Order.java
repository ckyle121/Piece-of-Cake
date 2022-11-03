import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        System.out.println("Hello customer, would you like to place an order? (Y/N)");

        // Scanner to collect input from user
        Scanner input = new Scanner(System.in);

        String placeOrder = input.nextLine();

        // create an array list of objects to store order
        ArrayList<Object> order = new ArrayList<>();

        if (placeOrder.equalsIgnoreCase("y")){
            // add date and time to order array
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            // loop through cupcake menu
            System.out.println("Here is our menu" + "\nCupcakes: ");

            int itemNumber = 0;

            for (int i = 0; i < cupcakeMenu.size(); i++){
                itemNumber++;
                System.out.print(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }

            // loop through the drinks menu
            System.out.println("Drinks: ");

            for (int i = 0; i  < drinkMenu.size(); i++){
                itemNumber++;
                System.out.print(itemNumber);
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }

            // take customer's order
            boolean ordering = true;

            while (ordering = true){
                System.out.println("What would you like to order?" + "\nPlease use the number associated with each item to order.");
                int orderChoice = input.nextInt();
                // call input.nextLine to fix scanner after calling nextInt
                input.nextLine();

                if (orderChoice == 1){
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Added Item to Order");
                } else if (orderChoice == 2){
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Added Item to Order");
                } else if (orderChoice == 3) {
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Added Item to Order");
                } else if (orderChoice == 4) {
                    order.add(drinkMenu.get(0));
                    System.out.println("Added Item to Order");
                } else if (orderChoice == 5){
                    order.add(drinkMenu.get(1));
                    System.out.println("Added Item to Order");
                } else if (orderChoice == 6) {
                    order.add(drinkMenu.get(2));
                    System.out.println("Added Item to Order");
                } else {
                    System.out.println("Sorry, we don't see to have that item on the menu.");
                }

                System.out.println("Would you like to continue ordering? (Y/N)");

                String continueOrder = input.nextLine();

                if (!continueOrder.equalsIgnoreCase("Y")){
                    ordering = false;
                }
            }

            // generate a receipt for the order from customer

            // get first two items in order array (date & time)
            System.out.println(order.get(0)); // the date
            System.out.println(order.get(1)); // the time

            double subtotal = 0.00;
            
            
            //loop through order, checking for menu item, and adding that price of the menu item to the subtoatl 
            
            for (int i = 2; i < order.size(); i++){
                if (order.get(i).equals(cupcakeMenu.get(0))){
                    cupcakeMenu.get(0).type();
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    subtotal += cupcakeMenu.get(0).getPrice();
                } else if (order.get(i).equals(cupcakeMenu.get(1))) {
                    cupcakeMenu.get(1).type();
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    subtotal += cupcakeMenu.get(1).getPrice();
                } else if (order.get(i).equals(cupcakeMenu.get(2))) {
                    cupcakeMenu.get(2).type();
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    subtotal += cupcakeMenu.get(2).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(0))) {
                    drinkMenu.get(0).type();
                    System.out.println(drinkMenu.get(0).getPrice());
                    subtotal += drinkMenu.get(0).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(1))) {
                    drinkMenu.get(1).type();
                    System.out.println(drinkMenu.get(1).getPrice());
                    subtotal += drinkMenu.get(1).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(2))) {
                    drinkMenu.get(2).type();
                    System.out.println(drinkMenu.get(2).getPrice());
                    subtotal += drinkMenu.get(2).getPrice();
                }

                // print subtotal
                System.out.println("$" + subtotal + "\n");
            }

        } else {
            System.out.println("Okay, have a wonderful day!");
        }
   }
}

class CreateFile {
    public CreateFile(){
        try {
           File salesData = new File("salesData.txt");

           if (salesData.createNewFile()){
               System.out.println("File created: " + salesData.getName());
           } else {
               System.out.println("File already exists");
           }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}

class WriteToFile {
    public WriteToFile(ArrayList<Object> order){
        try {
            FileWriter fw = new FileWriter("salesData.txt", true);
            PrintWriter salesWriter = new PrintWriter(fw);

            // write each element in order to file
            for (int i = 0; i < order.size(); i++){
                salesWriter.println(order.get(i));
            }

            // stop the writer from continuing to wrun
            salesWriter.close();

            System.out.println("Successfully wrote to file");

        } catch (IOException e){
            System.out.println("An error occured");
        }
    }
}
