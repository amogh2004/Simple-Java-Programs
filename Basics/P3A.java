import java.util.*;
public class P3A {
public static void main(String args[]){
	int a,b;

	Scanner read=new Scanner(System.in);
	System.out.println("enter two numbers\n");
	a=read.nextInt();
	b=read.nextInt();
	try
	{
		if(b==0)
			throw new ArithmeticException("div by zero error");
		float result=(float)a/b;
		System.out.println("result is"+result);
		
			
	}
			

	catch(Exception e)
	{
		System.out.println(e);
		
	}
	
}
}
