# Java OOP Concepts & Interview Preparation
![alt text](image.png)
This repository is a practical Java learning collection focused on Object-Oriented Programming, Java fundamentals, and interview-driven concepts. Each example is kept simple and easy to understand so it can be used both for learning and for technical interview preparation.

## What this repository covers

- Java basics and syntax
- OOP principles
- data types, variables, operators, and control flow
- classes, objects, methods, and constructors
- encapsulation, inheritance, polymorphism, and abstraction
- interfaces and packages
- exception handling
- collections and multithreading
- modern Java features

## Project structure

- [exampleOfJAVA](exampleOfJAVA) - Java examples and exercises
- [exampleOfJAVA/01_What_Is_Java](exampleOfJAVA/01_What_Is_Java) - Java overview and platform basics
- [exampleOfJAVA/02_Java_Architecture](exampleOfJAVA/02_Java_Architecture) - JVM, JDK, JRE, and Java execution model
- [exampleOfJAVA/03_Basic_Program](exampleOfJAVA/03_Basic_Program) - basic Java program structure
- [exampleOfJAVA/04_Data_Types](exampleOfJAVA/04_Data_Types) - primitive and reference types
- [exampleOfJAVA/05_Variables](exampleOfJAVA/05_Variables) - variable declaration and usage
- [exampleOfJAVA/06_Operators](exampleOfJAVA/06_Operators) - arithmetic, logical, and comparison operators
- [exampleOfJAVA/07_Control_Statements](exampleOfJAVA/07_Control_Statements) - decision and loop statements
- [exampleOfJAVA/08_Arrays](exampleOfJAVA/08_Arrays) - arrays and iteration
- [exampleOfJAVA/09_String](exampleOfJAVA/09_String) - string processing
- [exampleOfJAVA/10_Methods](exampleOfJAVA/10_Methods) - methods and reusable logic
- [exampleOfJAVA/11_Constructors](exampleOfJAVA/11_Constructors) - object initialization
- [exampleOfJAVA/12_This_Keyword](exampleOfJAVA/12_This_Keyword) - current instance reference
- [exampleOfJAVA/13_OOP_Concepts](exampleOfJAVA/13_OOP_Concepts) - OOP principles overview
- [exampleOfJAVA/14_Class_and_Object](exampleOfJAVA/14_Class_and_Object) - class and object examples
- [exampleOfJAVA/15_Encapsulation](exampleOfJAVA/15_Encapsulation) - data hiding and validation
- [exampleOfJAVA/16_Inheritance](exampleOfJAVA/16_Inheritance) - extending classes
- [exampleOfJAVA/17_Polymorphism](exampleOfJAVA/17_Polymorphism) - method overriding and overloading
- [exampleOfJAVA/18_Abstraction](exampleOfJAVA/18_Abstraction) - abstract classes and interfaces
- [exampleOfJAVA/19_Interfaces](exampleOfJAVA/19_Interfaces) - contract-based design
- [exampleOfJAVA/20_Key_Packages_APIs](exampleOfJAVA/20_Key_Packages_APIs) - Java packages and APIs
- [exampleOfJAVA/21_Exception_Handling](exampleOfJAVA/21_Exception_Handling) - try/catch/finally and exception flow
- [exampleOfJAVA/22_Collections_Framework](exampleOfJAVA/22_Collections_Framework) - list, set, map, queue concepts
- [exampleOfJAVA/23_Multithreading](exampleOfJAVA/23_Multithreading) - threads and concurrency
- [exampleOfJAVA/24_Java_Features_Latest](exampleOfJAVA/24_Java_Features_Latest) - modern Java improvements

## Run a program

```bash
javac <ClassName>.java
java <ClassName>
```

Example:

```bash
cd exampleOfJAVA/14_Class_and_Object
javac ClassAndObject.java
java ClassAndObject
```

## Interview-focused topics to master

### Core Java
- Difference between JDK, JRE, and JVM
- Primitive vs reference data types
- String immutability and StringBuilder/StringBuffer
- Static keyword and final keyword
- Method overloading vs overriding

### OOP concepts
- Encapsulation: hiding implementation details
- Inheritance: reusing behavior
- Polymorphism: same method acting differently
- Abstraction: showing only essential features
- Association, aggregation, and composition

### Java interview examples
- Why is Java platform independent?
- What is the difference between abstract class and interface?
- Why is multiple inheritance not supported directly in classes?
- What is the use of `this` keyword?
- Why is `main` method static?
- What happens when an exception occurs in Java?

## Common interview questions

### 1. What is Java?
Java is a high-level, object-oriented, platform-independent programming language that runs on the Java Virtual Machine (JVM).

### 2. What is OOP?
OOP is a programming style where code is organized around objects and classes to improve reusability, maintainability, and flexibility.

### 3. What is the difference between abstraction and encapsulation?
- Abstraction hides implementation details and shows only necessary behavior.
- Encapsulation wraps data and methods into a class and restricts direct access.

### 4. Why is Java called platform independent?
Because Java source code is compiled into bytecode, and JVM interprets that bytecode on different platforms.

### 5. What is the difference between method overloading and overriding?
- Overloading: same method name, different parameters in the same class.
- Overriding: same method signature in child class, changing behavior.

### 6. What is an interface?
An interface is a contract that defines method signatures, and classes implement the interface to provide behavior.

### 7. What is exception handling?
Exception handling is a mechanism used to handle runtime errors gracefully using `try`, `catch`, `finally`, and `throw`.

## Quick interview answer format

When answering in an interview, use this template:

1. Define the concept clearly.
2. Explain its purpose.
3. Give an example from the repository.
4. Mention real-world usage.

Example:

> Encapsulation is the process of binding data and methods into a single unit and restricting direct access. In Java, it is implemented through access modifiers like private, public, and getter/setter methods. This helps protect data and improve maintainability.

## Purpose

This project is intended for hands-on Java practice, OOP learning, and interview preparation. It is especially helpful for students and beginners preparing for Java developer interviews or technical discussions.
