import java.util.*;
public class pg7{
    public static int findmax(int max, int r){
        if(r > max){
            max=r;
            
        }
        return max;
    }

public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int s =sc.nextInt();
    int[] k=new int[s];
    int l=0;
    System.out.println("Enter Array");
    for(int i=0; i<s; i++){
        k[i]=sc.nextInt();
        int max=findmax(l,k[i]);
        l=max;
    } 
    System.out.println("The maximum elements in array "+l);
    sc.close();
}
}

