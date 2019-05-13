import java.util.Scanner;

	class stack{
		int[] stack;
		int top=-1,size;
		stack(int size){
			this.size=size;
			stack=new int[size];
		}
		void push(int ele)
		{
			if(top==size-1)
				System.out.println("stack overflow");
			else{
				stack[++top]=ele;
			}
		}
		void pop()
		{
			if(top==-1)
				System.out.println("stack is empty");
			else
				System.out.println("popped element is:" +stack[top--]);
		}
		void display(){
			if(top==-1)
				System.out.println("stack is empty");
			else
				System.out.println("elements os element are");
			for(int i=top;i>=0;i--)
			System.out.println(stack[i]);
		}
	}
	
	public class P1B{
		public static void main(String[] args){
			Scanner read=new Scanner(System.in);
			System.out.println("enter stack size");
			int size=read.nextInt();
			stack ob=new stack(size);
			for(;;)
			{
				System.out.println("stack operations");
				System.out.println("1-->push");
				System.out.println("2-->pop");
				System.out.println("3-->display");
				System.out.println("4-->exit");
				System.out.println("entr your choice");
				int choice=read.nextInt();
				switch(choice)
				{
				case 1: System.out.println("enter the element to push");
				int num=read.nextInt();
				ob.push(num);
				break;
				case 2:ob.pop();
				break;
				case 3:ob.display();
				break;
				case 4:System.exit(0);
				break;
				}
			}
			
			
		}
	}
	
	
	
	
				
		
		
	


