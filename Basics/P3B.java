import java.util.*;
class MyThread1 extends Thread
{
	public void run()
	{
		int i=1;
		Scanner read=new Scanner(System.in);
		System.out.println("enter the number of random numbers\n");
		int n=read.nextInt();
		try
		{
			while(i<=n)
			{
				Random random=new Random();
				p3b.r=random.nextInt(100);
				System.out.println(i+"->random integer :" +p3b.r);
				new MyThread2().start();
				new MyThread3().start();
				Thread.sleep(1000);
				System.out.println("\n\n");
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("square of"+p3b.r+ "is"+p3b.r*p3b.r);
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("cube of" +p3b.r+ "is"+p3b.r*p3b.r*p3b.r);
	}
}
public class p3b{
	static int r;
	public static void main (String[] args){
		MyThread1 thread1=new MyThread1();
		thread1.start();
	}
}




