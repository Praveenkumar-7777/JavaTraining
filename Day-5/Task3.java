
import java.util.Scanner;

class Task3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.nextLine();
        if(str.startsWith("Java")){
            System.out.println("The string start's with Java");
        }
        else
        System.out.println("The string not start's with Java");

    }
}