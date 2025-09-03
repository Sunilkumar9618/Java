import java.util.*;
public class pg1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k= new int[n];
        for(int i=0; i<n; i++){
            k[i]=sc.nextInt();
        }
        int[] newArr= new int [n+1];
        for(int i=0; i<n; i++){
            newArr[i]=k[i];
        }
        System.out.println("Enter the new element to insert");
        int r=sc.nextInt();
        newArr[n]=r;
        for(int i=0;i<newArr.length; i++){
            System.out.println(newArr[i]+" ");
        } 
        System.out.println();
        sc.close();
        }
}