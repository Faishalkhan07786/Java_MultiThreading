package multiThreadingPractice;
//Add a step method in welcome thread of question 1 to delay its execution for 200 ms
public class Program2 {
	public static void main(String[] args) {
		thread12 t1=new thread12();
		thread22 t2=new thread22();
		t1.start();
		t2.start();
	}

}

class thread12 extends Thread{
	public void run() {
		int i=0;
		while(i<300) {
			System.out.println("Good Morning");
		i++;	
		}
	}
}

class thread22 extends Thread{
	public void run() {
		int i=0;
		while(i<300) {
			try {
				Thread.sleep(200);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			System.out.println("Welcome");
		i++;	
		}
	}
}
