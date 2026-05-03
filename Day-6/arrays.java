import java.util.Arrays;
class arrays{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = new int[a.length];
        b = a.clone();
        System.out.println("Cloned Array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("Arrays.copyof fun");
        int c[] = new int[a.length];
        c = Arrays.copyOf(a,3);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        System.out.println("arraycopy fun");
        int d[] = new int[a.length];
        System.arraycopy(a, 0, d, 0, 5);
        for(int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }
        System.out.println(Arrays.toString(d));



    }
}