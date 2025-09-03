import java.util.*;

public class Pg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();

        }
        Arrays.sort(b);
        int sum = 0;
        for (int i = 0; i < a; i++) {
            if (i != 0 && i != a - 1) {
                sum = b[i];

                
            }

        }
        System.out.println(sum);
        sc.close();
    }
}