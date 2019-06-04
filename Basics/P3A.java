import java.util.*;
public class P3A
{
    public static void main(String args[])
    {
        int a,b;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter TWO Numbers:");
        a = read.nextInt();
        b = read.nextInt();
        try
        {
            int quotient = a/b;
            System.out.println("The resultant QUOTIENT= "+quotient);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("DIVIDE BY ZERO ERROR!!!");
        }
        finally
        {
            float result = (float)a/b;
            System.out.println("Floating Point Division Quotient= "+result);
        }
    }
}
