import java.util.Scanner;

public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your name: ");
        String name=sc.nextLine();

        System.out.print("enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.print("Do you have a lover? (y=1 / n=0): ");
        int a=sc.nextInt();
        sc.nextLine();

        System.out.print("Do you have a cursh name? (y=11 / n=00): ");
        int b=sc.nextInt();
        sc.nextLine();


        if (a==1 && b==11) {
            System.out.println("Enter your lover name: ");
            String lname=sc.nextLine();
             System.out.println("Enter your cursh name: ");
            String nname=sc.nextLine();

            hello(name,age,lname,nname);
            
        }

        else if(a==1){
            System.out.println("Enter your lover name: ");
            String lname=sc.nextLine();
            hello(name,age,lname);

        }
        else if(b==11){
            System.out.println("Enter her name: ");
            String lname=sc.nextLine();
            hello(name,age,lname);

        }

        else{
            hello(name,age);
        }  
    }

    static void hello(String name,int age){

        System.out.println();
        System.out.println("Hello "+name);
        System.out.println("Your "+age+" years old");

    }
    static void hello(String name,int age,String lname){

        System.out.println();
        System.out.println("Hello "+name);
        System.out.println("Your "+age+" years old");
        System.out.println("Your lover name is :"+lname);

    }
    static void hello(String name,int age,String lname,String nname){

        System.out.println();
        System.out.println("Hello "+name);
        System.out.println("Your "+age+" years old");
        System.out.println("Your lover name is : "+lname);
        System.out.println("Your cursh name is: "+nname);

    }
}

