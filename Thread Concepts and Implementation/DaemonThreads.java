class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon Thread Running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MainThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Main Thread Running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        MainThread mainThread = new MainThread();
        mainThread.start();
    }
}
