public class LocalInnerClassExample {

    public void methodWithInnerClass(){
        String accesibleMethodString = "I can acccess this string";
        
        class InnerClass {
            public void printStringDeclaredInMethod(){
                System.out.println(accesibleMethodString);
            }
        }
        
        InnerClass innerClass = new InnerClass();
        innerClass.printStringDeclaredInMethod();
        
    }
    
    public static void main(String [] args){
        LocalInnerClassExample exampleClass = new LocalInnerClassExample();
        exampleClass.methodWithInnerClass();
    }
    
}