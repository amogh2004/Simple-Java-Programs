import java.util.Scanner;


 class Student {
	
		String usn,name,branch,phno;
		Student(String usn,String name,String branch,String phno)
		{
			this.usn=usn;
			this.name=name;
			this.branch=branch;
			this.phno=phno;
		}
	void display()
	{
		System.out.println(usn + "\t"+name + "\t"+ branch + "\t" +phno + "\t");
	}	
	
}
	public class P1A{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=ob.nextInt();
		Student[] str=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter student details:\n" +(i+1));
			System.out.println("enter the usn\n");
			String usn=ob1.nextLine();
			System.out.println("entr the name\n");
			String name=ob1.nextLine();
			System.out.println("enter the branch\n");
			String branch=ob1.nextLine();
			System.out.println("enter phno");
			String phno=ob1.nextLine();
			str[i]=new Student(usn,name,branch,phno);
		}
	    for(int i=0;i<n;i++)
		{
			System.out.println("usn\t\t\t name\t\t\t branch\t\t\t phno\t\t\t");
	        str[i].display();
		}
	}
	}
	
			
		
		
	

	

