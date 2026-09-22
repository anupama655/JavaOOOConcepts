class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running.");
	}
}

public class MultithreadingExample {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
		thread.start();
		thread.join();
		System.out.println("Main thread finished.");
	}
}
