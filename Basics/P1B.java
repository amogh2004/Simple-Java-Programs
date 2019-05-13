import java.util.Scanner;

class stack
{
    int stack[];
    int top=-1, size;
    
    stack(int size)
    {
        this.size=size;
        stack=new int[size];
    }
    
    void push(int ele)
    {
        if(top==size-1)
            System.out.println("STACK OVERFLOW");
        else
            stack[++top]=ele;
    }
	
    void pop()
    {
        if(top==-1)
            System.out.println("STACK IS EMPTY");
        else
            System.out.println("POPPED ELEMENT IS:" +stack[top--]);
    }
    
    void display()
    {
        if(top==-1)
            System.out.println("STACK IS EMPTY");
        else
        {
            System.out.println("ELEMENTS IN THE STACK ARE:");
            for(int i=top;i>=0;i--)
                System.out.println(stack[i]);
        }
    }
}
	

public class P1B
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Stack Size");
        int size = read.nextInt();
        
        stack ob = new stack(size);
        
        for(;;)
        {
            System.out.println("Stack Operations");
            System.out.println("1-->PUSH");
            System.out.println("2-->POP");
            System.out.println("3-->DISPLAY");
            System.out.println("4-->EXIT");
            System.out.println("Enter your Choice:");
            int choice=read.nextInt();
            
            switch(choice)
            {
                case 1: System.out.println("Enter the element to PUSH: ");
                        int num=read.nextInt();
                        ob.push(num);
                        break;
				case 2: ob.pop();
                        break;
				case 3: ob.display();
                        break;
				case 4: System.exit(0);
                        break;
                default: System.out.println("Wrong Choice Entered!!!");
            }
        }
    }
}
	
	
	
	
				
		
		
	


