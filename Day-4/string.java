import java.util.*;
class string{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = s.nextLine();
        System.out.println("Enter the second String: ");
        String str2 = s.nextLine();
        System.out.println("Length of str1: "+str1.length());
        System.out.println("Length of str2: "+str2.length());
        System.out.println("Empty str1: "+str1.isEmpty());
        System.out.println("Empty str2: "+str2.isEmpty());
        System.out.println("Blank str1: "+str1.isBlank());
        System.out.println("Blank str2: "+str2.isBlank());
        System.out.println("str1 equals str2: "+str1.equals(str2));
        System.out.println("str1 equals str2: "+str1.equalsIgnoreCase(str2));
        System.out.println("str1 compare str2: "+str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.contains(str2));
        System.out.println(str1.charAt(3));
        System.out.println(str1.substring(1,5));
        System.out.println(str1.indexOf("k"));
        System.out.println(str1.lastIndexOf("k"));
        System.out.println(str1.startsWith(str2));
        System.out.println(str1.endsWith(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.replace('a','t'));
        System.out.println(str1.strip());

    }
}