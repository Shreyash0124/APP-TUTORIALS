class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
