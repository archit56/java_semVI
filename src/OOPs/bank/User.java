package OOPs.bank;

// contains the method LocalTime.now() which gives the current time
import java.time.LocalTime;

class User {
    String name;
    String branch;
    double balance;
    double starting_bal;
    long account_num;
    static long account_counter = 10000000000L;
    User (String name, String branch) {
        this.name = name;
        this.branch = branch;
        this.starting_bal = 0;
        this.account_num = account_counter++;
    }

    public void check_lunch_time(){
        // (java.time.LocalTime.now() + "") returns a string which is typecasted to int
        int time_now = Integer.parseInt((LocalTime.now() + "").substring(0, 2));
        if(time_now >= 13 && time_now <= 14) {
            System.out.println("Lunch time :), come back later");
            // System.exit() method is used to exit out of a running program, normally 0 is passed as an argument
            System.exit(0);
        }
    }

    public void printInfo() {
        check_lunch_time();
        System.out.println("Name = " + this.name);
        System.out.println("Branch = " + this.branch);
        System.out.println("Account number = " + this.account_num);
        System.out.println("Balance = " + this.balance);

    }

    public void withdraw(int withdraw_amount) {
        check_lunch_time();
        System.out.println("************************************");
        if (withdraw_amount > 15000)
            System.out.println("Withdraw limit reached");
        else {
            if (this.balance - withdraw_amount >= 0) {
                this.balance -= withdraw_amount;
                System.out.println("Balance withdrawal successful");
                print_bal();
            } else System.out.println("Cannot withdraw specified amount, Insufficient balance");
        }
    }

    public void deposit(int deposit_amount) {
        check_lunch_time();
        System.out.println("************************************");
        this.balance += deposit_amount;
        System.out.println("Balance deposit successful");
        print_bal();
    }

    public void print_bal() {
        check_lunch_time();
        System.out.println("************************************");
        System.out.println("Your current balance = " + balance);
    }

    //////////////////////////////////// loan section - start //////////////////////////////////////////////////

    public void loan(int loan_principal, int time_in_years) {
        check_lunch_time();
        System.out.println("************************************");
        System.out.println("Initialising loan process...");
        double loan_amount_payable = loan_amount_calc(loan_principal, time_in_years);
        System.out.println("Loan payable amount = " + loan_amount_payable);
    }

    public double loan_amount_calc(double loan_principal, int time_in_years) {
        check_lunch_time();
        double loan_amount;
        double rate = 12;

        loan_amount = loan_principal*(Math.pow((1 + rate/100), time_in_years));

        return loan_amount;
        //////////////////////////////////// loan section - end //////////////////////////////////////////////////
    }
}

