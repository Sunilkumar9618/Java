import java.util.Scanner;

public class pg8 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] array_name =new int[size];
    int sum = 0;
    for(int i=0;i<size;i++){
        array_name[i] = sc.nextInt();
       sum +=  array_name[i];
     }
     System.out.print(sum);   
    }
}