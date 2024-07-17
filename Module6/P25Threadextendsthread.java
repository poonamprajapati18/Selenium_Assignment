package Java_Assignment;

class ByThread extends Thread{
	@Override
	public void run() {
		for (int i= 1;i<=5;i++) {
			try {
				System.out.println(i+" by runnable ");
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class P25Threadextendsthread {
public static void main(String[] args) {
	Thread t = new Thread();
	System.out.println(t.currentThread());
	t.setName("My thread");
	System.out.println(t);
	System.out.println();
}

	

}
