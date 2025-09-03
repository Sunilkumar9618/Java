import java.util.*;
public class pg1{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<a.length();i++){
            char g=a.charAt(i);
            int s=(int)g;
            if(s>96&&g<123){
                System.out.print((char)(g-32));
            }
            else if(g>65 && g<91){ 
                System.out.print((char)g);
            }
            else{
                System.out.print("Invalid");
                break;
            }
            
            sc.close();
        }
}
}
