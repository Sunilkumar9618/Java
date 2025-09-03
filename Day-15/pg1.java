
import java.util.HashSet;
import java.util.Scanner;
public class pg1
{
	public static void main(String[] args) {
		HashSet<String> names=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//4 vvv 
		sc.nextLine();
		
		System.out.println("Enter Your names");
		for(int i=0;i<n;i++){
		    String name=sc.nextLine();
		    if(names.add(name)){
		        System.out.println("Added : "+name);
		    }
		    else{
		        System.out.println("Duplicate ignored : "+name);
		    }
		}
		
		names.add("raju");
		
		System.out.println("Hash Set Values");
		for(String i:names){
		    System.out.println(i);
		}
// 		System.out.println(names);
		
		
		names.remove("vamsi");
		System.out.println("After removing vamsi "+names);
		System.out.println("Size of a Set :"+names.size());
		names.clear();
		
		System.out.println("IS empty ? "+names.isEmpty());
	}
}