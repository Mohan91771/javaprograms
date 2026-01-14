
import java.util.*;

public class star{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("* ".repeat(i)+" ".repeat((n-i)*4)+"* ".repeat(i));
        }
        for(int j=n-1;j>=0;j--){
            System.out.println("* ".repeat(j)+" ".repeat((n-j)*4)+"* ".repeat(j));
        }
    }
}