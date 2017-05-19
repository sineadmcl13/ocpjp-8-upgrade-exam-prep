import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class BinaryOperatorExample{
    
    public static void main(String[] args){
        
        BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;  
        System.out.println(b1.apply(10, 20));
        
        
        DoubleBinaryOperator b2 = (i1, i2) -> i1/i2;
        System.out.println(b2.applyAsDouble(100, 10));
    }
    
}