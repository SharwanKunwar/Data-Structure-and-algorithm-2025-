# Scope Demonstration in Java



## Code

```java
package Demo_Jpt_code;

// Author: Sharwan Jung Kunwar
// Purpose: To demonstrate how local and global variables work.

public class Scope {
    // Global variable (class-level variable)
    static int num;

    public static void main(String[] args) {
        // Assigning value to the global variable
        num = 60;
        System.out.println(num); // Prints 60 (global variable)

        // Local variable with the same name as the global variable
        int num = 22;
        System.out.println(num); // Prints 22 (local variable shadows global variable)

        // Calling the method
        method();

        // Still referring to the local variable in main()
        System.out.println(num); // Prints 22 (local variable in main)
    }

    public static void method() {
        System.out.println(num); // Prints 60 (global variable, as no local variable is defined yet)

        // Local variable with the same name as the global variable
        int num = 44;
        System.out.println(num); // Prints 44 (local variable inside method())
    }
}

```

# Scope Demonstration in Java


## Code Overview  

### 1. **Global Variable (`static int num`)**
- Declared at the **class level** and is accessible in all methods.
- Assigned `num = 60`, which affects the **global variable**.

### 2. **Local Variable (`int num = 22;` in `main()`)**
- Declared inside the `main()` method.
- **Shadows** the global variable, meaning `num` inside `main()` now refers to the local version.

### 3. **Calling `method()`**
- At the start of `method()`, `System.out.println(num);` prints the **global variable (`60`)**.
- A new **local variable (`int num = 44;`)** is declared inside `method()`, overriding the global one.
- The next `System.out.println(num);` prints `44`.

### 4. **Back to `main()`**
- The last `System.out.println(num);` in `main()` prints `22`, since the **local variable still exists**.

## Key Concept: **Variable Scope**
This program illustrates how **local variables override global ones** within a specific block of code, demonstrating **variable scope** in Java.
