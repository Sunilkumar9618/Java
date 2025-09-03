
// import java.util.Scanner;
// import java.util.Arrays;

import java.util.*;

public class pg6
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
		int minimum=array_name[0];
// 		logic-1
// 		for(int i=1;i<size;i++)  
// 		{
// 		    if(array_name[i]<minimum)
// 		    {
// 		        minimum=array_name[i];
// 		    }
		    
		    
// 		}System.out.printf("%d ",minimum); 
        
        
        //logic-2
        Arrays.sort(array_name); // sorting array 
        System.out.printf("Minimun value is %d  Maximum value is %d",array_name[0],array_name[size-1]);
	}
}