package ie.tudublin;

public class Cat extends Animal
{

    public Cat(String name){

        //Constructer chainging
        super(name);

        


    }
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }
}