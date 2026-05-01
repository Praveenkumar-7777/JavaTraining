import java.util.*;
class inputmethod{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        System.out.println("Enter your mail: ");
        String mail = s.next();
        System.out.println("Enter your Ph No: ");
        long ph = s.nextLong();
        System.out.println("Enter your annual salary: ");
        double sal = s.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Mail: "+mail);
        System.out.println("Phone No: "+ph);
        System.out.println("Salary: "+sal);


    }
}