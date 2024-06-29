# Java Multithreading and Exception Handling

This repository contains various Java programs demonstrating multithreading and exception handling concepts. These programs include examples of creating threads using both the `Thread` class and the `Runnable` interface, handling thread priorities, and implementing custom exceptions. The code also illustrates the use of essential thread methods and the `finally` block.

## Table of Contents

- [Introduction](#introduction)
- [Multithreading](#multithreading)
  - [Extending the Thread Class](#extending-the-thread-class)
  - [Implementing the Runnable Interface](#implementing-the-runnable-interface)
  - [Using Constructors in Threads](#using-constructors-in-threads)
  - [Thread Priorities](#thread-priorities)
  - [Common Thread Methods](#common-thread-methods)
- [Exception Handling](#exception-handling)
  - [Custom Exceptions](#custom-exceptions)
  - [Throw and Throws Keywords](#throw-and-throws-keywords)
  - [Practise Exception](#practise-exception)
  - [Finally Block](#finally-block)
  - [Calculator Exception Handling](#calculator-exception-handling)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository demonstrates core Java concepts related to multithreading and exception handling through practical examples. Each program focuses on a specific aspect of these topics, providing a comprehensive understanding of their usage and implementation.

## Multithreading

### Extending the Thread Class

Illustrates how to create threads by extending the `Thread` class and overriding the `run` method.

### Implementing the Runnable Interface

Shows how to create threads by implementing the `Runnable` interface, which involves defining the `run` method within a class that implements this interface.

### Using Constructors in Threads

Demonstrates how to use constructors in threads to pass thread names or other parameters.

### Thread Priorities

Explains how to set thread priorities using the `setPriority` method and the effect of different priority levels on thread execution.

### Common Thread Methods

Covers essential thread methods like `start()`, `join()`, and `sleep()`, explaining their usage and behavior in thread management.

## Exception Handling

### Custom Exceptions

Shows how to create custom exception classes by extending the `Exception` class and overriding its methods like `toString` and `getMessage`.

### Throw and Throws Keywords

Explains the use of the `throw` keyword to explicitly throw an exception and the `throws` keyword to declare that a method can throw specific exceptions.

### Practise Exception

Simulates the process of retrieving elements from an array using user-specified indices, handling invalid indices, and limiting the number of retrieval attempts.

### Finally Block

Demonstrates the use of the `finally` block to execute crucial code regardless of whether an exception occurs or not, such as resource cleanup.

### Calculator Exception Handling

Implements a calculator that performs basic arithmetic operations and handles various custom exceptions like invalid input, division by zero, and exceeding maximum input limits.

## How to Run

To run the programs, compile the Java files using `javac` and execute them using the `java` command. Ensure that the Java Development Kit (JDK) is installed on your system.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request for any enhancements or bug fixes.
