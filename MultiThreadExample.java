import java.io.*;
class MyThread extends Thread {
    private String message;
    public MyThread(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500);
            } 
        catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.start();
        thread2.start();
        try {
           
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("Main thread finished.");
    }
}
