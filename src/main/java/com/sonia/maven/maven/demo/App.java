package com.sonia.maven.maven.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Appli ob=new Appli();
        System.out.println("ob sample: " + ob.sample());
        
        Appli2 ob1 =new Appli2();
        System.out.println(ob1.demo());
        
        Appli3 ob2 =new Appli3();
        System.out.println(ob2.data());
    }
}
