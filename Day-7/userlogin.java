
import java.util.Scanner;

class userlogin{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        String s1 = s.next();
        System.out.print("Enter password: ");
        String s2 = s.next();
        if("Praveen".equals(s1) && "sam@101025".equals(s2)){
            

        }
    }
}

class server{
    private String usrname = "Praveen";
    private String pwd = "sam@101025";
    String details(){
        return usrname + "\n" + pwd;
    }

}