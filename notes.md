## 1ZO-810 Upgrade Java SE 7 to Java SE 8 OCP Programmer

----
#### Exam objectives

##### Lambda Expressions
-    [Describe and develop code that uses Java inner classes, including nested class, static class, local class, and anonymous classes](#describe-and-develop-code-that-uses-java-inner-classes-including-nested-class-static-class-local-class-and-anonymous-classes)
-    [Describe and write functional interfaces](#describe-and-write-functional-interfaces)
-    [Describe a lambda expression; refactor the code that uses an anonymous inner class to use a lambda expression; describe type inference and target typing](#describe-a-lambda-expression)

##### Using Built-in Lambda Types
-    Describe the interfaces of the java.util.function package
-    Develop code that uses the Function interface
-    Develop code that uses the Consumer interface
-    Develop code that uses the Supplier interface
-    Develop code that uses the UnaryOperator interface
-    Develop code that uses the Predicate interface
-    Develop code that uses the primitive and binary variations of the base interfaces of the java.util.function package
-    Develop code that uses a method reference, including refactoring a lambda expression to a method reference

##### Java Collections and Streams with Lambdas
-    Develop code that iterates a collection by using the forEach() method and method chaining
-    Describe the Stream interface and pipelines
-    Filter a collection by using lambda expressions
-    Identify the operations, on stream, that are lazy

##### Collection Operations with Lambda
-    Develop code to extract data from an object by using the map() method
-    Search for data by using methods such as findFirst(), findAny(), anyMatch(), allMatch(), and noneMatch()
-    Describe the unique characteristics of the Optional class
-    Perform calculations by using Java Stream methods, such as count(), max(), min(), average(), and sum()
-    Sort a collection by using lambda expressions
-    Develop code that uses the Stream.collect() method and Collectors class methods, such as averagingDouble(), groupingBy(), joining(), and partitioningBy()

##### Parallel Streams
-    Develop code that uses parallel streams
-    Implement decomposition and reduction in streams

##### Lambda Cookbook
-    Develop code that uses Java SE 8 collection improvements, including Collection.removeIf(), List.replaceAll(), Map.computeIfAbsent(), and Map.computeIfPresent() methods
-    Develop code that uses Java SE 8 I/O improvements, including Files.find(), Files.walk(), and lines() methods
-    Use flatMap() methods in the Stream API
-    Develop code that creates a stream by using the Arrays.stream() and IntStream.range() methods

##### Method Enhancements
-    Add static methods to interfaces
-    Define and use a default method of an interface and describe the inheritance rules for the default method

##### Use Java SE 8 Date/Time API
-    Create and manage date- and time-based events, including a combination of date and time in a single object, by using LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration
-    Work with dates and times across time zones and manage changes resulting from daylight savings, including Format date and times values
-    Define, create, and manage date- and time-based events using Instant, Period, Duration, and TemporalUnit

----
### Lambda Expressions

#### Describe and develop code that uses Java inner classes, including nested class, static class, local class, and anonymous classes

There are four of types of nested classes:

- A member inner class is a class defined at the same level as instance variables. It is not static. Often, just referred to as an inner class.
- A local inner class defined within a method.
- An anonymous inner class is a local inner class that does not have a name.
- A static nested class is a static class that is defined at the same level as static variables.

##### Member Inner Classes
Member inner classes have the following properties:

- Can be declared public, private, or protected or use default access 
- Can extend any class and implement interfaces
- Can be abstract or final
- Cannot declare static fields or methods
- Can access members of the outer class including private members

[Code example found here](code-examples/lambda-expressions/MemberInnerClassExample.java)

##### Local Inner Classes
A local inner class is a nested class defined within a method
- They do not have an access specifier.
- They cannot be declared static and cannot declare static fields or methods.
- They have access to all fields and methods of the enclosing class.
- They do not have access to local variables of a method unless those variables are final or effectively final. 

(If the code can still compile with the keyword final inserted before a local variable, the variable is effectively final)

[Code example found here](code-examples/lambda-expressions/LocalInnerClassExample.java)


##### Anonymous Inner Classes

An anonymous inner class is a local inner class that is declared and instantiated all in one statement using the new keyword

- They are required to extend an existing class or implement an existing interface
- Remeber that if assigned to a local variable it must end with semicolons, just like other Java statements
- You can't implement both an interface and extend a class unless it is java.lang.Object

[Code example found here](code-examples/lambda-expressions/AnonmousInnerClassExample.java)

##### Static Nested Classes

A static nested class is a static class defined at the member level

It is like a regular class except for the following:
- The nesting creates a namespace because the enclosing class name must be used to refer to it.
- It can be made private or use one of the other access modifiers to encapsulate it. 
- The enclosing class can refer to the fields and methods of the static nested class.

[Code example found here](code-examples/lambda-expressions/StaticNestedClassExample.java)


### Describe and write functional interfaces

##### Defining a Functional Interface
Java defines a functional interface as an interface that contains a single abstract method
They are the basis for lambda expressions in functional programming.

[Code example found here](code-examples/lambda-expressions/FunctionalInterfaceDemo.java)


### Describe a lambda expression 

A lambda expression consists of the following: 

- A comma-separated list of formal parameters enclosed in parentheses

```java
p -> p.getAge() >= 18
(Pet p) -> p.getAge() >= 18
(p) -> p.getAge() >= 18

```

- The arrow token ->
-  A body, which consists of a single expression or a statement block.

```java
p -> p.getAge() >= 18
p -> { p.getAge() >= 18 }
p -> { return p.getAge() }

```

A return statement is NOT an expression; in a lambda expression, you MUST enclose statements in braces ({...}). However, you do not have to enclose a void method invocation in braces. For example, the following is a valid lambda expression: 

```java
name -> System.out.println(name)
```
 
#### Refactor the code that uses an anonymous inner class to use a lambda expression

The following lines of code demonstrate a typical anonymous inner class implementation for a button action implementation

```java
JButton button = ...
JLabel comp = ...

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        comp.setText("Button has been clicked");
    }
});
```


In Java 8, we would write this code example as a lambda expression, as shown in example below: 

```java
JButton button = ...
JLabel comp = ...

button.addActionListener(e -> comp.setText("Button has been clicked"));
```

#### Describe type inference and target typing

In the examples above we have not declared the type of the variable being passed. THe Java compiler is inferring the type of the variable from its context.

It means that you do not need to explicitly write out the type when it is obvious. 
In some situations where the Java compiler cannot infer types, you MUST explicitly specify values for type variables with type witnesses.

----
### References

- Education.oracle.com. (2017). Upgrade Java SE 7 to Java SE 8 OCP Programmer | Oracle Certification Exam. [online] Available at: [https://education.oracle.com](https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=5001&get_params=p_exam_id:1Z0-810) [Accessed 15 May 2017].

- Ganesh, S., Kiran, H. and Sharma, T. (2016). Oracle Certified Professional Java SE 8 programmer exam 1Z0-809. 1st ed.
