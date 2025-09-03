import java.util.*;
public class Pg5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int size=(n*2)-1;
		for(int i=0;i<size;i++)
		{
		    for(int j=0;j<size;j++)
		    {
		        int min=Math.min(  Math.min(i,j),Math.min(size-1-i,size-1-j));
		        System.out.print((n-min)+ " ");
		    }
		    System.out.println();
		}

        
		
	}
}