public class AnonymousInnerClassExample{

    abstract class CanImplemetUsingAnon{
        abstract String pleasePrintSomething();
    }
    
    public void printMessage(){
        CanImplemetUsingAnon exampleClass = new CanImplemetUsingAnon(){
            String pleasePrintSomething() {
                return "Print this statement";
            }
        };
        
        System.out.println(exampleClass.pleasePrintSomething());
    }
    
    
    public static void main(String [] args){
    
        AnonymousInnerClassExample exampleClass = new AnonymousInnerClassExample();
        
        exampleClass.printMessage();
        
    }
    
}