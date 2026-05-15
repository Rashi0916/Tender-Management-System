/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author rashi
 */

// Java Access Modifiers Example

public class Modifier
{

    // PRIVATE VARIABLE
    // Accessible only inside same class
    private int a = 10;

    // DEFAULT VARIABLE
    // Accessible inside same package
    int b = 20;

    // PROTECTED VARIABLE
    // Accessible inside same package and subclass
    protected int c = 30;

    // PUBLIC VARIABLE
    // Accessible everywhere
    public int d = 40;


    public static void main(String[] args)
    {

        // Object creation
        Modifier obj = new Modifier();

        // PRIVATE
        // Accessible because we are inside same class
        System.out.println("Private : " + obj.a);

        // DEFAULT
        System.out.println("Default : " + obj.b);

        // PROTECTED
        System.out.println("Protected : " + obj.c);

        // PUBLIC
        System.out.println("Public : " + obj.d);

    }

}
