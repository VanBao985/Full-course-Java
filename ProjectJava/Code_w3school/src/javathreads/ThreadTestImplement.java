package javathreads;

public class ThreadTestImplement implements Runnable{
    public static void main(String[] args) {
        ThreadTestImplement obj = new ThreadTestImplement();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outsided of the thread");
    }
    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
