package Threads;


public class main {
    public static Thread newThread(final String text) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(text + " " + i);
                }
            }
        });
    }
    public static void main(String[] args) {
        Thread t1 = newThread("Thread1");
        Thread t2 = newThread("Thread2");
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
