
import java.util.Scanner;

class Fun{
    public static void main(String[] args) {
        System.out.println("Enter Your message: ");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        todolist t = new todolist();
        t.todo(a);

    }
}
class todolist{
    void todo(String a){
        if(a.isBlank()){
            System.out.println("Task is Empty");
            return;
        }
        else
        System.out.println("Entered task: "+a);
     System.out.println("Tankyou for adding the task");
    }
}