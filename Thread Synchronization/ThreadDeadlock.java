class Resource1 {
    synchronized void method1(Resource2 r2) {
        System.out.println("Thread 1: Holding Resource1... waiting for Resource2");
        try { Thread.sleep(100); } catch (InterruptedException e) { }
        r2.last();
    }
    synchronized void last() {
        System.out.println("Thread 1: Inside Resource1");
    }
}
class Resource2 {
    synchronized void method1(Resource1 r1) {
        System.out.println("Thread 2: Holding Resource2... waiting for Resource1");
        try { Thread.sleep(100); } catch (InterruptedException e) { }
        r1.last();
    }
    synchronized void last() {
        System.out.println("Thread 2: Inside Resource2");
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        final Resource1 r1 = new Resource1();
        final Resource2 r2 = new Resource2();
        Thread t1 = new Thread() {
            public void run() {
                r1.method1(r2);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                r2.method1(r1);
            }
        };
        t1.start();
        t2.start();
    }
}
