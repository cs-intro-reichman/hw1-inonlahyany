// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class Demo0 {
    public static void main(String[] args) {
        // Declares an integer variable and sets it to 0
        int i = 0;
        while (i < 6) {
            // Prints i, and increments it
            System.out.println(i);
            i = i + 1;
            }
            System.out.println("Done");
        }
}

// 1 - Compile-time Error: Name of public class must match the name of .java file in which it is placed
// 2 - No error
// 3 - Compile-time Error: Syntax issue, unclosed string literal.
// 4 - Compile-time Error: identifier is not found, since it doesn't have brackets, compiler thinks it's a variable, and because this variable wasn't declared it throws this error
// 5 - Runtime Error: In the Java programming language, every application must contain a main method whose signature is: "public static void main(String[] args)"
// 6 - Compile-time Error: we are trying to call a method of the PrintStream object that doesn't exist
// 7 - Compile-time Error: identifier is not found, since we are trying to call a function/method that doesn't exist (we are not referring to the class "System")
// 8 - Compile-time Error: Syntax issue.
// 9 - Compile-time Error: Syntax issue, because we didn't close the method, so the compiler tried to continue parsing and encounters an unexpected end.
// 10 - Logical Error: since *1 always equals the same number, in our example 0, we will loop forever.