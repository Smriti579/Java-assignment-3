class Producer extends Thread {
    private final Object lock;
    Producer(Object lock) {
        this.lock = lock;
    }
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Producing data...");
                Thread.sleep(2000);
                lock.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread {
    private final Object lock;
    Consumer(Object lock) {
        this.lock = lock;
    }
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
                System.out.println("Consuming data...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Object lock = new Object();
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        consumer.start();
        producer.start();
    }
}
