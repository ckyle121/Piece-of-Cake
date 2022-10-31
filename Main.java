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
}
