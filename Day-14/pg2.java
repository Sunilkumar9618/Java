import java.util.*;
public class pg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       List<String> list=new ArrayList<>();
       //list.add("Tom");
       //list.add("Clint");
       //list.add("Jason");
       //list.add("mackie");
       System.out.println("Enter the array size: ");
       int n=sc.nextInt();
       System.out.println("Enter the array elements: ");
       for(int i=0;i<=n;i++){
           String name =sc.nextLine();
          list.add(name);
       }
       System.out.println("Names: ");
       for(String i:list){
           
		    System.out.println( " "+ i  );
		   
		}
		sc.close();

    }
}

