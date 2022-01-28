package techno;
class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("child Tread");
		}
	}
}

public class TreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread m=new Mythread();
		Thread t=new Thread(m);
		t.start();
	System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
	}
	}
}
		


