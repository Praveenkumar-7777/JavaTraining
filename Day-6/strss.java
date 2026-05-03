class strss{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Raghav");
        System.out.println("Append Fun: "+sb);
        sb.replace(0, 5, "hello");
        System.out.println("Replace Fun: "+sb);
        sb.reverse();
        System.out.println("Reverse Fun: "+sb);
        System.out.println("Capacity Fun: "+sb.capacity());
        sb.insert(0, "Q");
        System.out.println("Insert Fun: "+sb);
        System.out.println("Delete Fun: "+sb.delete(0, 2));
        System.out.println("CharAt Fun: "+sb.charAt(3));
        sb.trimToSize();
        System.out.println("TrimToSize Fun: "+sb.capacity());
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Data pattern");
        System.out.println(sb1);
    }
}