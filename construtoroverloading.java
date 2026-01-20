import java.util.Scanner;

public class construtoroverloading {

    static class Human {
        String name;
        int age;
        String email;

        Human(String name) {
            this.name = name;
        }

        Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Human(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to enter your name? (1/0): ");
        int ch = sc.nextInt();

        System.out.print("Do you want to enter your age? (1/0): ");
        int ach = sc.nextInt();

        System.out.print("Do you want to enter your email? (1/0): ");
        int ech = sc.nextInt();

        sc.nextLine(); 
        if (ch == 1 && ach == 1 && ech == 1) {

            System.out.print("Enter your name: ");
            String n = sc.nextLine();

            System.out.print("Enter your age: ");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your email: ");
            String e = sc.nextLine();

            Human human = new Human(n, a, e);

            
            System.out.println();
            System.out.println("Name: "+human.name);
            System.out.println("Age: "+human.age);
            System.out.println("Email: "+human.email);
        }
        else if (ch == 1 && ach == 1) {

            System.out.print("Enter your name: ");
            String n = sc.nextLine();

            System.out.print("Enter your age: ");
            int a = sc.nextInt();

            Human human = new Human(n, a);

            System.out.println();
            System.out.println("Name: "+human.name);
            System.out.println("Age: "+human.age);
        }
        else if (ch == 1) {

            System.out.print("Enter your name: ");
            String n = sc.nextLine();

            Human human = new Human(n);

            System.out.println();
            System.out.println("Name: "+human.name);
        }
        else {
            System.out.println("No data entered.");
        }

        
    }

}
