
import java.util.Scanner;

class abstraction{
    public static void main(String[] args) {
        int pin_no = 1512;
        Scanner s = new Scanner(System.in);
        bank_server bs = new bank_server();
        System.out.print("Enter your pin: ");
        int pin = s.nextInt();
        int choice;
        if(pin_no != pin){
            System.out.println("Wrong Pin");
            System.exit(0);
        }
        do{
            System.out.println("Enter your choice: \n1.Check Balance \n2.Deposite \n3.withdrawl: \n4.Enter Zero to exit");
            System.out.print("Your Choice: ");
            choice = s.nextInt();
                if(choice == 1){
                    System.out.println("Balance amt: "+bs.getbalance());
                }
                else if(choice == 2){
                    System.out.print("Enter your amt: ");
                    double a = s.nextDouble();
                    bs.deposite(a);
                }
                else if(choice == 3){
                    System.out.print("Enter your amt: ");
                    double b = s.nextDouble();
                    bs.withdrawl(b);
                }
        
                else{
                    System.out.println("Process Completed..");
                }
            }while(choice!=0);
        
        }
        
    }

class bank_server{
    private double balance = 5000.7;
    double getbalance(){
        return balance;
    }
    void deposite(double amt){
        balance += amt;
    }
    void withdrawl(double amt){
        if(balance<=amt){
            System.out.println("Insufficient balance");
        }
        else
        balance -= amt;
    }

}