package javabasics;

public class ThreadExample extends Thread {
    public void run(){
        System.out.println("Business Task : "+ Thread.currentThread().getId());
        System.out.println("Developer Task : "+ Thread.currentThread().getId());
        System.out.println("Tester Task : "+ Thread.currentThread().getId());
    }
}

class threadEx {
    public static void main(String[] args) {
        for(int i=0;i<4;i++) {
            ThreadExample th = new ThreadExample();
            // th.run(); // Sequestional Order
            th.start();
        }
    }
}
