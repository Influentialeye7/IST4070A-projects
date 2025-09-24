public class objects {

    public static void main(String[] args) {

        publicaccount emmaAccount = new publicaccount(); //creating an object
        emmaAccount.accountNo = 1423;
        emmaAccount.accountName = "Emma";
        emmaAccount.balance = 500;

        System.out.println("A/c no: " + emmaAccount.accountNo +
                "\nA/c name: " + emmaAccount.accountName + "Balance: "
                + emmaAccount.balance);
    }
}