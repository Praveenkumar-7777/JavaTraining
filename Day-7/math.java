
import java.util.Random;
import java.util.Scanner;

class math{
    public static void main(String[] args) {
        //abs
        System.out.println("Absolute value: "+Math.abs(-88));
        //sqrt
        System.out.println("Square Root: "+Math.sqrt(625));
        //max
        Random rn = new Random();
        int n1 = rn.nextInt();
        int n2 = rn.nextInt();
        System.out.println("Maximum No: "+Math.max(n1,n2));
        //min
        int a1 = rn.nextInt();
        int a2 = rn.nextInt();
        System.out.println("Minimum No: "+Math.min(a1,a2));
        //round
        System.out.println("Round off: "+Math.round(8.9));
        System.out.println("Round off: "+Math.round(8.1));
        //ceil
        System.out.println("Ceil: "+Math.ceil(8.9));
        System.out.println("Ceil: "+Math.ceil(8.1));
        //floor
        System.out.println("Floor: "+Math.floor(8.9));
        System.out.println("floor: "+Math.floor(8.1));
        //cbrt
        System.out.println("Cube Root: "+Math.cbrt(1000));
        //sin,cos,tan
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Angle");
        double degree = s.nextDouble();
        double rad = Math.toRadians(degree);
        System.out.println("Sin: "+Math.sin(rad)+"\nCos:"+Math.cos(rad)+"\nTan:"+Math.tan(rad));
        //pow
        int b1 = rn.nextInt();
        int b2 = rn.nextInt();
        System.out.println("Power: "+Math.pow(b1,b2));


    }
}