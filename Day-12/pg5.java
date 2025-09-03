import java.util.Scanner;

public class pg5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim().toLowerCase();
        str = str.replaceAll(" ", "");
        int i=0, j=str.length()-1;
        boolean flag = true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) flag = false;
            i++;
            j--;
        }
        System.out.println(flag?"Palindrome":"Not a palindrome");
        sc.close();
    }
}
