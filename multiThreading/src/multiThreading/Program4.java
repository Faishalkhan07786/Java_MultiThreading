package multiThreading;
//Creating thread by using Thread constructor  Thread(Runnable r, String name)
public class Program4 {
	public static void main(String[] args) {
		MyThreRunnable1 th1=new MyThreRunnable1();
		MyThre t1=new MyThre(th1, "Faisal");
		t1.start();
	}
}

class MyThre extends Thread{
	MyThre(Runnable r, String name){
		super(r,name);
	}
	
	public void run() {
		super.run();
		System.out.println("This is thread class");
	}
	
}

class MyThreRunnable1 implements Runnable{
	public void run() {
		System.out.println("This is runnable class");
	}
}
