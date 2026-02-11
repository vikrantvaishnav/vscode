package Threads;

public class EvenThreadOddThreadWithDifferentClasses {

    // EvenThread class
    static class EvenThread extends Thread {

        @Override
        public void run() {

            int count = 0;

            for(int i = 1; i <= 100; i++) {

                if(i % 2 == 0) {

                    System.out.print(i + " by " + Thread.currentThread().getName() + "\t");

                    count++;

                    if(count % 5 == 0)
                        System.out.println();
                }
            }

            System.out.println();
        }
    }


    // OddThread class
    static class OddThread extends Thread {

        @Override
        public void run() {

            int count = 0;

            for(int i = 1; i <= 100; i++) {

                if(i % 2 != 0) {

                    System.out.print(i + " by " + Thread.currentThread().getName() + "\t");

                    count++;

                    if(count % 5 == 0)
                        System.out.println();
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

        // Create threads
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        // Start EvenThread first
        t1.start();

        // Wait until EvenThread finishes
        t1.join();

        // Start OddThread after EvenThread completes
        t2.start();
    }
}
