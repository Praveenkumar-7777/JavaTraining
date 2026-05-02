import java.util.*;

class expense{
    public static void main(String[] args) {
        // sample s1 = new sample();
        // s1.tracker();
        String e;
        long l,i=0;
        int x;
        do{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Expense Name: ");
        e = s.nextLine();
        System.out.println("Enter Expense amount: ");
        l = s.nextLong();
        i+=l;
        System.out.println("Do you want to continue(yes:1/No:0)");
        x = s.nextInt();
        // if(x==0) {
        //     break;
        // }
        }while(x!=0);
        System.out.println("Total Expense: "+i);

    }
}
// class sample{
//     void tracker(){
//         String e;
//         long l,i=0;
//         int x;
//         do{
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter your Expense Name: ");
//         e = s.nextLine();
//         System.out.println("Enter Expense amount: ");
//         l = s.nextLong();
//         i+=l;
//         System.out.println("Do you want to continue(yes:1/No:0)");
//         x = s.nextInt();
//         // if(x==0) {
//         //     break;
//         // }
//         }while(x!=0);
//         System.out.println("Total Expense: "+i);
//     }
// }