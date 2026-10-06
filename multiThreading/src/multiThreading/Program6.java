package multiThreading;
//Join() method 
public class Program6 {
	public static void main(String[] args){
		MyNewThr1 t1=new MyNewThr1();
		MyNewThr2 t2=new MyNewThr2();
		
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		t2.start();
		
       /*t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());;
		}
		t1.start();*/
	}

}

class MyNewThr1 extends Thread{
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("This is my new Thread 1");
		i++;
		}
	}
}

class MyNewThr2 extends Thread{
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("This is thread 2");
		i++;
		}
	}
}
