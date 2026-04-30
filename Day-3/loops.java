
import java.util.Scanner;

class loops{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=9;
        // do { 
        //     a = s.nextInt();
        //     System.out.println("Entered Value: "+a);
        // } while (a != 0);
        while(a!=0){
            a = s.nextInt();
            System.out.println("Entered Value: "+a);
        }
    }
}