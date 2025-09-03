import java.util.Scanner;

public class pg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        String A = sc.nextLine();
        int positions = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        String direction = sc.nextLine().toUpperCase();

        int len = A.length();
        positions = positions % len; // Normalize shift

        String rotated = "";

        if (direction.equals("L")) {
            rotated = A.substring(positions) + A.substring(0, positions);
        } else if (direction.equals("R")) {
            rotated = A.substring(len - positions) + A.substring(0, len - positions);
        } else {
            System.out.println("Invalid direction");
            return;
        }

        System.out.println(rotated);
    }
}