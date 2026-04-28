class strs{
    public static void main(String[] args) {
        String str1 = "abc";
        String a = new String("abc");//stores in heap
        System.out.println(str1==a);
        System.out.print(str1.equals(a));
    }
}