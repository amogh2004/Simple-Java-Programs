import java.util.*;

class Customer
{
	String name,data,dob;
	
    void read()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the details in format <name,dd/mm/yyyy>");
		data=read.nextLine();
	}
	
    void display()
	{
		String s[]=data.split(",");
		name=s[0];
		dob=s[1];
        StringTokenizer str=new StringTokenizer(dob,"/");
		System.out.println(name+ "\n" +str.nextToken()+ "," +str.nextToken()+ "," +str.nextToken());
	}
}

	
public class P2B
{
	public static void main(String args[])
    {
        Customer obj=new Customer();
        obj.read();
        obj.display();
    }
}
			


