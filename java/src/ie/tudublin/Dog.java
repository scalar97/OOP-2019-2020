package ie.tudublin;

public class Dog extends Animal

{
    
    public Dog(String name){

        //Constructer chainging
        super(name);


    }

    public void speak()
    {
        System.out.println("Woof!");
    }
}