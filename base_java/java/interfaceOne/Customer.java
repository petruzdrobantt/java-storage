package interfaceOne;

public class Customer implements Member {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println(name+": Ok, i will visit");
    }
}
