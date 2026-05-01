import java.util.Scanner;

class Task5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = s.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not eligible to Vote");
        }
    }
}