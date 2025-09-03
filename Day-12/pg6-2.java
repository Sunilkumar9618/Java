import java.util.*;
public class pg6-2{
    public static int add(int n, int m,int r){
        return n+m+r;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int result=add(n,m,r);
        System.out.println(result);
        sc.close();
    }
}
