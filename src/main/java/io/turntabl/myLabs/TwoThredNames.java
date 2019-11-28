package io.turntabl.myLabs;

public class TwoThredNames {
    public static void main(String args[]) {
        Thread thread1 = new Thread(() -> {
            try{
                Thread.sleep(10000);
                System.out.println("thread one");
            }catch(InterruptedException ie){}
        });
        Thread thread2 = new Thread(() -> {
            try{
                Thread.sleep(10000);
                System.out.println("thread two");
            }catch(InterruptedException ie){}
        });

        thread1.start();
        thread2.start();

        System.out.println("Main thread wait for the two threads for 10secs");


   /*     Thread t1 = new Thread(() ->
                System.out.println("i am thread one"));


        Thread t2 = new Thread(() ->
                System.out.println("i am thread two"));

        t1.start();
        t2.start();

        System.out.println("main method waits until the threads are finished");

    */
    }
}

