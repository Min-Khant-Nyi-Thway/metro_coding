package variables;

public class test {
    
    public static void main(String[] args) {
    
        int x = 10, y = 20, z = 30;
        x=y;
        y=z;
        z=x;

        System.err.println("x:" + x);
        System.err.println("y:" + y);
        System.err.println("z:" + z);
        
    }

    
    
    

}
