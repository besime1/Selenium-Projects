public class MyRunnable {
    public class MyRunnableDemo {

        public void main(String[] args) {

            myRunnable r1 = new myRunnable();

            myRunnable r2 = new myRunnable();

            myRunnable r3 = new myRunnable();

            Thread t1 = new Thread(r1);

            Thread t2 = new Thread(r2);

            Thread t3 = new Thread(r3);

            t1.start();

            t2.start();

            t3.start();

        }

    }
    class myRunnable implements Runnable {


        public void run() {

            for (int i = 0; i < 10; i++) {

                System.out.println("Hello");

                try {

                    Thread.sleep(300);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }

            }

            System.out.println("Good Bye...");

        }

    }
}
