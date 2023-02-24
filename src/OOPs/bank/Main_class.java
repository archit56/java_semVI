package OOPs.bank;

class Main_class {
    public static void main(String[] args) {
        // user 1st
        User archit = new User("Archit", "DAVV");

        archit.check_lunch_time();

//        archit.printInfo();
        archit.deposit(1000);
        archit.withdraw(5000);
        archit.printInfo();

        archit.loan(10000, 2);
    }
}

