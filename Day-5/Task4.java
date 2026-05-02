import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double food = 0, travel = 0, shopping = 0;

        while (true) {
            System.out.println("Enter category (food/travel/shopping) or 0 to stop:");
            String category = sc.nextLine();

            if (category.equals("0")) break;

            System.out.println("Enter amount:");
            double amt = sc.nextDouble();
            sc.nextLine();

            total += amt;

            if (category.equalsIgnoreCase("food")) 
                food += amt;
            else if (category.equalsIgnoreCase("travel")) 
                travel += amt;
            else if (category.equalsIgnoreCase("shopping")) 
                shopping += amt;
        }

        // Final Output
        System.out.println("\nTotal Expense: " + total);
        System.out.println("Food Expense Total: " + food);

        sc.close();
    }
}