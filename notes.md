## 1ZO-810 Upgrade Java SE 7 to Java SE 8 OCP Programmer

----
#### Exam objectives

##### Lambda Expressions
-    [Describe and develop code that uses Java inner classes, including nested class, static class, local class, and anonymous classes](#describe-and-develop-code-that-uses-java-inner-classes-including-nested-class-static-class-local-class-and-anonymous-classes)
-    [Describe and write functional interfaces](#describe-and-write-functional-interfaces)
-    [Describe a lambda expression; refactor the code that uses an anonymous inner class to use a lambda expression; describe type inference and target typing](#describe-a-lambda-expression)

##### Using Built-in Lambda Types
-    [Describe the interfaces of the java.util.function package](#develop-code-that-uses-the-function-interface)
-    [Develop code that uses the Function interface](#develop-code-that-uses-the-function-interface)
-    [Develop code that uses the Consumer interface](#develop-code-that-uses-the-consumer-interface)
-    [Develop code that uses the Supplier interface](#develop-code-that-uses-the-supplier-interface)
-    [Develop code that uses the UnaryOperator interface](#develop-code-that-uses-the-unaryOperator-interface)
-    [Develop code that uses the Predicate interface](#develop-code-that-uses-the-predicate-interface)
-    [Develop code that uses the primitive and binary variations of the base interfaces of the java.util.function package](#develop-code-that-uses-the-primitive-and-binary-variations-of-the-base-interfaces-of-the-javautilfunction-package)
-    [Develop code that uses a method reference, including refactoring a lambda expression to a method reference](#develop-code-that-uses-a-method-reference-including-refactoring-a-lambda-expression-to-a-method-reference)

##### Java Collections and Streams with Lambdas
-    [Develop code that iterates a collection by using the forEach() method and method chaining](#develop-code-that-iterates-a-collection-by-using-the-foreach-method-and-method-chaining)
-    [Describe the Stream interface and pipelines](#describe-the-stream-interface-and-pipelines)
-    [Filter a collection by using lambda expressions](#filter-a-collection-by-using-lambda-expressions)
-    [Identify the operations, on stream, that are lazy](#identify-the-operations-on-stream-that-are-lazy)

##### Collection Operations with Lambda
-    [Develop code to extract data from an object by using the map() method](#develop-code-to-extract-data-from-an-object-by-using-the-map-method)
-    [Search for data by using methods such as findFirst(), findAny(), anyMatch(), allMatch(), and noneMatch()](#search-for-data-by-using-methods-such-as-findfirst-findany-anymatch-allmatch-and-nonematch)
-    [Describe the unique characteristics of the Optional class](#describe-the-unique-characteristics-of-the-optional-class)
-    [Perform calculations by using Java Stream methods, such as count(), max(), min(), average(), and sum()](#perform-calculations-by-using-java-stream-methods-such-as-count-max-min-average-and-sum)
-    [Sort a collection by using lambda expressions](#sort-a-collection-by-using-lambda-expressions)
-    [Develop code that uses the Stream.collect() method and Collectors class methods, such as averagingDouble(), groupingBy(), joining(), and partitioningBy()](#develop-code-that-uses-the-streamcollect-method-and-collectors-class-methods-such-as-averagingdouble-groupingby-joining-and-partitioningby)

##### Parallel Streams
-    [Develop code that uses parallel streams](#develop-code-that-uses-parallel-streams)
-    [Implement decomposition and reduction in streams](#implement-decomposition-and-reduction-in-streams)

##### Lambda Cookbook
-    [Develop code that uses Java SE 8 collection improvements, including Collection.removeIf(), List.replaceAll(), Map.computeIfAbsent(), and Map.computeIfPresent() methods](#develop-code-that-uses-java-se-8-collection-improvements-including-collectionremoveif-listreplaceall-mapcomputeifabsent-and-mapcomputeifpresent-methods)
-    [Develop code that uses Java SE 8 I/O improvements, including Files.find(), Files.walk(), and lines() methods](#develop-code-that-uses-java-se-8-io-improvements-including-filesfind-fileswalk-and-lines-methods)
-    [Use flatMap() methods in the Stream API](#use-flatmap-methods-in-the-stream-api)
-    [Develop code that creates a stream by using the Arrays.stream() and IntStream.range() methods](#develop-code-that-creates-a-stream-by-using-the-arraysstream-and-intstreamrange-methods)

##### Method Enhancements
-    [Add static methods to interfaces](#add-static-methods-to-interfaces)
-    [Define and use a default method of an interface and describe the inheritance rules for the default method](#define-and-use-a-default-method-of-an-interface-and-describe-the-inheritance-rules-for-the-default-method)

##### Use Java SE 8 Date/Time API
-    [Create and manage date- and time-based events, including a combination of date and time in a single object, by using LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration](#create-and-manage-date--and-time-based-events-including-a-combination-of-date-and-time-in-a-single-object-by-using-localdate-localtime-localdatetime-instant-period-and-duration)
-    [Work with dates and times across time zones and manage changes resulting from daylight savings, including Format date and times values](#work-with-dates-and-times-across-time-zones-and-manage-changes-resulting-from-daylight-savings-including-format-date-and-times-values)
-    [Define, create, and manage date- and time-based events using Instant, Period, Duration, and TemporalUnit](#define-create-and-manage-date--and-time-based-events-using-instant-period-duration-and-temporalunit)

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
- Remember that if assigned to a local variable it must end with semicolons, just like other Java statements
- You can't implement both an interface and extend a class unless it is java.lang.Object

[Code example found here](code-examples/lambda-expressions/AnonymousInnerClassExample.java)

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

In the examples above we have not declared the type of the variable being passed. The Java compiler is inferring the type of the variable from its context.

It means that you do not need to explicitly write out the type when it is obvious. 
In some situations where the Java compiler cannot infer types, you MUST explicitly specify values for type variables with type witnesses.

----

### Using Built-in Lambda Types

#### Describe the interfaces of the java.util.function package
Java 8 have captured the common use cases of lambdas and created a library of functions for them. A new package called java.util.function was created to host these common functions. 

It includes :
- java.util.function.Predicate
- java.util.function.Consumer
- java.util.function.Function
- java.util.function.Supplier
- java.util.function.UnaryOperator
and primitive and binary variations of the above

#### Develop code that uses the Function interface

- Parameter type: T
- Return type: R
- Applies a function to one argument and produces a result 
- Can turn one parameter into a value of a potentially different type and return it

```java
    @FunctionalInterface 
    public class Function<T, R> { 
        R apply(T t);
    }

```
##### BiFunction interface

```java
    @FunctionalInterface 
    public class BiFunction<T, U, R> { 
        R apply(T t, U u);
    }   

```

##### Primitive Function Functional Interfaces
| Functional Interface   | Parameters | Return Type| Single Abstract Method |
| -------------          |:---------- | -----      | ----
| DoubleFunction`<R>`    | 1 double   | R          | apply
| IntFunction`<R>`       | 1 int      | R          | apply
| LongFunction`<R>`      | 1 long     | R          | apply


[Code example found here](code-examples/built-in-lambda-types/FunctionInterfaceExample.java)


#### Develop code that uses the Consumer interface
- Parameter type: T
- Return type: void
- A function that accepts one parameter but returns nothing

```java
    @FunctionalInterface
    public class Consumer<T>{
        void accept(T t);
    }
```

##### BiConsumer interface

```java
    @FunctionalInterface 
    public class BiConsumer<T, U> { 
        void accept(T t, U u);
    }   

```
##### Primitive Consumer Functional Interfaces
| Functional Interface | Parameters | Return Type| Single Abstract Method |
| -------------        |:---------- | -----      | ----
| DoubleConsumer       | 1 double   | n/a        | accept
| IntConsumer          | 1 int      | n/a        | accept
| LongConsumer         | 1 long     | n/a        | accept


[Code example found here](code-examples/built-in-lambda-types/ConsumerInterfaceExample.java)


#### Develop code that uses the Supplier interface
- Parameter type: n/a
- Return type: R
- A function that can get a value without taking any input

```java
    @FunctionalInterface
    public class Supplier<T>{
        public T get();
    }
```

##### Primitive Supplier Functional Interfaces
| Functional Interface | Parameters | Return Type| Single Abstract Method |
| -------------        |:---------- | -----      | ----
| DoubleSupplier       | n/a        | double     | getAsDouble
| IntSupplier          | n/a        | int        | getAsInt
| LongSupplier         | n/a        | long       | getAsLong


[Code example found here](code-examples/built-in-lambda-types/SupplierInterfaceExample.java)


#### Develop code that uses the UnaryOperator interface
- The java.util.function.UnaryOperator is functional interface that extends java.util.function.Function
- It requires all parameters be of the same type
- Paramter type: T
- Return type: T
- Applies a function to its paramter to return one of the same type

```java
    @FunctionalInterface
    public class UnaryOperator<T> extends Function<T, T>{
        T apply(T t);
    }
    
```

##### Primitive UnaryOperator Functional Interfaces
| Functional Interface | Parameters | Return Type| Single Abstract Method |
| -------------        |:---------- | -----      | ----
| DoubleUnaryOperator  | 1 double   | double     | applyAsDouble
| IntUnaryOperator     | 1 int      | int        | applyAsInt
| LongUnaryOperator    | 1 long     | long       | applyAsLong

[Code example found here](code-examples/built-in-lambda-types/UnaryOperatorExample.java)


##### BinaryOperator interface

```java
    @FunctionalInterface
    public class BinaryOperator<T, T> extends BiFunction<T, T, T> {
        T apply(T t, T t);
    }
```

##### Primitive BinaryOperator Functional Interfaces
| Functional Interface | Parameters | Return Type| Single Abstract Method |
| -------------        |:---------- | -----      | ----
| DoubleBinaryOperator | 2 double   | double     | applyAsDouble
| IntBinaryOperator    | 2 int      | int        | applyAsInt
| LongBinaryOperator   | 2 long     | long       | applyAsLong


[Code example found here](code-examples/built-in-lambda-types/BinaryOperatorExample.java)


#### Develop code that uses the Predicate interface
- Often used when filtering or matching
- Parameter type: T
- Return type: boolean
- Tests the parameter and returns a boolean depending on the outcome

```java
    @FunctionalInterface
    public class Predicate<T> {
        boolean test(T t);
    }
```

##### BiPredicate interface

```java
    @FunctionalInterface
    public class BiPredicate<T, U> {
        boolean test(T t, U u);
    }
```

##### Primitive Predicate Functional Interfaces
| Functional Interface | Parameters | Return Type| Single Abstract Method |
| -------------        |:---------- | -----      | ----
| DoublePredicate       | 1 double  | boolean    | test
| IntPredicate          | 1 int     | boolean    | test
| LongPredicate         | 1 long    | boolean    | test

[Code example found here](code-examples/built-in-lambda-types/PredicateInterfaceExample.java)


#### Develop code that uses the primitive and binary variations of the base interfaces of the java.util.function package

Every Java type is either a reference type (i.e String, Integer, etc) or a primitive type (i.e int, double, etc). But generic parameters (i.e the T in Consumer`<T>`) can be bound only to reference types.

A specialized version of the functional interfaces exists in order to avoid autoboxing operations when the inputs or outputs are primitives

These interfaces are outlined above in tables with each of the Functional Interfaces

#### Develop code that uses a method reference, including refactoring a lambda expression to a method reference

Method references are a way to make the code shorter by reducing some of the code that can be inferred and simply mentioning the name of the method
There are four formats for method references:
- Static methods
- Instance methods on a particular instance
- Instance methods on an instance to be determined at runtime 
- Constructors

A method reference can't be used for any method. **They can only be used to replace a single-method lambda expression.**


In other words:

Instead of using **AN ANONYMOUS CLASS**

you can use **A LAMBDA EXPRESSION**

And if this just calls one method, you can use **A METHOD REFERENCE**

###### Static methods
A non-constructor method reference consists of a qualifier, followed by the :: delimiter, followed by an identifier. 

```java
    Class::staticMethodName
```

Refactoring example
```java
    IntFunction<String> f1 = (i) -> String.valueOf(i);
    System.out.println(f1.apply(10));
    
    IntFunction<String> f2 = String::valueOf;
    System.out.println(f1.apply(20));
```

###### Instance methods on a particular instance
```java
    object::instanceMethodName
```

Refactoring Example
```java
    Pet pet = new Pet();
    Supplier<String> f1 = () -> pet.toString();
    System.out.println(f1.get());
    
    Supplier f2 = pet::toString;
    System.out.println(f2.get());
```

###### Instance methods on an instance to be determined at runtime
```java
    Class:instanceMethodName
```

Refactoring Example

```java
    Function<String, Integer> f1 = (s) - > s.length();
    System.out.println(f1.apply("Hello World));
    
    Function<String, Integer> f2 = String::length;
    System.out.println(f2.apply("Hello World));
```

###### Constructors

```java
    ClassName::new
```

Refactoring Example

```java
    Function<char[], String> f1 = (arr) -> new String(arr);
    System.out.println(f1.apply(new char[] {'H', 'i'}));

    Function<char[], String> f2 = String::new;
    System.out.println(f2.apply(new char[] {'P', 'Q', 'R'}))
```

---- 

### Java Collections and Streams with Lambdas

#### Develop code that iterates a collection by using the forEach() method and method chaining

There are multiple way of looping through a collection. You could use an iterator, the enhanced for loop or a number of other approaches. With Java 8 you can now use a lambda.

```java
    List<String> names = Arrays.asList("Mike", "Dave", "John");
    for(String name : names){
        System.out.println(name);
    }
```

With lambdas you can use the forEach() method
```java
    default void forEach(Consumer<? super T> action)
```

```java
    names.forEach(n -> System.out.println(n));
```

#### Describe the Stream interface and pipelines
A stream is a sequence of data. A stream pipeline is the operation that runs on a stream to produce a result

`Stream` does not store data, it operates on the source data structure (Collection or array) and produces pipelined data that we can use to perform specific operations. For example, we can create a Stream from a `java.util.List` and filter it based on a condition as shown below.

```java
    List<String> names = Arrays.asList("Mike", "John", "Dave", "Peter");
    names.stream()
        .filter(n -> n.length() == 4)
        .map(String::toUpperCase)
        .forEach(n -> System.out.println(n));
```

Stream API operations that returns a new `java.util.stream.Stream` are called **intermediate operations**. 

Most of the times, these operations are lazy in nature, computation on the source data is only performed when the terminal operation is initiated, and source elements are consumed only as needed. 

##### Intermediate Operations
Intermediate operations are never the final result producing operations. Commonly used intermediate operations are filter and map. 

- **Stream.filter**

```java
    Stream<T> filter(Predicate<? super T> predicate);
```

```java
    stream.filter(s -> s.equals("Hello World"));
```

- **Stream.map()**
```java
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
```
in other words, for each item, create a new object based on that item. example below

```java
    stream.map(s -> s.toUpperCase());
```

- **Stream.distinct()**
```java
    Stream<T> distinct();
```

```java
    List<String> list = Arrays.asList("a", "aa", "a", "b", "b");
    long l = list.stream().distinct().count();
    System.out.println(l);
```

- **Stream.peek()**

Returns a `Stream` itself after applying the action passed as a `Consumer` 
```java
    Stream<T> peek(Consumer<? super T> action)
```

```java
    Stream<String> names = Stream.of("John", "Mike", "Dean", "Paul");
    List<String> list = names
        .peek(n -> System.out.println(n))
        .map(n -> n.toUpperCase())
        .collect(Collectors.toList());
    
    list.forEach(n -> System.out.println(n));
    
```

##### Terminal Operations
Stream API operations that returns a result or produce a side effect. Once the terminal method is called on a stream, it consumes the stream and after that we can not use it

- **Stream.collect()**
Used to transform the elements of the stream into a different kind of result

```java
    <R, A> R collect(Collector<? super T, A, R> collector);
```


```java
    List<String> names = Arrays.asList("John", "Mike", "Mark", "Paul");
    List<String> filtered = names.stream()
        .filter(n -> n.startsWith("M"))
        .collect(Collectors.toList());
    
    filtered.forEach(n -> System.out.println(n));
```

- **Stream.min() / Stream.max()**

```java
    Optional<T> min(Comparator<? super T> comparator);
    Optional<T> max(Comparator<? super T> comparator);
```

`Stream.min()` and `Stream.max()` both return an `Optional` instance which has a `get()` method, which you can use to obtain the value. 

Both methods also take a `Comparator` as a parameter. The `Comparator.comparing()` method creates a `Comparator` based on the lambda expression passed to it. 


```java
    Comparator<Person> byLastName = Comparator.comparing(Person::getLastName);
```


- **Stream.findAny()**

The `findAny` method immediatley stops pipeline execution, so no further elements will be processed

```java
    List<String> names = Arrays.asList("Mark", "Mike", "Paul", "Peter");
    Optional<String> result = names.stream()
                             .filter(n -> n.startsWith("M"))
                             .findAny();
     System.out.println(result.get());
```


- **Stream.findFirst()**

Provides the first element from the stream. Also returns an `Optional`

```java
    Optional<T> findFirst();
```

- **Stream.count()**

Returns the number of elements in the stream after filtering has been applied

```java
    long count();
```

```java
    List<String> names = Arrays.asList("Peter", "Paul", "Pat", "Dave");
    
    long l = names.stream()
        .filter(n -> n.startsWith("P"))
        .count();
    System.out.println(l);
    
```

##### Pipelines

A stream pipeline consists of 
 - a source. e.g a `Collection` 
 - zero or more intermediate operations. These transform the `Stream` into another `Stream` e.g `filter(Predicate p)`
 - a terminal operation which produces a side-efect. eg. `count()` or `forEach(Consumer c)`
 
 
#### Filter a collection by using lambda expressions

The `Stream.filter()` method is an intermediate operation. You can filter a `Stream` with more than one condition by chaining `filter()` methods

```java
    List<String> names = Arrays.asList("Mark", "Matthew", "Mike", "Paul", "Peter");
    
    names.stream()
        .filter(n -> n.startsWith("M"))
        .filter(n -> n.length() == 4)
        .forEach(n -> System.out.println(n));
            
```

#### Identify the operations, on stream, that are lazy

Streams have two types of methods: **intermediate** and **terminal**, which work together. They can be called "lazy" due to the way we chain multiple intermediate operations followed by a terminal operation. 

Calls to intermediate methods e.g `filter()` return immediately and the lambda expressions provided to them are not evaluated right away. Their behaviour is cached for later execution.

The cached behaviour of intermediate operations is run when one of the terminal operations, like `findFirst()` is called. Not all the cached code is executed and computation will complete as soon as the desired result is found

```java
    List<String> names = Arrays.asList("Peter", "Paul", "Simon", "Mike", "Dave");
    String name = names.stream()
        .filter(s -> {
            System.out.println("filtering " + s);
            return s.length() == 4;
        })
        .map(s -> {
            System.out.println("uppercasing " + s);
            return s.toUpperCase();
        })
        .findFirst()
        .get();
    System.out.println(name);
```

The output will be 
```java
    filtering Peter
    filtering Paul
    uppercasing Paul
    PAUL
``` 

----

### Collection Operations with Lambda

#### Develop code to extract data from an object by using the map() method

Streams support the method `map()` which take a `Function` as an argument and returns a `Stream`

```java
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
```

```java
    Stream<String> stream = Stream.of("Mark", "Luke", "Paul", "Dave");
    Stream<String> upperCase = stream.map(s -> s.toUpperCase());
    upperCase.forEach(s -> System.out.println(s));   
```

`map()` can also be chained

```java
    Stream<String> stream = Stream.of("Mark", "Luke", "Paul", "Dave");
    Stream<String> upperCase = stream
            .map(s -> s.substring(0,1))
            .map(s -> s.toLowerCase());
    upperCase.forEach(s -> System.out.println(s));
```

##### Primitive stream specialisations
The most common methods used to convert a stream to a primitive specialised version are `Stream.mapToInt()`, `Stream.mapToDouble` and `Stream.mapToLong`. There methods work exactly like the method `Stream.map()` but return a specialised stream

```java
    Stream<String> names = 
                        Stream.of("Mark", "Matthew", "John", "Peter");
    
    IntStream lengths = names.mapToInt(n -> n.length());
    lengths.forEach(n -> System.out.println(n));

```

#### Search for data by using methods such as findFirst(), findAny(), anyMatch(), allMatch(), and noneMatch()

- **findFirst()**

Returns the first element of the stream unless the stream is empty. If the stream is empty, it returns an empty `Optional`

```java
    Option<T> findFirst();
```

```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    Optional<Integer> results = 
                numbers.stream().filter(i -> i% 3 == 0).findFirst();

    System.out.println(results.get());
```

- **findAny()**

Returns an arbritary element of the stream unless the stream is empty. If the stream is empty, it returns an empty `Optional`

```java
    Optional<T> findAny();
```

```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    Optional<Integer> results = 
                numbers.stream().filter(i -> i% 3 == 0).findAny();

    System.out.println(results.get());
```

The behavior of `findAny()` operation is explicitly nondeterministic; it is free to select any element in the stream. This is to allow for maximal performance in parallel operations


- **anyMatch()**

The `anyMatch()` method searches a stream and returns information about how the stream pertains to the predicate.

```java
    boolean anyMatch(Preciate<? super T> predicate);
```

```java
    Stream<String> names = Stream.of("Mike", "Mark", "Peter", "Dave");
    boolean nameWith5Chars = names.anyMatch(n -> n.length() == 5);
    System.out.println(nameWith5Chars);
    
```

- **allMatch()**

Works in the same way as `anyMatch()` but will check if all the elements in the stream match the given `Predicate`

```java
    boolean allMatch(Predicate<? super T> predicate);
```

```java
    Stream<String> names = Stream.of("Mike", "Mark", "Peter", "Dave");
    boolean allWith4Chars = names.allMatch(n -> n.length() == 4);
    System.out.println(allWith4Chars);
```

- **noneMatch()**

Works in the same way as `allMatch()` but ensures that none of the elements in the stream match the `Predicate`

```java
    boolean noneMatch(Predicate<? super T> predicate);
```

```java
    Stream<String> names = Stream.of("Mike", "Mark", "Peter", "Dave");
    boolean none6CharsLong = names.noneMatch(n -> n.length() == 6);
    System.out.println(none6CharsLong);
```

*All findXxx() methods have no arguments and return `Optional`*

*All xxxMatch() methods accept a `Predicate` and return a `boolean` primitive*


#### Describe the unique characteristics of the Optional class

A `java.util.Optional` object is a wrapper for an `Object` of type `T` or a wrapper for no object. It is intended as a safer alternative than a reference of type `T` that refers to an `Object` or `null`

There are several ways to create optional objects. 

- Empty Optional

```java
    Optional<String> str = Optional.empty();
```

- Optional from a non-null value
```java
    String str = "Giraffes";
    Optional<Srting> optStr = Optional.of(str);
```

- Optional from null

```java
    String str = null;
    Optional<String> = Optional.ofNullable(str);
    
    //in this example the resulting Optional object would be empty
```

**Unwrapping an `Optional`**

- **`Optional.get()`**
    
    It returns the wrapped value if present but throws a `NoSuchElementException` otherwise
    
- **`Optional.orElse(T other)`**

    Allows you to prvode a default value for when the optional does not contain a value
    
    
- `Optional.orElseGet(Supplier<? extends T> other)`

    The `Supplier` is invoked only if the optional contains no value. 
    
- **`Optional.orElseThrow(Supplier<? extends X> exceptionSupplier)`**

    similar to `get()` in that it throws an exception when empty, but in this case you can choose the type of exception to throw
    
- **`Optional.ifPresent()`**

    Returns true is the `Optional` contains a value, `false` otherwise
    
#### Perform calculations by using Java Stream methods, such as count(), max(), min(), average(), and sum()

- **`count()`**

Determines to number of elements in a finite stream. 

```java
    long count()
```

```java
    Stream<String> s = Stream.of("John", "James", "Joe");
    System.out.println(s.count());
```

- **`min()` and `max()`**

Allows you to pass a custom comparator and find the smallest and largest value of a finite stream according to that sort order

```java
    Optional<T> min(<? super T> comparator)
    Optional<T> max(? super T> comparator);
```

```java
    Stream<String> s = Stream.of("John", "James", "Joe");
    Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
    min.ifPresent(System.out::println);
    
    Optional<String> max = s.max((s1, s2) -> s1.length() - s2.length());
    max.ifPresent(System.out::println);
```

- **`average()` and `sum()`**

The stream library has specialized types IntStream, LongStream, and DoubleStream that store primitive values directly, without using wrappers.
The `sum()` and `average()` methods are defined for these and not defined for `Stream`

```java
    IntStream stream = IntStream.of(2, 4, 6, 1, 34, 5, 9);
    double average = stream.average().getAsDouble();
    int sum = stream.sum();
```

#### Sort a collection by using lambda expressions

Java streams API has several sorting methods. 

- **`sorted()`**

Returns a stream with the elements sorted. Java uses natural ordering unless we specify a comparator

```java
    Stream<T> sorted()
    Stream<T> sorted(Comparator<? superT> comparator)
```


```java
    Stream<String> names = Stream.of("Bill", "Conor", "Andy");
    names.sorted().forEach(System.out::println);
```
```java
    Stream<String> reverse = Stream.of("Bill", "Conor", "Andy");
    reverse.sorted(Comparator.reverseOrder()).forEach(System.out::println);    
```

- **`comparing(...)`**

The `comparing(...)` method has been added to the `Comparator` interface. It can be used to provide custom sorting logic 

```java
    Stream<String> names = Stream.of("Aaron", "Conor", "Bill");
    
    Comparator<String> c1 = Comparator.comparing(n -> n.length());
    names.sorted(c1).forEach(System.out::println);
    
```

- **`Comparator.thenComparing(...)`**

This is a default method of `Comparator` interface introduced in Java 8. Allows you do a sorting by composite condition 

```java
    Stream<String> names = Stream.of("Aaron", "Andy", "Barney", "Bill");
    
    Comparator<String> c1 = Comparator.comparing(n -> n.length());
    Comparator<String> c2 = (n1, n2) -> n1.compareTo(n2);
    
    names.sorted(c1.thenComparing(c2))
         .forEach(System.out::println);
    
```

#### Develop code that uses the Stream.collect() method and Collectors class methods, such as averagingDouble(), groupingBy(), joining(), and partitioningBy()


The `Stream.collect(...)` method allows you to collect the results of an action on the stream together. This method takes 3 arguments

- A supplier to make new instances of the target object, eg. a constructor for an set
- An accumulator that adds an element to the target e.g an `add` method
- A combiner that merges 2 objects into 1, such as `addAll`

The `Collector` interface is a convenient interface with factory methods for common collectors 

e.g
```java
    List<String> result = stream.collect(Collectors.toList());
```

- **`Collectors.averagingDouble(ToDoubleFunction<? super T> mapper)`**

Calculates the average of stream elements as `double` data type. It returns the `Collector` interface

```java
    List<String> list = Arrays.asList("A", "AA", "A", "AAA");
    double result = 
        list.stream()
        .collect(Collectors.averagingDouble(s -> s.length()));
    System.out.println(result);
```

- **`Collectors.groupingBy(Function<? super T, ? extends K> classifier)`**

Groups elements according to the `Function` provided as returns the results in a `map`

```java
    List<String> list = Arrays.asList("A", "AA", "A", "AAA");
    Map<Integer, List<String>> result = 
        list.stream().collect(Collectors.groupingBy(String::length));
    System.out.println(result);
```

- **`Collectors.joining()`**

This concatenates all elements in a stream into a single string by invoking the `toString()` method on each object in the stream.

```java
    Stream<String> names = Stream.of("James", "John", "Joe");
    String concat = names.collect(Collectors.joining());
    System.out.println(concat);
    // JamesJohnJoe
```

```java
    Stream<String> names = Stream.of("James", "John", "Joe");
    String concat = names.collect(Collectors.joining(", "));
    System.out.println(concat);
    // James, John, Joe
```

- **`Collectors.partiitioningBy(Predicate<? super T> predicate)`**

As `partitioingBy(..)` takes a `Predicate` there are only possible groups; true and false. 

```java
    Stream<String> names = Stream.of("John", "Joe", "James");
    Map<Boolean, List<String>> map = names.collect(
        Collectors.partitioningBy(s -> s.length() <= 4));
    System.out.println(map);
    //{false=[James], true=[John, Joe]}
```

- **`Collectors.toMap(...)`**

```java
    Collectors.toMap(Function, Function)
    Collectors.toMap(Function, Function, BinaryOperator)
```

Java 8 provides Collectors.toMap() that is useful to convert `List` to `Map`. We need to pass a mapping `Function` for both the key and value. 

The Collector created by Collectors.toMap throws `java.lang.IllegalStateException` if an attempt is made to store a key that already exists in the Map


If you want to collect items in a Map and if you expect duplicate entries in the source, you should use `Collectors.toMap(Function, Function, BinaryOperator)` method.

----

### Parallel Streams

#### Develop code that uses parallel streams

Streams can be sequential or parallel.

Sequential example
```java
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    nums.stream().forEach(System.out::print);
    //1234
```

Parallel example

```java
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    nums.stream().parallel().forEach(System.out::print);
    //3421 - can change every time its ran 
```

#### Implement decomposition and reduction in streams

The `reduce(...)` method of the `Stream` interface performs a reduction operation on the stream to reduce it to a single value

```java
    reduce(T identity, BinaryOperator<T> accumulator);
```

```java
    List<Integer> nums = Arrays.asList(1, 2, 3, 4);
    Integer sum = nums.stream().reduce(0, (n1, n2) -> n1 + n2);
    System.out.println(sum);
```

----

### Lambda Cookbook

#### Develop code that uses Java SE 8 collection improvements, including Collection.removeIf(), List.replaceAll(), Map.computeIfAbsent(), and Map.computeIfPresent() methods


- **`Colection.removeIf()`**

Java 8 introduced a new method called `removeIf` that allows you remove elements from a collection using a `Predicate`

```java
    boolean removeIf(Predicate<? super E> filter);
```

```java
   List<String> list = new ArrayList<>();
   list.add("Magician");
   list.add("Assistant");
   System.out.println(list); // [Magician, Assistant]
   list.removeIf(s -> s.startsWith("A"));
   System.out.println(list); // [Magician]
```

- **`List.replaceAll()`**

Allows you to pass a lambda expression and have it applied to each element in the list. The result replaces that element in the list

```java
    void replaceAll(UnaryOperator<E> o)
```

```java
    List<Integer> nums = Arrays.asList(1, 2, 3);
    nums.replaceAll(n -> n * 2);
    nums.forEach(System.out::println);
```

- **`Map.computeIfAbsent`**

This takes a `BiFunction` which is called when the requested key is found

```java
    V computeIfPresent(K key, BiFunction<? super K, ? extends V> function)
```

```java
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Tom", 1);
    
    BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
    Integer tomCount = counts.computeIfPresent("Tom", mapper);
    System.out.println(tomCount);
    
```

- **`Map.computeIfAbsent()`**

Takes a `Function` which is called when the requested key is not found

```java
    V computeIfAbsent(K key, Function<? super K, ? extends V> function)
```


```java
    Map<String, Integer> counts = new HashMap<>();
    counts.put("Tom", 1);
    
    Function<String, Integer> mapper = (k) -> 1;
    Integer simonCount = counts.computeIfAbsent("Simon", mapper);
    System.out.println(simonCount);
```

#### Develop code that uses Java SE 8 I/O improvements, including Files.find(), Files.walk(), and lines() methods

- **`Files.find(...)`**

Returns a `Stream` that is lazily populated with `Path` by searching for files in a file tree rooted at a given starting file

```java
    public static Stream<path> find(Path start,
                        int maxDepth,
                        BiPredicate<Path, BasicFileAttributes> matcher,
                        FileVisitOption... options) 
                        throws IOException
```

[Code example found here](code-examples/lambda-cookbook/FilesFindExample.java)

- **`Files.walk(...)`**

Returns a `Stream` that is lazily populated with `Path` by walking the file tree rooted at a given starting file. The file tree is traversed depth-first, the elements in the stream are `Path` objects that are obtained as if by resolving the relative path against start.

```java
    public static Stream<Path> walk(Path start,
                                    int maxDepth,
                                    FileVisitOption... options)
                                    throws IOException
```

Points to note about the `Files.walk(...)` method
1. The first value that is returned is the starting directory itself
2. It walks the directory is a depth first manner, meaning it process the children of a directory before moving to the sibling directory
3. The order of processing the siblings is not defined, so the order is not guaranteed


[Code example found here](code-examples/lambda-cookbook/FilesWalkExample.java)


- **`lines()`**

Reads all the lines from a file as a `Stream`. Bytes from the file are decoded into characters using the UTF-8 charset

```java
    public static Stream<String> lines(Path path) throws IOException
```

The stream is lazily populated, which mean it doesn't read the whole file upfront. It reads the files as you consume the elements of the stream.


[Code example found here](code-examples/lambda-cookbook/FileLinesExample.java)

#### Use flatMap() methods in the Stream API

Returns a stream consisting of the results of applying the provided mapping function to each element 

```java
    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
```

```java
    List<String> names1 = Arrays.asList("John", "Joe");
    List<String> names2 = Arrays.asList("Dave");
    
    Stream<List<String>> allNames = Stream.of(names1, names2);
    
    allNames.flatMap(n -> n.stream()).forEach(System.out::println);
```

#### Develop code that creates a stream by using the Arrays.stream() and IntStream.range() methods


- **`IntStream.range`**

Retuns a sequential `IntStream` for the range of `int` elements. The `IntStream.range` **first parameter is inclusive** while the **second parameter is exclusive**


```java
    IntStream.range(1,3).forEach(System.out::println);
    //prints 1,2
```

- **`IntStream.rangeClosed`**

Same as `IntStream.range` except the **second paramter is inclusive**

----

### Method Enhancements

#### Add static methods to interfaces

Since Java 8, in addition to adding `default` methods to an interface, you can also add `static` methods. 

```java
    interface Doable {
        static void doIt(){
            System.out.println("Doing it right now");
        }
    }
``` 

An interface can declare `static` mthods, which are invoked without reference to a particular object

```java
    public class Task implements Doable{
        public static void main (String[] args){
            Doable.doIt(); ///compiles and runs ok
            
            Task.doIt() //fails to compile
            
            Doable d = new Task();
            d.doIt(); //also fails to complile
        }
    }
```


#### Define and use a default method of an interface and describe the inheritance rules for the default method

By adding the keyword `default` before the methods access modifier and adding implementation inside the interface, you do not have to provide implementation for the method in implementing classes


```java
    interface Doable{
        default public void doIt(){
            System.out.println("doing it);
        }
    }
    
    class Task implements Doable {
        //a valid class in java 8 
    }
    
```


With default methods, the JVM now needs to search interfaces for method implementations. The order of search is as follows

1. Check the class of the object for a method of the given name and signature
2. Else, recursively from bottom up, check the class' supertypes for a method with the given name and signature
3. Check the object's interfaces and their superinterfaces for a default method with the given name and signature
4. If no suitable method is found, throw a `NoSuchMethodError`


- **Default method and multiple inheritance ambiguity problems**

Since Java can implement multiple interfaces and each interface can define a default method with the same method signature, inherited methods can conflict with each other 


```java
    interface Shape {
        default public void move(){
            System.out.println("moving");
        }
    }
    
    interface Circle {
        default public void move(){
            System.out.println("rolling");
        }
    }
    
    
    class Ball implements Shape, Ball{
        //compilation fails with error:
        //class Ball inherits unrelated defaults for move() from
        //types Shape and Ball
    }
    
```

In order to work around situations like this we need to provide an implementation for the `move()` method in the class `Ball` to override the default method in both interfaces 


- **You cannot override a default method of an interface with a static method in a sub-interface or even in a class that implements that interface.** Although the reverse is possible. You can override a static method with a default method



----
### Use Java SE 8 Date/Time API

#### Create and manage date- and time-based events, including a combination of date and time in a single object, by using LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration

- **`Instant`**

`Instant` is essentially a numeric timestamp. It is a point in time counting from the first second of January 1, 1970

```java
    Instant now = Instant.now();
```

`Instant` is immutable and thread-safe

- **`LocalDate`**

a `LocalDate` represents a year-month-day and is useful for representing a date without a time. 

```java
    LocalDate currentDate = LocalDate.now();
```

- **`LocalTime`**

`LocalTime` stores time without a date

```java
    LocalTime currentTime = LocalTime.now();
```

- **`LocalDateTime`**

The class that handles both date and time, without a timezone. 

In addition to the `now()` method that every temporal-based class provides, the `LocalDateTime` class has various `of(...)` methods create an instant of `LocalDateTime`

```java
    LocalDateTime currentDateTime = LocalDateTime.now();
    
    LocalDateTime sept15th = LocalDateTime.of(2017, 9, 15, 10, 15);
    //2017-09-15 10:15
```

- **`Period`**

Defines an amount of time with date-based values (years, months, days).

It provides various `get` methods such as `getMonths`, `getDays` etc so that you can extract the amount of time form the period

```java
    LocalDate today = LocalDate.now();
    LocalDate xmas = LocalDate.of(2017, Month.DECEMBER, 25);
    Period p = Period.between(today, xmas);
    System.out.println(p.getMonths() +"months "+p.getDays()+" days");
```

- **`Duration`**

A `Duration` object is measured in seconds or nanoseconds and does not use date-based constructs such as years, months, and days.

```java
    Instant now = Instant.now();
    Thread.sleep(1000);
    
    Instant delay = Instant.now();
    long ns = Duration.between(now, delay).toNanos();
    System.out.println(ns);
```

#### Work with dates and times across time zones and manage changes resulting from daylight savings, including Format date and times values

In Java 8 formatting and parsing can be accomplished by using the `format()` and `parse()` methods


```java
    LocalDateTime datetime = LocalDateTime.now();
    
    String asBasicIsoDate = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
    
    Straing asCustomPattern = datetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
```

We can parse a String into a date, or time, or both

```java
    LocalDate fromIsoDate = LocalDate.parse("2017-05-21");
    
    LocalDate fromCustomPattern = LocalDate.parse("25.05.2017",     DateTimeFormatter.ofPatter("dd.MM.yyyy"));
```


**Time Zones**

The `LocalDate/LocalTime` classes do not contain information about time zones. If we want to work with a date/time in a certain zone we can use `ZonedDateTime` or `OffsetDateTime`

You can create a `ZoneId` object by using the `ZoneId.of(...)`.

```java
    ZoneId zone = ZoneId.of("GMT+3");
```

You can create a `ZonedDateTime` object in several ways. The first is to call the `now()` method od the `ZonedDateTime` class

```java
    ZonedDateTime zdtNow = ZonedDateTime.now();
```

Another way is to use the `of(...)` method which can create a `ZonedDateTime` object from a concrete date and time

```java
    ZoneId gmt = ZoneId.of("GMT+3");
    
    LocalDateTime ldt = LocalDateTime.now();
    
    ZonedDateTime zdtNow = ZonedDateTime.now();
    ZonedDateTime zdtGmt = ZonedDateTime.of(ldt, gmt);
```

#### Define, create, and manage date- and time-based events using Instant, Period, Duration, and TemporalUnit

- **`TemporalUnit`**

The `TemporalUnit` is an interface which defines a unit of date-time, such as Days or Hours

The most commonly used units are defined in `ChronoUnit` enumeration. This enum replaces integer values used in the old API to represent day, month, year, decade etc

```java
    LocalDate today = LocalDate.now();
    LocalDate twoWeeksLater = today.plus(2, ChronoUnit.WEEKS);
```


- toString methods of `Duration` and `Period`

`Duration` strings start with `PT` (because duration is "time based" i.e. hours/minutes/seconds)) and `Period` strings start with just `P` (because period does not include time. It contains only years, months, and days).


- `Duration` toString

The format of the returned string will be in PTnHnMnS, where n is the relevant hours, minutes or seconds part of the duration

If a section has a zero value, it is omitted. 

- `Period` toString

The format of the returned string will be in PnYnMnD, where n is the relevant years, months or days part of the duration

The output will be in the ISO-8601 period formt. A zero period will be represented as zero days, 'P0D'


----
### Bibliography 

- Education.oracle.com. (2017). Upgrade Java SE 7 to Java SE 8 OCP Programmer | Oracle Certification Exam. [online] Available at: [https://education.oracle.com](https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=5001&get_params=p_exam_id:1Z0-810) [Accessed 15 May 2017].


- Ganesh, S., Kiran, H. and Sharma, T. (2016). Oracle Certified Professional Java SE 8 programmer exam 1Z0-809. 1st ed.


- Zaikin, M. (2017). Exam 1Z0-810: Upgrade Java SE 7 to Java SE 8 OCP Programmer Study Guide. [online] Java.boot.by. Available at: http://java.boot.by/ocpjp8-upgrade-guide/index.html [Accessed 17 May 2017].


- Java2s.com. (2017). Java Lambda Introduction. [online] Available at: http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm [Accessed 19 May 2017].


- Docs.oracle.com. (2017). java.util.stream (Java Platform SE 8 ). [online] Available at: https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html [Accessed 22 May 2017].


- Codementor.io. (2017). Java 8 Method Reference: How to Use it | Codementor. [online] Available at: https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx [Accessed 3 Jun. 2017].