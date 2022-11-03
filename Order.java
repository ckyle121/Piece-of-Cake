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

        } else {
            System.out.println("Okay, have a wonderful day!");
        }
   }
}
