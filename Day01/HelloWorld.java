// What is the difference between C++ and Java??
// Both C++ and Java are OOP languages but Java is a class based Object Oriented Programming language:
// In java you can't work without creating a class at all.
// A file can have only one public class. But it is to keep in mind that a file can have multiple classes. The name of the public class should match the file name exactly.

// What are Functions?
// Functions: A block of code that does something. In java we know functions by another name as well, whenever we create a function within a class it is called a method. 


// Every Java program just like C++ ones also has a staring point which is the main function or method.
// In java the main method is special, which means the signature of the main method should be exactly how it is meant to be. 

// Whenever we declare a method as a static method, it simply means that we can call this method without creating an instance of the class.

// Here I have simply created an instance of Integer type. Whenever we create an object of a class that particular object is called as an instance of that class.

// The starting point of every program in java is a main method.

// Is C++ Compiled Language or Interpreted Language:
// Whenever we try to execute a C++ program the compiler reads the entire source code in one go, and if there's any sort of error the compiler stops the execution and throws the error. 

// Java is both an compiled and interpreted langauge. 
// What is the process of executing/running a Java Program?
// Firstly we compile the source code using the javac (java compiler) then the java compiler outputs a bytecode with an extension of .class. Afterwards we are required to pass that bytecode to the java launcher, the java launcher is an interpreter which will read the bytecode line by line and execute it.


// Object Oriented Programming with Java:
// Four Pillars of Object Oriented Programming: 
// 1. Encapsulation
// 2. Abstraction
// 3. Polymorphism
// 4. Inheritence



// Java is a verbose language.
// Downside of java being a verbose language: You gotta write a lot of code to do simple tasks.
// Positive side being anyone can understand code written by other people. In other words code written in java is said to be self explanatory or expressive.

// History of Java: 
// JAVA was created by Sun Microsystems. A guy named James Gosling led the team, later on Sun was acquired by Oracle and now they maintain and release newer versions. Java was created with an intention of programming TVs, but later on people noticed that Java has much more potential. 

// What is java named after?
// Java is named after the Java Islands of Indonesia which is famous for it's Coffee.

// Java wasn't named such from the very early days of it's creation. Java was initially called as GreenTalk because the name of the team that created java was called GreenTeam, and it used to have an extension of .gt later on it got named as Oak, after Oak trees. One fine day James Gosling was having Cofee in his office when he came up with the name Java and that stayed.

// When was Java Created?
// Java was created on 1995.


// Data Types: 
// 1. Primitive Data Type
    // byte (It lets you store a very small number that has very less memory allocated to it.) Range: -127 to 127;
    // short 
    // int (It lets you store integers)
    // long
    // float
    // double
    // char (Anything stored within single quotes is a character)
    // boolean ()

// 2. Non-Primitive/Reference Type
    // String (a sequence of characters is called a String)
    // Arrays

    // Integer (Wrapper Class)
    // Float   (Wrapper Class)


// The String[] args is an array of string type which we pass as an argument or parameter of the main method in java. This array helps us pass parameters to the main method directly from the command line.




// Class is a Template using which we can create many objects

class Student{
    public int rollNum; 
    public String name;
    public char section;
    public float marks;
    public boolean isRegistered;


    @Override
    public String toString() {
        return "Student [rollNum=" + rollNum + ", name=" + name + ", section=" + section + ", marks=" + marks
                + ", isRegistered=" + isRegistered + "]";
    } 
    
};



public class HelloWorld {
    public static void main(String[] Khushi){
        
        Student st1 = new Student(); 

        st1.name = "Khushi Dubey"; 
        st1.rollNum = 12345;
        st1.section = 'F'; 
        st1.marks = 100;
        st1.isRegistered = true;

        System.out.println(st1);

    }
}




 

// What is a Computer? 
// A computer is made up of two main components: 
// 1. What you can see and touch (HardWare)
// 2. Somestuff that you can't see or touch (Software)



// Types of Software: 
// 1. System Software: 
//  i. Operating System: An Operating System is a collection of programs and software that communicates with the hardware directly and provides an interface for the user to interact with and it also provides a platform for other software and programs to be able to communicate with the hardware in order to get things done. 

    // What are the parts of an operating system: 
    // An OS can be divided into the followings: 
    // Kernel --> It is the closest to the hardware and it is the core of any operating system. 
    // Shell --> A shell lets the user send commands to the kernel which intern can help us with whatever we want the hardware to do.


// Architecture: Type of Computer
// Broadly there are two types of architecture: 
// 1. CISC: Complex Instruction Set Computer  
// 2. RISC: Reduced Instruction Set Computer: e.g. ARM

// x86 --> This is old and it supports 32 Bit OS (In such machines the OS can only access only 4GB or RAM).
// x86_64 --> This is new architecture that supports 64 Bit OS.

// ARM 
// MacBooks ---> M1, M2, M3 these chips are arm based which means that they fall under RISC architecture. 

//  ii. Language Processors: Compilers, Interpreters, Assemblers.
//  iii. Device Drivers: Keyboard Driver, Mouse Driver
        // A driver is special software program which helps a computer understand more about a particular device.
//  iv. System Utilities: Disk Partitioning, Disk Managing Software, Anit-virus    

// 2. Application Software
//    i. General Purpose Application Software
//    Software that are readily available for everyone to use for general purposes. MS Office, Media Player, VLC, VS Code. 

//    ii. Specific Purpose Application Software: SBI Software, TIU's  Software, etc.  