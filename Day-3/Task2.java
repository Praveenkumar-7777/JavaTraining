
import java.util.Scanner;

class Task2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not eligible to Vote");
        }
    }
}