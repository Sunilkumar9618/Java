import java.util.Scanner;

public class pg4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[][] count = new int [26][2];
        int a = 97;
        for(int i=0; i<count.length; i++){
            count[i][0]=a++;
            count[i][1]=0;
        }
        for(char ch: str.toCharArray()){
            for(int i=0;i<count.length;i++){
                if(count[i][0]==(int)ch){
                    count[i][1]+=1;
                    break;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i][1]>0){
                System.out.println((char)count[i][0]+" "+count[i][1]);
            }
        }
        sc.close();
    }
}
