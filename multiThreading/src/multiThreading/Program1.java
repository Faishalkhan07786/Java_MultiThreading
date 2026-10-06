package multiThreading;
//Creating thread by extending Thread class
public class Program1 {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
	}

}

class Thread1 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<4000) {
			System.out.println("Thread1 is Running.....!");
			System.out.println("I am sad.........!");
		i++;
		}
		
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<4000) {
			System.out.println("Thread2 is running very very faster than everyone");
			System.out.println("I am very happy.....!");
		i++;
		}
	}
}
