import java.util.function.Supplier;
import java.util.function.LongSupplier;

public class SupplierInterfaceExample {

    public static void main(String [] args){
        Supplier<String> s1 = () -> {return "Hello World";};
        System.out.println(s1.get());
        
        LongSupplier s2 = () -> { return 10L; };
        System.out.println(s2.getAsLong());
    }
}