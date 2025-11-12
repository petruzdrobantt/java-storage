package multithreadOne;

//class MyRun implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
//        setPriority(Thread.MIN_PRIORITY + 2);
    }

    public void run(){
        int count = 1;
        while(count <= 300){
            System.out.println(count++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Methods1 {
    public static void main() {
//        Thread t = new Thread(new MyRun());
        MyThread t = new MyThread("Mike");

        System.out.println("ID " + t.threadId());
        System.out.println("NAME " +t.getName());

        System.out.println("PRIORITY " +t.getPriority());

        System.out.println("STATE " + t.getState());
        t.start();
        System.out.println("STATE " + t.getState());
        t.interrupt();
        System.out.println("STATE " + t.getState());

    }
}
