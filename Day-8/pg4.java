
import java.util.*;

public class pg4
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
		int max=0;
		for(int i=0;i<size;i++)  // 3=>12 50 10 
		{
		    if(array_name[i]>max)//1-> 12>0=>12    50>12  10>50
		    {
		        max=array_name[i];//max=12  ->50 
		    }
		    
		    
		}System.out.printf("%d ",max);  //50
	}
}