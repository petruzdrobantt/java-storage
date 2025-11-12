package interfaceOne;

public class interfaceOnce {
    static void main() {
        Store store = new Store();

        Customer c1 = new Customer("ana");
        Customer c2 = new Customer("jaohn");
        Customer c3 = new Customer("taylor");
        Customer c4 = new Customer("big cheese");


        store.register(c1);
        store.register(c3);
        store.register(c4);
        //john is not registrered as a member

        store.inviteSale();
    }
}
