# Loops in Java

A **loop** in Java is a control structure that allows code to be executed repeatedly based on a condition. It helps in reducing code redundancy by executing a set of statements multiple times.

## Types of Loops in Java

- **for loop**: Executes a block of code for a fixed number of times.
- **while loop**: Executes a block of code while a condition remains true.
- **do-while loop**: Executes a block of code at least once, then continues while a condition remains true.
- **for-each loop**: Best for iterating over arrays or collections without using an index.

---

## Example 1: **for loop**
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Loop runs from 1 to 5
            System.out.println("Iteration: " + i);
        }
    }
}



Logic:

Initializes i = 1.
Runs the loop while i <= 5.
Increments i after each iteration.

Output:

Iteration: 1  
Iteration: 2  
Iteration: 3  
Iteration: 4  
Iteration: 5  


Example 2: while loop

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1; // Initialization
        while (i <= 5) { // Condition
            System.out.println("Iteration: " + i);
            i++; // Increment
        }
    }
}

Logic:

Starts with i = 1.
Executes loop while i <= 5.
Increments i in each iteration.




Example 3: do-while loop

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }
}


Logic:
Executes the loop at least once.
Then checks the condition.




Example 4: for-each loop

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array
        for (int num : numbers) { // Iterating through array elements
            System.out.println("Number: " + num);
        }
    }
}

Logic:

Loops through each element in the numbers array.
No need for an index or condition.