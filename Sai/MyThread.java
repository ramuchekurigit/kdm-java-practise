package Com.Thread.org;
public class MyThread extends Thread {
	  public static void main(String[] args) {
	    MyThread thread = new MyThread();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}



