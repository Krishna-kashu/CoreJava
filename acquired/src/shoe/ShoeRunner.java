package shoe;

public class ShoeRunner {

        public static void main(String[] args) {

            System.out.println("\n******Accessory ******");
            Accessory accessory = new Accessory();
            accessory.style();

            System.out.println("\n****** Shoe ******");
            Shoe shoe = new Shoe();
            shoe.wear();
            shoe.style();

            System.out.println("\n=****** Sneaker ******");
            Sneaker sneaker = new Sneaker();
            sneaker.comfort();
            sneaker.wear();
            sneaker.style();
        }

}
