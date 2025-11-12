package multithreadOne;

public class ExtendsThread extends Thread{
    public void run(){
        int i = 1;
        while(i <= 100){
            System.out.println(i + " Hello");
            i++;
        }
    }
}

class Test{
    public static void main(String[] args){
    ExtendsThread t = new ExtendsThread();
        t.start();

        int i = 1;
        while(i <= 100){
            System.out.println(i + "World");
            i++;
        }
    }
}
