
import java.util.Scanner;

class Task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = s.next();
        if(str.length()<5){
            System.out.println("The string is short");
        }
        else
        System.out.println("The string is long");

    }
}