import java.util.HashSet;
import java.util.Scanner;

public class pg2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = Integer.parseInt(scanner.nextLine());

        
        HashSet<String> batsmenSet = new HashSet<>();

       
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine().trim().toLowerCase(); 
            batsmenSet.add(name);
        }

        
        System.out.println(batsmenSet.size());

        scanner.close();
    }
}