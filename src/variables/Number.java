package variables;

public class Number {
    
    public static void main(String[] args) {
        int a = 10, b = 5, c = 15;
        
        int ans = ++a + b-- + c ;

        System.out.println("ans is:" +ans);
        System.out.println("a:" +a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);

    }

}
