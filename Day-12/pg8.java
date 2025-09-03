import java.util.*;
public class pg8{
    public static int factorial(int n){
        int fact=1;
        if(n<0){
            return -1;
        }
        else{
            for(int i=1;i<=n; i++){
                fact = fact*i;
            }
            return fact;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(Sysytem.in){
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            int fact=1;
            int result =factorial(n);
            if(result==-1){
                System.out.println("Factorial is not defined for negative numbers");
                
            }
            else{
                System.out.println(result);
            }
            sc.close();
        }
    }
}
