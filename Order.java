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

        } else {
            System.out.println("Okay, have a wonderful day!");
        }

   }
}
