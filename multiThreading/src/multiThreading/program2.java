package multiThreading;

//Creating thread by implementing runnable interface
public class program2 {
	public static void main(String[] args) {
		MyThreadRunnable1 th1=new MyThreadRunnable1();
		MyThreadRunnable2 th2=new MyThreadRunnable2();
		
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		
		t1.start();
		t2.start();
		
	}
}

class MyThreadRunnable1 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("My Runnable thread one is Running");
			System.out.println("I am enjoying learning thread");
		i++;
		}
		
	}
}

class MyThreadRunnable2 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("Running Second Thread");
			System.out.println("Second is very fast");
		i++;
		}
	}
}