import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double shippingCost;

        System.out.println("What is the price of your item?");
        double itemPrice = in.nextDouble();

        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * .02;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("Shipping cost is $" + shippingCost);
        System.out.println("Total price is $" + totalPrice);

        in.close();
    }
}