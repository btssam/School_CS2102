package wpioo.lecture00; // package - a namespace for this code

// this is a comment.

/* this is also a comment
 * that spans multiple lines
 */

// public - access modifier - public means "all code in any package can use"
//          other modifiers are: (blank), protected, and private
// class  - a primary unit to *define* code (data + functions)
public class Main { // { ... } denotes a body of code (scope)

    // public - access modifier
    // static - that only one instance of this code is shared for the entire program
    //          the Java Virtual Machine (JVM) calls it analogous to: Main.main(...)
    // void - this function does not return a value
    // main - the name of this function
    // (String[] args) - the parameter is an array of strings.
    //                   We aren't using it right now, but it is a way to pass parameters
    //                   To our program via the command line / terminal
    public static void main(String[] args) {
        // local variables
        int oldCourse = 1101;
        int newCourse = 2102;
        String dept = "CS";

        // String formatting
        //   %s is replaced with a string value
        //   %d is replaced with an integer like value
        //   %f is replaced with a decimal number
        //   https://www.geeksforgeeks.org/java/java-string-format-method-with-examples/
        String farewell = String.format("Goodbye, %s%d", dept, oldCourse);

        // output / print-style IO
        System.out.println(farewell);
        System.out.printf("Hello, %s%d students!\n", "CS", newCourse);
    }
}