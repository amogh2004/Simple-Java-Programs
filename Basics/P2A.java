import java.util.Scanner;


class Staff
{
    String sid,name,ph;
    double sal;
    Scanner read = new Scanner(System.in);
    Scanner read1 = new Scanner(System.in);
    
    void read()
    {
        System.out.println("Staff ID:");
        sid = read.next();
        System.out.println("Name:");
        name = read1.nextLine();
        System.out.println("Phone:");
        ph = read.next();
        System.out.println("Salary:");
        sal = read.nextDouble();
    }
    
    void display()
    {
        System.out.println("STAFF ID: "+sid);
        System.out.println("NAME: "+name);
        System.out.println("PHONE NUMBER: "+ph);
        System.out.println("SALARY: "+sal);
    }
}


class Teaching extends Staff
{
    String Domain;
    int publications;
    
    void read()
    {
        super.read();
        System.out.println("Domain:");
        Domain = read1.nextLine();
        System.out.println("Publication:");
        publications = read.nextInt();
    }
    
    void display()
    {
        super.display();
        System.out.println("DOMAIN: "+Domain);
        System.out.println("PUBLICATIONS: "+publications);
    }
}


class Technical extends Staff
{
    String skills;
    
    void read()
    {
        super.read();
        System.out.println("Skills:");
        skills = read1.nextLine();
    }
    
    void display()
    {
        super.display();
        System.out.println("SKILLS: "+skills);
    }
}


class Contract extends Staff
{
    int period;
    
    void read()
    {
        super.read();
        System.out.println("Period:");
        period = read.nextInt();
    }
    
    void display()
    {
        super.display();
        System.out.println("PERIOD: "+period);
    }
}


public class P2A
{
    public static void main(String args[])
    {
        Teaching teach = new Teaching();
        Technical tech = new Technical();
        Contract cont = new Contract();
        
        System.out.println("Enter TEACHING STAFF details:");
        teach.read();
        System.out.println("Enter TECHNICAL STAFF details:");
        tech.read();
        System.out.println("Enter CONTRACT STAFF details:");
        cont.read();
        
        System.out.println("\n\n HERE ARE THE TEACHING STAFF DETAILS:");
        teach.display();
        System.out.println("\n\n HERE ARE THE TECHNICAL STAFF DETAILS:");
        tech.display();
        System.out.println("\n\n HERE ARE THE CONTRACT STAFF DETAILS:");
        cont.display();
    }
}
