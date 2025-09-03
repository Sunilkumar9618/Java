import java.util.*;
public class pg3{
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
        System.out.println("Enter the position to insert");
        int position=sc.nextInt();
        newArr[position]=r;
        for(int i=0; i<n; i++){
            if(i>=position){
                newArr[i+1]=k[i];
            }
            else{
                newArr[i]=k[i];
            }
                
        }
                for(int i=0;i<newArr.length; i++){
            System.out.println(newArr[i]+" ");
        } 
        System.out.println();
        sc.close();
        }
}