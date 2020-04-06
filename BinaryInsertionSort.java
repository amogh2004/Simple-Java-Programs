import java.io.*;


class BinaryInsertionSort
{
	public static int binarySearch(int arr[], int item, int l, int h)
	{
		if (h<=l)
        	return (item > arr[l])?  (l + 1):l;
    	
    	int mid = (l + h)/2;
    	
    	if(item == arr[mid])
        	return mid+1;
    	
    	if(item > arr[mid])
        	return binarySearch(arr,item,mid+1,h);
    	
    	return binarySearch(arr,item,l,mid-1);
	}

	public static void insertionSort(int arr[], int n)
	{
		int i,loc, j, k,c;
    	
    	for (i = 1; i < n; ++i)
    	{
        	j = i - 1;
        	c = arr[i];
        	loc = binarySearch(arr, c, 0, j);
        	
        	while (j >= loc)
        	{
          		arr[j+1] = arr[j];
            	j--;
        	}
        	
        	arr[j+1] =c;
    	}
	}

	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		try
		{
			int num = Integer.parseInt(args[0]);

			int arr[] = new int[num];
			System.out.println("Enter the elements:\n");
			for(int i=0; i<num; i++)
				arr[i] = Integer.parseInt(br.readLine());

			insertionSort(arr,num);

			System.out.println("Sorted Array: ");
			for(int i=0; i<num; i++)
				System.out.print(arr[i]+"\t");
		}

		catch(NumberFormatException e)
		{
			System.out.println("NOT A VALID INTEGER INPUT");
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("PLEASE GIVE COMMAND LINE ARGUMENTS");
		}

		catch(Exception e2)
		{
			System.out.println("ERROR:"+e2);
		}
	}
}