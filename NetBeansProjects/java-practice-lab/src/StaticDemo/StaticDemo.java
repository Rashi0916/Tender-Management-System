/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticDemo;

/**
 *
 * @author rashi
 */
// File Name : StaticDemo.java

// Static Keyword Example in Java

class Student
{

    // Non-static variables
    // Every object will have separate copy
    int roll;
    String name;

    // Static variable
    // Shared by all objects
    static String college = "MIT";


    // Non-static method
    void show()
    {

        // Printing student details
        System.out.println(roll + " " + name + " " + college);

    }

}

public class StaticDemo
{

    // Static block
    // Executes before main method
    static
    {
        System.out.println("Static Block Executed");
    }


    // Static method
    // Can be called without object
    static void display()
    {
        System.out.println("Static Method Called");
    }


    public static void main(String[] args)
    {

        // Calling static method
        // No object needed
        display();

        System.out.println();

        // Creating first object
        Student s1 = new Student();

        s1.roll = 1;
        s1.name = "Rashi";

        // Creating second object
        Student s2 = new Student();

        s2.roll = 2;
        s2.name = "Rahul";

        // Same college variable shared by all objects
        s1.show();

        s2.show();

    }

}