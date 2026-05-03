
import java.util.ArrayList;
import java.util.Collections;

class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(18);
        arr.add(45);
        System.out.println("Add Fun: "+arr);
        arr.set(0,3);
        arr.set(2,77);
        System.out.println("Set Fun: "+arr);
        arr.remove(2);
        arr.add(12);
        System.out.println("Remove Fun: "+arr);
        Collections.sort(arr);
        System.out.println("Sort Fun: "+arr);
        System.out.println(arr.contains(3));
    }
}