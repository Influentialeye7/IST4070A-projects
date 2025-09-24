public class publicaccount {
    int accountNo;
    String accountName;
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}