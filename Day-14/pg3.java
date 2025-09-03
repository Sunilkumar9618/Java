import java.util.Scanner;
public class pg3 {
    public static int findMax(int[] arr) {
        int a = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i]; 
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            
            x[i] = sc.nextInt();
        }
        int b = findMax(x);
        System.out.println( "The maximum element in the array" +b);
        sc.close();
    }
}

