
import java.util.Scanner;

class Task5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No of Task: ");
        int t = s.nextInt();
        String alltask="";
        for(int i=1;i<=t;i++){
            System.out.print("Enter Task"+i+" : ");
            String str = s.next();
            alltask = alltask +i+ ". "+ str + "\n";
        }
        System.out.println("Your to-do list");
        System.out.println(alltask);
    }
}