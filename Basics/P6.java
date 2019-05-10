import java.util.*;

public class P6 {
	static int []p=new int[50];
	static int []w=new int[50];
	static int []x=new int[50];
	static int[]t=new int[50];
	static double maxprofit;
	static int n,m,i,j;
	
	static void dynamicknapsack(int n,int w[],int p[],int m)
	{
		int [][]v=new int[n+1][m+1];
		for(i=0;i<=n;i++)
			v[i][0]=0;
		for(j=0;j<=m;j++)
			v[0][j]=0;
		for (i=1;i<=n;i++)
			for(j=1;j<=m;j++)
				if(j<w[i])
					v[i][j]=v[i-1][j];
				else
					v[i][j]=max(v[i-1][j],v[i-1][j-w[i]]+p[i]);
		System.out.println("solutin table");
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
				System.out.print(v[i][j]+"\t");
			System.out.println("\n");
		}
		System.out.println("optimal olution for dynamic method:" +v[n][m]);
		i=n;
		j=m;
		while(i!=0 && j!=0)
		{
			if(v[i][j]!=v[i-1][j])
			{
				x[i]=1;
				j=j-w[i];
			}
			i=i-1;
		}
		System.out.println("The solution vector for dynamic method is");
		for(i=1;i<=n;i++)
			System.out.print(x[i]+"\t");
		System.out.println("\n");
	}
	static int max(int a,int b)
	{
		return(a>b)?a:b;
	}
	static void greedyknapsack(int n,int w[],int p[],int m)
	{
		int rc=m;
		bubblesort(n,w,p,t);
		for(i=1;i<=n;i++)
		{
			if(w[t[i]]>rc)
				continue;
			x[t[i]]=1;
			rc-=w[t[i]];
			maxprofit+=p[t[i]];
		}
		System.out.println("optimal solution sor greedy method:" +maxprofit);
		System.out.println("solution vector for geedy method:");
		for(i=1;i<=m;i++)
			System.out.print(x[i]+"\t");
	}
	static void bubblesort (int n,int w[],int p[],int t[])
	{
		int temp;
		for(i=1;i<=n;i++)
			t[i]=i;
		for(i=1;i<n;i++)
			for(j=1;j<=n;j++)
				if((double)p[t[j]]/w[t[j]]<(double)p[t[j+1]]/w[t[j+1]])
				{
					temp=t[j];
					t[j]=t[j+1];
					t[j+1]=temp;
				}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of objects:");
		n=sc.nextInt();
		System.out.println("enter the objects weight:");
		for(i=1;i<=n;i++)
			w[i]=sc.nextInt();
		System.out.println("enter the objects profits:");
		for(i=1;i<=n;i++)
			p[i]=sc.nextInt();
		System.out.println("enter the maximum capacity:");
		m=sc.nextInt();
		dynamicknapsack(n,w,p,m);
		for(i=1;i<=n;i++)
			x[i]=0;
		greedyknapsack(n,w,p,m);
	}
}
	
			
