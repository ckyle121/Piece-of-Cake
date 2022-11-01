import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // cupcake menu array
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        // interact with user to get information about the cupcake store
        System.out.println("We are in the middle of creating the cupcake menu. We currently have 3 cupcakes on the menu, but we need your help to determine pricing of each cupcake!");

        // Scanner takes input from user
        Scanner input = new Scanner(System.in);

        // Vanilla cupcake pricing
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: " );
        cupcake.type();

        System.out.println("How much should we charge for the cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        // convert string to double
        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        // Red Velvet cupcake pricing
        System.out.println("Now we need to decide a price for the red velvet cupcake. Here is the description: ");
        redVelvet.type();

        System.out.println("How much should we charge for the red velvet cupcake?" + "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        // convert string to double
        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        // Chocolate Cupcake pricing
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

        // drink menu array
        ArrayList<Drink> drinkMenu = new ArrayList<>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        // interact with user to get information about the drink menu options
        // water pricing
        System.out.println("We need to decide the pricing for the drinks on the menu" + "\nWhat should we charge for: ");
        water.type();

        priceText = input.nextLine();
        // convert string to double
        price = Double.parseDouble(priceText);

        water.setPrice(price);

        // soda pricing
        System.out.println("What do you think we should charge for: ");
        soda.type();

        priceText = input.nextLine();
        // convert string to double
        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        // milk pricing
        System.out.println("What do you think we should charge for: ");
        milk.type();

        priceText = input.nextLine();
        //convert stirg to double
        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        // add drinks to drink menu array
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
;
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

// Parent Class Drink
class Drink {
    public double price;

    // Getter
    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    // Methods
    public void type(){
        System.out.println("A bottle of water");
    }
}

// Subclass of Drink, Soda Class
class Soda extends Drink {

    @Override
    public void type(){
        System.out.println("A bottle of soda");
    }
}

// Subclass of Drink, Milk Class
class Milk extends Drink {

    @Override
    public void type(){
        System.out.println("A bottle of milk");
    }
}