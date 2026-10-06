package multiThreading;
//sleep() method 
public class Program7 {
	public static void main(String[] args) {
		MyNewThread1 t1=new MyNewThread1();
		MyNewThread2 t2=new MyNewThread2();
		t1.start();
		t2.start();
	}

}

class MyNewThread1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("This my Thread class without sleep method");
		}
	}
}

class MyNewThread2 extends Thread{
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(true) {
		System.out.println("Thread class with sleep method");
		}
	}
}
