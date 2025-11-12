package multithreadOne;

class MyThread2 extends Thread{
    public void run(){
        int count = 1;
        while(count <= 3000){
            System.out.println(count++ + "Mythread");
        }
    }
}

public class Methods2 {
    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2();
//        t.setDaemon(true);
        t.start();

//        Thread mainThread = Thread.currentThread();
//        mainThread.join();

        int count = 1;
        while(count <= 3000){
            System.out.println(count++ + "Main");
            Thread.yield(); //allows more of the other thread to run
        }
    }
}
