package app_thread;

public class main {

	public static void main(String[] args) {

		TestThread th1 = new TestThread("A");
		TestThread th2 = new TestThread("  B");
		
		th1.start();
		th2.start();
		
	}

}
