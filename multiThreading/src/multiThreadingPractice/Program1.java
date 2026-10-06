package multiThreadingPractice;
//Print "Good morning" and "Welcome" continuously using thread
public class Program1 {
	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
	}

}

class thread1 extends Thread{
	public void run() {
		while(true) {
		System.out.println("Good Morning");
		}
	}
}

class thread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Welcome");
		}
	}
}
