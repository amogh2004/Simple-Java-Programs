// Java program to find shortest distance in a multistage graph.
import java.util.*;
import java.io.*;
class multistage
{
    
    //static int N;
    static int graph[][] = new int[50][50];
    static int INF = 9999;
    static int n;
    
    // Returns shortest distance from 0 to N-1.
    public static int shortestDist(int graph[][], int N)
    {
        
        // dist[i] is going to store shortest distance from node i to node N-1.
        int dist[] = new int[N];
        
        dist[N - 1] = 0;
        
        // Calculating shortest path for rest of the nodes
        for (int i = N - 2; i >= 0; i--)
        {
            
            // Initialize distance from i to destination (N-1)
            dist[i] = INF;
            
            // Check all nodes of next stages to find shortest distance from i to N-1.
            for (int j = i; j < N; j++)
            {
                // Reject if no edge exists
                if (graph[i][j] == INF)
                    continue;
                
                // We apply recursive equation to find distance to target through j, and compare with minimum distance so far.
                dist[i] = Math.min(dist[i], graph[i][j]+ dist[j]);
            }
        }
        
        return dist[0];
    }
    
    // Main method
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter the number of vertices in the graph:");
            n = read.nextInt();
        }
        catch(InputMismatchException ie)
        {
            System.out.println("NOT A VALID INTEGER INPUT!!!");
            System.exit(0);
        }
        
            // Graph stored in the form of an adjacency matrix
            try
            {
                Scanner input = new Scanner (new File(args[0]));
                while (input.hasNextInt()!=false)
                {
                    for (int i=0;i<n;i++)
                        for (int j=0;j<n;j++)
                            graph[i][j]= input.nextInt();
                }
            }
            catch(Exception fe)
            {
                System.out.println("TARGET FILE NOT FOUND!!!");
                System.exit(0);
            }
        
            System.out.println("THE SHORTEST DISTANCE BETWEEN 's' AND 't'= "+shortestDist(graph, n));
    }
}

