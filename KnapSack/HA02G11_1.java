//Queston 7: Knapsack Problem
//Organiser of an event management company to conduct multiple events on a given day
import java.util.*;
import java.io.*;
import java.lang.*;

//Main Class
class HA02G11_1
{
    //variables for iteration
    static int i, j;
    
    //method which sorts the individual profits of various events and their indexes in ascending order
    static void bubblesort(int index[], double profit[], int n)
    {
        for (i = 0; i < (n-1); i++)
            for (j = 0; j < (n-i-1); j++)
                if(profit[j] < profit[j+1])
                {
                    //individual profit getting sorted
                    double temp = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = temp;
                    
                    //array of indexes of profits getting sorted
                    int temp1 = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp1;
                }
    }
    
    //Main Method
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            File file = new File("/Users/amoghr/DAA_ASS/ASS_2/EventInfo.txt");
            BufferedReader fr = new BufferedReader(new FileReader(file));
        }
        catch(FileNotFoundException fne)
        {
            System.out.println("FILE NOT FOUND");
        }
        
        int n;
        String data;
        
        //inputing the number of events to be conducted
        System.out.println("Enter the number of Venues: ");
        n = Integer.parseInt(br.readLine());
        
        //initializing various parameters required
        String[] venue = new String[n];
        int[] people = new int[n];
        String[] event = new String[n];
        int[] fee = new int[n];
        float[] iprofit = new float[n];
        
        double minprofit=0;
        double targetprofit;
        
        //arrays which hold the profits of individual arrays and their indexes
        double profit[] = new double[n];
        int index[] = new int[n];
        
        //array which holds the various fields to be stored
        String[] str = {"venue","people","event","fee"};
        
        //reading the contents from the file
        for(j=0;j<4;j++)
            while((data = fr.readLine()) != null)
            {
                String s[] = data.split("\\|");
                for(i=0;i<9;i++)
                {
                    String var_name = str[j];
                    var_name[i] = s[i];
                }
            }
        
        //declaring the indexes array
        for (i=0 ; i<n; i++)
            index[i]=i;
        
        //initializing the profits of individual events array
        for (j=0 ; j<n ; j++)
            profit[j] = iprofit[j];
        
        bubblesort(index, profit, n);
        
        //inputting the minimum profit to be achieved
        System.out.println("Enter the minimum profit to be achieved:");
        targetprofit = Double.parseDouble(br.readLine());
        
        i=0;
        //checking out the event with maximum profit first and respectively printing the details of such events and
        //summing up the profits
        while (minprofit<targetprofit)
        {
            minprofit += profit[i];
            System.out.println("Venue: "+venue[index[i]]+"\tEvent: "+event[index[i]]+"\tNumber of People: "+people[index[i]]+"\tFee:"+fee[index[i]]);
            i++;
        }
    
        //checking out the condition where the required profit is achieved or not
        if(minprofit<targetprofit)
        {
            System.out.println("Number of events are too less");
            System.out.println("The profit that could be achieved= "+minprofit);
        }
        else
            System.out.println("Profit achieved= "+minprofit);
    }
}
