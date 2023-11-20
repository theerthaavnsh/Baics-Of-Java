try, catch, throw and finally 
write a java program that shows theusage of the above with user input. 

write a java program to create your own exception.

quick sort
write a java program that implements quick sort algorithm for sorting a list of names in ascending order. 

binary search 
write a java program that implements the binary search algorithm. 

Hierarchical Inheritance
Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'print-Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherit the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'spe-cialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same.

Single Inheritance & Super Keyword
Write two Java classes Employee and Engineer. The Engineer class should inherit from the Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).
● display() only prints the name of the class and does not return any value. Ex. “ Name of the class is Employee.”
● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays
“Salary of an employee is 20000.”

Abstract Class and Polymorphism
Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides( ) that
shows the number of sides in the given geometrical structures.Allow user input.

Multiple inheritance using Interface
Create an interface ‘Sports’ which contain final variable ‘sportwt’ with value 6.0F and an abstract method
putwt().
Create a class ‘Student’ with a member variable ‘rollnumber’ and two member functions getNumber() &
putNumber() to read and display roll number respectively.
Create a subclass ‘Test’ from ‘Student’ class with its own member variables ‘term1’, ‘term2’ to hold each
term marks and member functions getMarks() & putMarks() to read and display marks obtained for each
terms.
Create a class ‘Results’ which derives the features of ‘Test’ class as well as ‘sports’ interface and displays the output in the given format.

Rollno:12
Marks obtained
Term 1=27.5
Term 2=33
Sports weightage=6
Total Score=66.5


VIVA QUESTIONS - 20/11 


1. What is the purpose of the try-catch block in Java?

   The try-catch block in Java is used for handling exceptions. The code that might throw an exception is placed within the try block. If an exception occurs during the execution of the try block, the corresponding catch block catches and handles the exception, preventing the program from crashing. This enables graceful error handling and allows developers to manage exceptional situations in their code.

2. Differentiate between checked and unchecked exceptions. Give examples.

   - Checked Exceptions: Checked exceptions are exceptions that the compiler checks at compile-time. These exceptions must either be caught using a try-catch block or declared using the `throws` keyword in the method signature. Examples include `IOException`, `SQLException`, and `ClassNotFoundException`.

   - Unchecked Exceptions: Unchecked exceptions, also known as runtime exceptions, are not checked by the compiler at compile-time. These exceptions usually occur due to programming errors, and it's not mandatory to handle or declare them. Examples include `NullPointerException`, `ArrayIndexOutOfBoundsException`, and `ArithmeticException`.

3. Explain the difference between throw and throws keywords in Java.

   - throw: The `throw` keyword is used to explicitly throw an exception within a method or block of code. It is used when a specific condition arises, and the programmer wants to terminate the current execution flow by raising an exception manually.

   - throws: The `throws` keyword is used in a method signature to declare that the method might throw certain exceptions. It indicates that the method does not handle the exceptions itself but delegates the responsibility to the calling method or the caller.

4. What is the role of the finally block in exception handling?

   The `finally` block in exception handling is used to execute code that needs to be run regardless of whether an exception occurs or not. It provides a way to perform cleanup tasks, such as closing resources (like files or database connections), regardless of whether an exception is caught or not. The `finally` block executes after the try-catch block finishes, including after any potential exceptions or successful execution.

5. How do you handle exceptions that may be thrown by a method?

   Exceptions that may be thrown by a method can be handled using a try-catch block. The method call that might throw an exception is placed inside the try block, and the catch block catches the thrown exception, allowing the program to handle it gracefully.

6. Explain the concept of the multi-catch block in Java.

   The multi-catch block in Java allows catching multiple exceptions in a single catch block. It reduces code duplication when the same handling logic is required for different types of exceptions. Multiple exceptions are specified using a vertical bar (|) between exception types in the catch block.

7. What happens if an exception is thrown from within the catch block itself?

   If an exception is thrown from within a catch block, it can be caught and handled by an enclosing try-catch block, or it may propagate up the call stack if not caught within the catch block. It's essential to handle exceptions that occur within catch blocks to prevent unexpected behavior and ensure proper error handling.

8. Can you have a try block without a catch block? If yes, explain.

   Yes, a try block can exist without a catch block, but it must be followed by either a catch block or a finally block. It's possible to have a try-finally block without a catch block. This scenario is used when the programmer wants to execute code that needs cleanup or finalization regardless of whether an exception occurs or not.

9. What is the purpose of the throws clause in Java?

   The `throws` clause in Java is used in a method signature to declare that the method might throw certain exceptions during its execution. It specifies the types of exceptions that a method might propagate to its caller method. It allows the calling method to handle or propagate the declared exceptions further up the call stack.

10. How does Java's exception handling mechanism differ from traditional error handling in programming languages?

   Java's exception handling mechanism provides a structured way to handle errors and exceptional conditions during program execution. Unlike traditional error handling, which might involve using error codes or other mechanisms to handle errors, Java's exception handling separates error detection and handling logic. It provides a cleaner and more organized approach to deal with exceptional situations, promoting better code readability and maintainability.

This set of questions and explanations covers the fundamental concepts of exception handling in Java and its various aspects.
