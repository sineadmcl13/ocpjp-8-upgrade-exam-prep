class StaticNestedClassExample {

    static class NestedStaticClass {
        private String staticClassString = "This string is a var in the static nested class";
        private static String publicString = "This string can be accessed anywhere";
    }
    
    
    public static void main(String [] args){
        NestedStaticClass nestedClass = new NestedStaticClass();
        System.out.println(nestedClass.staticClassString);
        
        System.out.println(NestedStaticClass.publicString);

    }
}