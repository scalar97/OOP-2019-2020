package ie.tudublin;

public class Main
{

  
    public static void main(String[] arg)
    {
        
        System.out.println("Hello world!");

        /* What is polymorpism?
            The type is of a Superclass, the instance is a subclass*/

        // This is not polymorphism    
        Cat topcat = new Cat("Topcat");

        //This polymorphism the type is of super class Animal & Instance is of subclass Cat
        Animal mino = new Cat("Mino");

        //virtual method also know as dynamic binding 
        //this prints out the cat method speak meow not the Animal Method
        mino.speak();

        /* This wont compile 
         System.out.println(mino.getNumLives());*/

        //This will as we are now casting 
        System.out.println((((Cat)mino).getNumLives()));

        //This will compile
        mino = new Dog("Misty");

        Animal a = new Cat("a");
        Animal b  = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        a = b;
        
        a.setName("c");

        System.out.println(a);
        System.out.println(b);


    }
}