class Bank {
    public static void main(String[] args) {
        double balance = 1000; // initial balance

        double deposit1 = 500;
        balance += deposit1;
        System.out.println("Deposited: " + deposit1 + " | Balance: " + balance);

        double withdraw1 = 200;
        balance -= withdraw1;
        System.out.println("Withdrawn: " + withdraw1 + " | Balance: " + balance);
    }
}
