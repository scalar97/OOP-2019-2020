package ie.tudublin;

public class Animal
{
    // Field
    private String name;

    public Animal(String name){
        setName(name);
    }

    //Get Name Method to get name 
    public String getName()
    {
        return name;
    }

    // Accessors Method (Function) to allow other classes to access the private variables
    public void setName(String name)
    {
        //this is the self in python 
        this.name = name;
    }
    
    public void speak()
    {
        System.out.println("I can't speak!!");
    }


}