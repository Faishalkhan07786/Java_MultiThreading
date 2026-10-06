package multiThreading;
//Creating thread by using Thread constructor  Thread(String name)
public class Program3 {
	public static void main(String[] args) {
		MyThr1 t1=new MyThr1("Faisal");
		MyThr2 t2=new MyThr2("Khan");
		t1.start();
		t2.start();
		System.out.println("Id of first thread is: "+t1.getId());
		System.out.println("Name of first thread is: "+t1.getName());
		System.out.println("Id of the second thread is: "+t2.getId());
		System.out.println("Name of the second thread is: "+t2.getName());
		
	}
}

class MyThr1 extends Thread{
	MyThr1(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("This is my first thread");
		
	}
}

class MyThr2 extends Thread{
	MyThr2(String name){
		super(name);
	}
	
	public void run() {
		System.out.println("My Thread 2 is running ver fast...!");
	}
}