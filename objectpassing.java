public class objectpassing{
    static class Human{

        void persons(Person person){
            System.out.println("Name: "+person.name);
            System.out.println("Age: "+person.age);
        }
        
    }
     static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name=name;
            this.age=age;
        }

    }

    public static void main(String[] args) {
        Human human=new Human();

        Person person1=new Person("mohan",21);
        Person person2=new Person("shyam",22);
        Person person3=new Person("mahesh",23);
        Person person4=new Person("hemanth",23);
        Person person5=new Person("nanna",42);

        human.persons(person1);
        human.persons(person2);
        human.persons(person3);
        human.persons(person4);
        human.persons(person5);


    }
}