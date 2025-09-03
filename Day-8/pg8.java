

import java.util.*;

public class pg8
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt(); //5
		
		int []array_name=new int[size]; //arraysize=5
		
		System.out.println("Enter elements  of Array");
		
		for(int i=0;i<size;i++)
		{    
		    array_name[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<size;i++)
		{
		    boolean isDuplicate=false;
		    for(int j=0;j<i;j++)
		    {
		        if(array_name[i]==array_name[j])
		        {
		            isDuplicate=true;
		            break;
		        }
	    	}
	    	
	    	if(!isDuplicate)
	    	{
	    	    count++;
	    	}
	    	
		    
		}
		System.out.println(count);
		
		
		

	}
}