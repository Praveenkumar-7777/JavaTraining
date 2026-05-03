import java.util.Arrays;
import java.util.Random;

class random{
    public static void main(String[] args) {
        Random rn = new Random();
        int a = rn.nextInt(10);
        double g = rn.nextGaussian();
        boolean b = rn.nextBoolean();
        double d = rn.nextDouble();
        long l = rn.nextLong();
        float f = rn.nextFloat();
        System.out.println("Integer: "+a+"\nBoolean: "+b+"\nGaussian: "+g+"\nDouble: "+d+"\nLong: "+l+"\nFloat: "+f);
        double m = 10 + (2 * rn.nextGaussian());
        System.out.println("Mean: "+m);
        byte bt[] = new byte[5];
        rn.nextBytes(bt);
        System.out.println(Arrays.toString(bt));
    }
}