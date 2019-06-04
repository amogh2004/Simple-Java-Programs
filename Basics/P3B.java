import java.util.*;

class MyThread1 extends Thread
{
	public void run()
	{
		int i = 1;
		Scanner read = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of RANDOM INTEGERS to be produced:");
		int n = read.nextInt();
		try
		{
			while(i<=n)
			{
				
				P3B.r=random.nextInt(100);
				System.out.println("Random Integer-->"+i+"= "+P3B.r);
				new MyThread2().start();
				new MyThread3().start();
				Thread.sleep(1000);
				System.out.println("\n");
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
		System.out.println("Square of "+P3B.r+" is "+P3B.r*P3B.r);
	}
}


class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("Cube of "+P3B.r+" is "+P3B.r*P3B.r*P3B.r);
	}
}


public class P3B
{
	static int r;
	public static void main(String args[])
    {
		MyThread1 thread1=new MyThread1();
		thread1.start();
	}
}




