import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();

            System.out.print("Enter number of rows: ");
            int add = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int add1 = sc.nextInt();

            System.out.println("Enter elements:");

            for (int i = 0; i < add; i++) {
                ArrayList<Integer> row = new ArrayList<>(); 

                for (int j = 0; j < add1; j++) {

                    row.add(sc.nextInt()); 
                }
                a.add(row);
            }

            System.out.println("Now the ArrayList elements are:");
            System.out.println(a);

        }
        catch(Exception e){
            System.out.println("Please! Enter Vaild inputs");
        }
        
    }
}
