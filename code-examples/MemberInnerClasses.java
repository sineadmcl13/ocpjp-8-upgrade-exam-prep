public class MemberInnerClasses {

    protected class Inner{
        public void runInnerClassMethod(){
            System.out.println("In the Inner Class Method");
        }
    }
    
    
    public void callInner(){
        Inner inner = new Inner();
        inner.runInnerClassMethod();
    }
    
    public static void main(String [] args){
        MemberInnerClasses innerClassExample = new MemberInnerClasses();
        innerClassExample.callInner();
    }
}