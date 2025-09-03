import java.util.*;
public class pg3{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.replace(" ","");
        System.out.println("The total no of Strings is:"+str1.length());
        sc.close();
    }
}
