public class SingletonExample {
    private final int attribute;
    private static SingletonExample instance;

    private SingletonExample(){
        attribute = 1;
    }

    public static SingletonExample getInstance(){
        if(instance == null)
            instance = new SingletonExample();
        return instance;
    }
//    That means there is no existing object to call a normal (non-static) method on.
//
//    Static methods belong to the class itself, not to any instance.
//
//    Therefore, getInstance() must be static so you can call it without having an object:
}
