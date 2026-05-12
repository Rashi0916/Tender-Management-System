/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rashi
 */
class Demo
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}

class Poly
{
    public static void main(String[] args)
    {
        Demo d = new Demo();

        d.add(10,20);

        d.add(10,20,30);
    }
}
