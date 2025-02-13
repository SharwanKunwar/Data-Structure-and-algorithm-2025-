## Code

```java
package Methods;

// Author: Sharwan Jung Kunwar
// Purpose: Swap two variables by taking user input and swapping their values without using a third variable.

import java.util.Scanner;

public class Swap_variable {
    // Declaring static variables a and b
    static int a, b;

    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        
        // Taking input for variable 'a'
        System.out.print("Enter your a : ");
        a = scan.nextInt();
        
        // Taking input for variable 'b'
        System.out.print("Enter your b : ");
        b = scan.nextInt();

        // Displaying values before swapping
        System.out.println("Value of a : " + a + " Value of b : " + b + " before swap");

        // Performing the swap using the real_swap method
        real_swap();

        // Displaying values after swapping
        System.out.println("Value of a : " + a + " Value of b : " + b + " after swap");
    }

    // This method is unused; it does not work due to Java's pass-by-value mechanism.
    public static void swap(int x, int y) {
        a = y;
        b = x;
    }

    // Correct method for swapping values without using a third variable
    public static void real_swap() {
        a = a + b; // Step 1: Sum a and b
        b = a - b; // Step 2: Subtract the new a value by b, getting the original a value in b
        a = a - b; // Step 3: Subtract the new b value from a, getting the original b value in a
    }
}

```
# Swap Variables Without Using a Third Variable

## **How It Works**
1. The user enters two integers (`a` and `b`).
2. The program prints their values before swapping.
3. The `real_swap()` method swaps the values using the following arithmetic logic:
    - `a = a + b;`  → Sum the two numbers.
    - `b = a - b;`  → Extract the original value of `a` into `b`.
    - `a = a - b;`  → Extract the original value of `b` into `a`.
4. The program prints the swapped values.

## **Methods Used**
### `real_swap()`
- Swaps `a` and `b` without using a third variable.
- Uses arithmetic operations to perform the swap.

### `swap(int x, int y)`
- **Unused method** in this program.
- It was meant to swap values using parameters, but Java **passes primitive data types by value**, making it ineffective.

## **Example Execution**
**Input:**
<br>

**a=2, b=4 before swap**
<br>

**a=4, b=2 after swap**