import java.util.*;
public class pg4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[]k=new int[n];
        for(int i=0; i<n; i++){
            k[i]=sc.nextInt();
        }
            int[] newArr=new int[n];
            System.out.println("Enter the index position to delete:");
            int s=sc.nextInt();
            if(s<n){
                for(int i=0;i<n;i++){
                    if(i+1<n){
                        if(i>=s){
                            newArr[i] =k[i+1];
                        }else{
                            newArr[i]=k[i];
                        }
                    }
                }
                for(int i=0; i<newArr.length-1; i++){
                    System.out.println(newArr[i]+" ");
                }
            }
            sc.close();
    }
}
