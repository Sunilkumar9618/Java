import java.util.*;

public class pg1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt(); //5
		
		int []array_name=new int[size]; //arraysize=5
		
		System.out.println("Enter elements  of Array");
		for(int i=0;i<size;i++)
		{  //0<5, 1<5, 2<5,3<5 4<5, 5<5  
		    array_name[i]=sc.nextInt();//10 20 30 40 50 
		}
		for(int i=0;i<size;i++){
		    System.out.print(array_name[i]+ " ");
		}
	}
}