// Just a simple "Hello, world!" in Java

/* 'public' is the most permissive access modifier, i.e. this member (in this 
case, the HelloWorld class) can be accessed from anywhere in the program;
as in Python, a 'class' is a blueprint or template used to create instances
of that same class type, e.g. HelloWorld */
public class HelloWorld {
    /* 'public ... args)' is a method signature that serves as the entry point
    to your program; main is always public because it is where the program
    begins, and so it needs to be accessible by the program as a whole;
    'static' indicates that the method belongs to the class itself, rather
    than any instances thereof, which in turn means you can call the main
    method directly using the class name without needing to create an object;
    'void' is the return type of the main method, meaning that in this case
    the main method doesn't return any value; 'main' is the method name, the
    text inside the parentheses specifies the argument types, in this case
    'String[] args' means the program takes an array of strings, which can
    be provided at the command line but not in this case; 
    every Java program must have a 'main' method, similar to C */
    public static void main(String[] args) {
        /*  'System' is a predefined class in Java that provides functionalities
        for system interactions, e.g. input and output streams; 'out' is a
        static field (member variable) within the System class, it represents
        the standard output stream, i.e. the terminal or console; this line of
        code is often used for debugging purposes, but there are other, more
        advanced options as well */
        System.out.println("Hello, world!");
    }
}

// COMPILE STEP

// If you are using a bash terminal (like all the cool kids do), you can run

// javac hello_world.java

/* If the command executes successfully, a 'hello_world.class' file should be
   created, which just contains the bytecode instructions for running your
   program */

// You can now run your Java program with this command:

// java hello_world
