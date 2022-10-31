public class Main {
    public static void main(String[] args) {

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
