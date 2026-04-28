class twoclass{
    public static void main(String[] args) {
        sample obj = new sample();
        obj.sam();
        System.out.println(obj.a);
        System.out.println(sample.b);
    }
}

class sample{
    int a = 10;
    static int b =22;
    void sam(){
        int a = 99;
        System.out.println(a);

    }

}