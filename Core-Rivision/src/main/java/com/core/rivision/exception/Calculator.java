package com.core.rivision.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    //exception means an event that occurs during the execution of a program that disrupts the normal flow of instructions
    //abnormal termination of the program
    //exceptions can be handled programmatically
    //2 types of exceptions checked and unchecked
    //checked exceptions are checked at compile time
    //unchecked exceptions are checked at runtime
    //throw keyword is used to throw an exception explicitly
    //throws is used to duck the responsibility of handling the exception to the caller method

    //error means a serious problem that a reasonable application should not try to catch
    //errors cannot be handled programmatically

    //handling exceptions using try-catch-finally  block
    //try block is used to enclose the code that may throw an exception
    //catch block is used to handle the exception
    //finally block is used to execute the code that must be executed regardless of whether an exception occurred or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
