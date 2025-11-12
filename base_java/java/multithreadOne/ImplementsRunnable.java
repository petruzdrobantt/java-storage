package multithreadOne;

public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(i <= 100){
            System.out.println(i + " Hello");
            i++;
        }
    }
}

class Test2{
    public static void main(String[] args){
        ImplementsRunnable m = new ImplementsRunnable();
        Thread t =new Thread(m);
        t.start();

        int i = 1;
        while(i <= 100){
            System.out.println(i + "World");
            i++;
        }
    }
}
