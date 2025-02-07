# Java Methods

## What is a Method in Java?
A **method** in Java is a block of code that performs a specific task and is executed when it is called. Methods help in **code reusability**, **modularity**, and **organization**.

## Types of Methods in Java
1. **Predefined Methods (Built-in Methods)**
    - Already defined in Java libraries (e.g., System.out.println(), Math.sqrt()).

2. **User-Defined Methods**
    - Created by programmers to perform specific operations.

## Syntax of a Method
java
returnType methodName(parameters) {
// method body
return value;  // (if returnType is not void)
}

- **returnType** – Data type of the value returned (use void if no value is returned).
- **methodName** – Name of the method (follows camelCase convention).
- **parameters** – Input values (optional).
- **method body** – Block of code executed when the method is called.

## Example of a User-Defined Method
java
public class Main {
// Method without parameters
static void greet() {
System.out.println("Hello, welcome to Java!");
}

    // Method with parameters and return type
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();  // Calling the greet() method

        int sum = add(5, 10);  // Calling the add() method
        System.out.println("Sum: " + sum);
    }
}

### Output:
Hello, welcome to Java!
Sum: 15


## Method Overloading
Multiple methods with the same name but different parameters (number, type, or order).

java
class OverloadExample {
static int multiply(int a, int b) {
return a * b;
}

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));    // Calls int version
        System.out.println(multiply(2.5, 3.5)); // Calls double version
    }
}

### Output:
12
8.75


## Method Overriding
A subclass provides a specific implementation of a method that is already defined in its parent class.

java
class Animal {
void makeSound() {
System.out.println("Animal makes a sound");
}
}

class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Dog barks");
}
}

public class Main {
public static void main(String[] args) {
Animal myDog = new Dog();
myDog.makeSound(); // Calls overridden method
}
}

### Output:
Dog barks


## Key Points
- Methods help in **code reusability**.
- static methods belong to the **class** and can be called without creating an object.
- returnType defines what the method returns (void for no return).
- **Method Overloading** allows multiple methods with the same name but different parameters.
- **Method Overriding** allows a subclass to provide a specific implementation of a parent class method.

---
✅ **Happy Coding!** 🚀