package javathreads;

public class PreventConcurrency extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        PreventConcurrency thread = new PreventConcurrency();
        thread.start();
        while (thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Main: "+ amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    @Override
    public void run(){
        amount++;
    }
}
