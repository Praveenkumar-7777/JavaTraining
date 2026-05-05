class exe{
    public static void main(String[] args) {
        //ArithmeticException
        int a = 77;
        try {
            int b = a/0;
            System.out.println(b);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        //Null pointer
         String s = null;
        try {
           System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        //index out of bounds
        int arr[]={1,2,3,4,5};
        
        try {
            arr[9]=7;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        String str[]={};
        try {
            System.out.println(str[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}