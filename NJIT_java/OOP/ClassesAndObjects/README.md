# Classes And Objects

## Class 🍸
Class methods can be overloaded. What this means is that we can have class functions with the <b>same</b> name but with different parameters. We could call method overloading <b>static (or compile time) polymorphism</b> because the overloaded methods to be invoked is decided at compile time, based on the actual number of arguments and the compile time types of the arguments. Think of ``` String.valueOf() ``` inside the standard library is probably a ton of methods with the name of "valueof()" that is set to take in account of all the possible types to check. <br><br>

We can also override methods (a.k.a dynamic[or runtime] polymorphism). We basically just overwrite the method body provided by the parent class. Heres an example in code.

```java

// Here is a simple class using an abstract method to return area
public abstract class Shape {
    public abstract Double area() {
        return 0.0;
    }
}

public class Circle extends Shape {
    private Double radius = 5.0;

    // This annotation (@Override) is telling us that this method 
    //is referencing the parent class, Shape, and that we are 
    // to override this method with a brand new implementation here
    @Override public Double area() {
        return 3.14 * radius * radius;
    }
}
```

## Constructors 🦺
These are methods that help initialize our class instances. The difference between these and methods are:
<ul>
    <li>Constructors can only take these modifiers: public, private, protected. Abstract, final, and static <b>CANNOT</b> be used.</li>
    <li>Constructors don't have a return type.</li>
    <li>Constructors must have the same name as the class name</li>
    <li>We have access to a, "this." keyword which lets use the current instance of the class along with its methods.</li>
</ul>

Constructors can also be called using ``` super() ``` which inherits from the parent class constructor. Heres an example in code:

```java 
public class Hello {
    // constructor
    public Hello(String wordToPrint) {
        printHello(wordToPrint); 
    }
    public void printHello(String word) {
        System.out.println(word);
    }
}

public class personalHello extends Hello {
    public personalHello() {
        super();
    }
    // add more methods
}

// initialize class AND/OR methods
```




