/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rashi
 */
class Student{
    String name;
    int age;
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println(name + "   " + age);
    }
}
class Main {
    public static void main(String[] agrs){
      Student s1= new Student("rashi",+ 64);
      s1.show();
    }
    
}
