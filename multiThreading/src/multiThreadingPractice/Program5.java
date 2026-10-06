package multiThreadingPractice;
//Get reference to the current thread in java
public class Program5 {
		public static void main(String[] args) {
			MyNewThread23 t1=new MyNewThread23("Faisal");
			System.out.println(Thread.currentThread().getName()); //this will give the output main thread which is executed by jvm (The default name of the main thread is "main") 
			t1.start();
			System.out.println(t1.getName());//this will give the output Faisal coz this the t1 thread
		}
}

class MyNewThread23 extends Thread{
	MyNewThread23(String name){
		super(name);
	}
	
	public void run() {
		int i=0;
		while(i<2) {
			System.out.println("This is my new Thread");
		i++;	
		}
	}
}