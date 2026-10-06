package multiThreading;
//Thread Priority
public class Program5 {
	public static void main(String[] args) {
		Thre1 t1=new Thre1("Faisal1");
		Thre1 t2=new Thre1("Faisal2");
		Thre1 t3=new Thre1("Faisal3");
		Thre1 t4=new Thre1("Faisal4 (Most important)");
		t4.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

class Thre1 extends Thread{
	Thre1(String name){
		super(name);
	}
	
	public void run() {
		int i=0;
		while(i<5000) {
			System.out.println("Thank you "+this.getName());
		i++;
		}
	}
}
