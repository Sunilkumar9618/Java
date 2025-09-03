import java.util.*;
public class pg3{
    public static void main(String[] args){
        ArrayList<Integer> s=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mr;
        System.out.println("Enter the marks: ");
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
            
            }
            ArrayList<String> v=new ArrayList<>();
            for(Integer i:s){
                if(i>=90 && i<=100){
                    v.add("O");
                }
                else if(i>=80&& i<90 ){
                    v.add("A+");
                }
                else if(i>=70&&i<80){
                    v.add("A");
                }
                else if(i>=60&&i<70){
                    v.add("B+");
                }
                else if(i>=50&&i<60){
                    v.add("B");
                }
               else if(i<=50){
                    v.add("RA");
                }
                System.out.println();
                
                
            }
        sc.close();
    }
}