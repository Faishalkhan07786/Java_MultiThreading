package multiThreadingPractice;
//get state of a given thread in java
public class Program4 {
	public static void main(String[] args) {
		MyNewThread21 t1=new MyNewThread21();
		System.out.println("Thread 1 state Before Start: "+t1.getState());
		t1.start();
		System.out.println("Thread 1 state After start: "+t1.getState());
		
	}

}

class MyNewThread21 extends Thread{
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("This is my Frist thread");
		i++;
		}
	}
}


