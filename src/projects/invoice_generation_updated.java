package projects;
import java.util.*;

public class invoice_generation_updated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] amount = new double[5];

        System.out.println("Select from the option: ");
        System.out.println("1. Dine in");
        System.out.println("2. Delivery");
        int option = sc.nextInt();

        double delivery_charge = 0;

        if(option == 2) {
            System.out.println("Select distance: ");
            System.out.println("Option 1) 0 - 5 kms");
            System.out.println("Option 2) 6 - 10 kms");
            System.out.println("Option 3) 11 - 15 kms");

            int distance = sc.nextInt();
            switch (distance) {
                case 1:
                    delivery_charge = 30;
                    break;

                case 2:
                    delivery_charge = 50;
                    break;

                case 3:
                    delivery_charge = 80;
                    break;
            }

        }

        double tax;


        int[] count = {0, 0, 0, 0, 0};

        tax = option == 2 ? 0.05 : 0.18;


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
                    amount[0] = amount[0] + quantity*(80);
                    count[0] = count[0] + quantity;
                    break;

                case 2:
                    amount[1] = amount[1] + quantity*(150);
                    count[1] = count[1] + quantity;
                    break;

                case 3:
                    amount[2] = amount[2] + quantity*(50);
                    count[2] = count[2] + quantity;
                    break;

                case 4:
                    amount[3] = amount[3] + quantity*(70);
                    count[3] = count[3] + quantity;
                    break;

                case 5:
                    amount[4] = amount[4] + quantity*(80);
                    count[4] = count[4] + quantity;
                    break;

            }



        }
        double total = 0;

        for(double item: amount) {
            total = total + item;
        }

//        // for each loop for array amount[]
//        for(int


//        i = 0; i < 5; i++) {
//            total = total + amount[i];
//        }

        double tax_amount;
        tax_amount = total*(tax);

        double total_amount = total + tax_amount + delivery_charge;


        System.out.println("******** INVOICE *********");
        if(count[0] != 0)
            System.out.println("Burger:       " + "80 * " + count[0] + " = " + amount[0]);
        if(count[1] != 0)
            System.out.println("Pizza:        " + "150 * " + count[1] + " = " + amount[1]);
        if(count[2] != 0)
            System.out.println("French fries: " + "50 * " + count[2] + " = " + amount[2]);
        if(count[3] != 0)
            System.out.println("Sandwitch:    " + "70 * " + count[3] + " = " + amount[3]);
        if(count[4] != 0)
            System.out.println("Noodles:      " + "80 * " + count[4] + " = " + amount[4]);

        System.out.println("------------------------");

        System.out.println("Total:           " + total);
        System.out.println("Tax:             "+ tax_amount);
        System.out.println("Delivery Charge: "+ delivery_charge);

        System.out.println("Total Amount:    " + total_amount);
        System.out.println("********** END **********");

    }

    public static void print_menu() {
        System.out.println("***** MENU *****");
        System.out.println("1. Burger: 80");
        System.out.println("2. Pizza: 150");
        System.out.println("3. French fries: 50");
        System.out.println("4. Sandwich: 70");
        System.out.println("5. Noodles: 80");
        System.out.println("6. Exit menu");
        System.out.println("***** END *****");
    }

}
