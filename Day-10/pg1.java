import java.util.*;
public class pg1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        int[] freq =new int[n];
        int visited=-1;
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //count frequency
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                    freq[j]=visited;
                }
                //else{
                 //   System.out.println(k[i]+" ");
               // }
            }
            if(freq[i] != visited){
                freq[i]=count;
            }
           
        }
        for(int i=0; i<n; i++){
            if(freq[i] != visited){
                System.out.println(arr[i]+ "Count" + freq[i]);
            }
        }
        sc.close();
    }
}