class cons{
    public static void main(String[] args) {
        constructor c = new constructor();
        constructor c2 = new constructor("sampath");
        constructor c3 = new constructor(c2);
        System.out.println(c2.name1);
        System.out.println(c3.name2);
        
    }
}
class constructor{
    String name1;
    String name2;

    constructor() {
        System.out.println("Hello");
    }

    constructor(String nm) {
        name1 = nm;
    }
    constructor(constructor j){
        name2 = j.name1;
    }

    
    

}