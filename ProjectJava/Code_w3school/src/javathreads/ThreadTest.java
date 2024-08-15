package javathreads;


public class ThreadTest extends Thread {
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        thread.start();
        System.out.println("This code is outsided of the thread");
    }
    @Override
    public void run(){
        System.out.println("This code is excuted in a thread");
    }
}
