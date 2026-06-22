
import java.util.concurrent.Semaphore;

// The Foo class handles the synchronization logic
class Foo {
    Semaphore run2;
    Semaphore run3;

    public Foo() {
        run2 = new Semaphore(0);
        run3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first"
        printFirst.run();
        run2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        run2.acquire();
        // printSecond.run() outputs "second"
        printSecond.run();
        run3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        run3.acquire();
        // printThird.run() outputs "third"
        printThird.run();
    }
}

// The public class name MUST match the file name: PrintInOrder.java
public class PrintInOrder {
    public static void main(String[] args) {
        Foo foo = new Foo();

        // Define the printing actions
        Runnable printFirst = () -> System.out.print("first");
        Runnable printSecond = () -> System.out.print("second");
        Runnable printThird = () -> System.out.print("third");

        // Create Thread A
        Thread threadA = new Thread(() -> {
            try {
                foo.first(printFirst);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create Thread B
        Thread threadB = new Thread(() -> {
            try {
                foo.second(printSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create Thread C
        Thread threadC = new Thread(() -> {
            try {
                foo.third(printThird);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start threads out of order to prove the Semaphores work
        System.out.println("Starting threads asynchronously...");
        
        threadC.start();
        threadB.start();
        threadA.start();
    }
}