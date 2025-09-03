import java.util.Scanner;
public class Pg4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a = sc.nextLine();
        int n = a.length();
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){ 
            if(i==j||i + j == n - 1){
                System.out.print(a.charAt(i));
            } else {
                System.out.print(" ");
            }
        }System.out.println();
        }
        }
    }