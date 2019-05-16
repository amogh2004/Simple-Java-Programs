import java.util.Scanner;

public class P8
{
	static int parent[]=new int[50];
	static int cost[][]=new int[10][10];
	static int a,b,i,j,u,v,n,min,noe=1,mincost=0;
	
    static int find(int w)
	{
		while(parent[w]!=0)
			w=parent[w];
		return w;
	}
	
    static void union()
	{
		if(u!=v)
		{
			noe++;
			System.out.println(noe-1 +") Edge("+a+","+b+")= "+min);
			mincost+=min;
			parent[v]=u;
		}
		cost[a][b]=cost[b][a]=9999;
	}
	
    public static void main(String args[])
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number of Vertices");
		n=read.nextInt();
		
        System.out.println("Enter the Cost Adjacency Matrix, '9999' for NO Direct Path:");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				cost[i][j]=read.nextInt();
		
		while(noe<n)
		{
			min=9999;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(cost[i][j]<min)
					{
						min=cost[i][j];
						a=u=i;
						b=v=j;
					}
				}
			}
			u=find(u);
			v=find(v);
			union();
		}
		System.out.println("MINIMUM COST= "+mincost);
	}
}
		

			


