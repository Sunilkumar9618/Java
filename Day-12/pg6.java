sum of two elements
import java.util.*;
public class pg6{
    public static int add(int n, int m){
        return n+m;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result=add(n,m);
        System.out.println(result);
        sc.close();
    }
}
