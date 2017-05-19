import java.util.function.UnaryOperator;
import java.util.function.DoubleUnaryOperator;

public class UnaryOperatorExample {
    
    public static void main(String [] args){
        UnaryOperator<String> u1 = (s) -> {return s.toUpperCase(); } ;
        System.out.println(u1.apply("Hello World"));
        
        DoubleUnaryOperator u2 = (d) -> { return d*d; };
        System.out.println(u2.applyAsDouble(100));
    }
}