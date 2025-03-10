class ThreadWithPriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
    public static void main(String[] args) {
        Thread t1 = new ThreadWithPriority();
        Thread t2 = new ThreadWithPriority();
        Thread t3 = new ThreadWithPriority();
        t1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        t2.setPriority(Thread.NORM_PRIORITY); // Default priority
        t3.setPriority(Thread.MAX_PRIORITY); // Highest priority
        t1.start();
        t2.start();
        t3.start();
    }
}
