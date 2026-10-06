package multiThreadingPractice;
//Demonstrate getPriority() method and setPriority() method
public class Program3 {
	public static void main(String[] args) {
		MyNewThr t1=new MyNewThr();
		MyNewThr1 t2=new MyNewThr1();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
	}

}

class MyNewThr extends Thread {
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("This Thread is my frist thread");
		i++;	
		}
	}
}

class MyNewThr1 extends Thread{
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("Second thread is here");
		i++;	
		}
	}
}
