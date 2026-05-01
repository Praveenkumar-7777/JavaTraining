
import java.util.Scanner;

class Task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char vol = s.next().charAt(0);
        if(vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'u' || vol == 'A' || vol == 'E' || vol == 'I' || vol == 'O' || vol == 'U' ){
            System.out.println("Character is Vowel");
        }
        else {
            System.err.println("Character is not Vowel");
        }
    }
}