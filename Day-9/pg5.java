import java.util.*;
public class pg5{
      public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[]k =new int[n];
          for(int i=0; i<n; i+=){
              k[i]=sc.nextInt();
          }
          System.out.println("Deletion");
          int[]newArr = new int[n];
          System.out.println("Enter the index position to delete");
          int s =sc.nextInt();
          if(s<n){
              for(int i=0; i<n;i++){
                  if(i+i<n){
                      if(i>=s){
                          newArr[i]=k[i+1];
                      }
                      else{
                          newArr[i]=k[i];
                      }
                  
              }
          }
          for(int i=0; i<newArr.length-1; i++){
              System.out.println(newArr[i]+" ");
              
          }
          System.out.println();
      } else{
          System.out.println("Insertion");
          System.out.println("Enter the element to insert");
          int v=sc.nextInt();
          System.out.println("Enter the index position to delete");
          int e=sc.nextInt();
          for (int i=0;i<n;i++){
              if(i==e){
                  k[i]=v;
              }
          }
          for(int i=0;i<n;i++){
              System.out.println(k[i]+" ");
          }
          sc.close()
      }
      
      
}
