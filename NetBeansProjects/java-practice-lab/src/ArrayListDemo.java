/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author rashi
 */
// File Name : ArrayListDemo.java

import java.util.ArrayList;

public class ArrayListDemo
{

    public static void main(String[] args)
    {

        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>();


        // Adding elements
        list.add("Rashi");

        list.add("Rahul");

        list.add("Aman");


        // Printing list
        System.out.println("List : " + list);


        // Accessing element
        System.out.println("Element : " + list.get(1));


        // Updating element
        list.set(1,"Rohit");

        System.out.println("Updated List : " + list);


        // Removing element
        list.remove(2);

        System.out.println("After Remove : " + list);


        // Size of list
        System.out.println("Size : " + list.size());

    }

}
