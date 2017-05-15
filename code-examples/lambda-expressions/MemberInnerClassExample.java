public class MemberInnerClassExample {

    private String privateStringAvailableToInner = "I can access this";
    
    protected class Inner{
        public void runInnerClassMethod(){
            System.out.println("In the Inner Class Method");
            System.out.println(privateStringAvailableToInner);
        }
    }
    
    public void callInner(){
        Inner inner = new Inner();
        inner.runInnerClassMethod();
    }
    
    public static void main(String [] args){
        MemberInnerClassExample innerClassExample = new MemberInnerClassExample();
        innerClassExample.callInner();
    }
}