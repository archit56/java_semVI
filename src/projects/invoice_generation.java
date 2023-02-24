package projects;
import java.util.*;

public class invoice_generation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = 0;

        System.out.println("Select from the option: ");
        System.out.println("1. Dine in");
        System.out.println("2. Delivery");
        int option = sc.nextInt();

        double tax;
        int delivery_charge;
        tax = option == 2 ? 0.18 : 0.05;
        delivery_charge = option == 2 ? 40 : 0;

        while(true) {
            print_menu();

            System.out.println("Select your order: ");
            int order = sc.nextInt();

            if(order == 6)
                break;

            System.out.println("Select quantity: ");
            int quantity = sc.nextInt();

            switch (order) {
                case 1:
                    amount = amount + quantity*(50 + 50*tax + delivery_charge);
                    break;

                case 2:
                    amount = amount + quantity*(100 + 100*tax + delivery_charge);
                    break;

                case 3:
                    amount = amount + quantity*(50 + 50*tax + delivery_charge);
                    break;

                case 4:
                    amount = amount + quantity*(70 + 70*tax + delivery_charge);
                    break;

                case 5:
                    amount = amount + quantity*(80 + 80*tax + delivery_charge);
                    break;

            }
        }
        print_invoice(amount);
    }

    public static void print_menu() {
        System.out.println("***** MENU *****");
        System.out.println("1. Burger: 50");
        System.out.println("2. Pizza: 100");
        System.out.println("3. French fries: 50");
        System.out.println("4. Sancdwitch: 70");
        System.out.println("5. Noodles: 80");
        System.out.println("6. Exit menu");
        System.out.println("***** END *****");
    }

    public static void print_invoice(double amount) {
        System.out.println("Amount = " + amount);
    }
}
