package staticOne;

public class Main {
    static void main() {
        Account a1 = new Account("BCR");
        Account a2 = new Account("BTRL");
        Account a3 = new Account("BCR");

        System.out.println(a1.getAccountNumber());
        System.out.println(a2.getAccountNumber());
        System.out.println(a3.getAccountNumber());

    }
}
