import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        // interact with user to get information about the cupcake store
        System.out.println("We are in the middle of creating the cupcake menu. We currently have 3 cupcakes on the menu, but we need your help to determine pricing of each cupcake!");

        // Scanner takes input from user
        Scanner input = new Scanner(System.in);

        // Vanilla cupcake
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: " );
        cupcake.type();

        System.out.println("How much should we charge for the cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        // convert string to double
        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        // Red Velvet cupcake
        System.out.println("Now we need to decide a price for the red velvet cupcake. Here is the description: ");
        redVelvet.type();

        System.out.println("How much should we charge for the red velvet cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        // convert string to double
        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        // Chocolate Cupcake
        System.out.println("Now we need to decide a price for the chocolate cupcake. Here is the description: ");
        chocolate.type();

        System.out.println("How much should we charge for the chocolate cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        // convert string to double
        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        // Add cupcakes to cupcake menu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
    }
}
// Parent Cupcake Class
class Cupcake {
    public double price;

    // Getters
    public double getPrice(){
        return price;
    }

    // Setters
    public void setPrice(double price){
        this.price = price;
    }

    // Methods
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting.");
    }

}

//Subclass of Cupcake, Red Velvet Class
class RedVelvet extends Cupcake {

    @Override
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

// Subclass of Cupcake, Chocolate Class
class Chocolate extends Cupcake {

    @Override
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}
