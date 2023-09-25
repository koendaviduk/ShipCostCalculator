import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        System.out.print("Enter your item price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100)
            {
                double shippingPrice = 0;
                double totalPrice = shippingPrice + itemPrice;
                System.out.println("Your total shipping cost is: " + shippingPrice + " and your total price is: " + totalPrice);

            }
            else
            {
                double shippingPrice = itemPrice * 0.02;
                double totalPrice = shippingPrice + itemPrice;
                System.out.println("Your total shipping cost is: " + shippingPrice + " and your total price is: " + totalPrice);

            }
        }
        else
        {
            System.out.println("Please run again and enter a valid amount!");
        }

    }
}