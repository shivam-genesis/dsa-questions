package threads;

public class Constructors {
	public static void main(String[] args) {
		Study s1 = new Study("Shivam");
		Study s2 = new Study("Ram");
		
		
		Play p = new Play();
		Thread t1 = new Thread(p,"Shivam");
		
		t1.start();
		
		System.out.println("Thread 1 ID: "+s1.getId());
		System.out.println("Thread 1 name: "+s1.getName());
		
		System.out.println("Thread 2 ID: "+s2.getId());
		System.out.println("Thread 2 name: "+s2.getName());
		
		
		System.out.println(t1.getName());
	}
}

class Study extends Thread{
	Study(String name){
		super(name);
	}
	public void run() {
		System.out.println("Study");
	}
}

class Play implements Runnable{
	
	public void run() {
		System.out.println("Playing");
	}
}
