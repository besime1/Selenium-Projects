public class  proje5 {
    public static void main(String[] args) {
         class MyRunnableDemo {

            public void main(String[] args) {

                MyRunnable r1 = new MyRunnable();

                MyRunnable r2 = new MyRunnable();

                MyRunnable r3 = new MyRunnable();

                Thread t1 = new Thread((Runnable) r1);

                Thread t2 = new Thread((Runnable) r2);

                Thread t3 = new Thread((Runnable) r3);

                t1.start();

                t2.start();

                t3.start();

            }

        }
        class MyRunnable implements Runnable {

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
}

