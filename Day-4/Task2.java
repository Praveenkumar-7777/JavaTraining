
import java.util.Scanner;

class Task2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i>0){
            System.out.println("Positive number");
        }
        else if(i<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
}