package switchcase;

import java.util.Scanner;

public class Switchcase{

     public static void main(String []args){
         int choice;
        System.out.println("Pick one: \t 1. C Programming \t 2. Java Programming \t 3. Python Programming \t");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system. By design, C provides constructs that map efficiently to typical machine instructions");
            break;
            case 2 : System.out.println("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
            break;
            case 3 : System.out.println("Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation.");
            break; 
            default : System.out.println("Invalid choice.");
            
        }
     }
}
