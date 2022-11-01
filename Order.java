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

            System.out.println("Here is our menu" + "\nCupcakes: ");

            int itemNumber = 0;

            for (int i = 0; i < cupcakeMenu.size(); i++){
                itemNumber++;
                System.out.print(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }


        } else {
            System.out.println("Okay, have a wonderful day!");
        }

   }
}
