import java.util.Scanner;
public class Pg7{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s=sc.nextInt();
        double k=sc.nextFloat();
        if(s==2){
            System.out.printf("%.2f",k+(k/2.0));
        }
        else if(s==3){
            System.out.printf("%.2f",k*2);
        }
        else{
            System.out.println("Number of items is more than recommended");
        }
        sc.close();
        }
    }
