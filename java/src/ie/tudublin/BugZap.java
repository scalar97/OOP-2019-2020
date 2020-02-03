package ie.tudublin;


import processing.core.PApplet;
import java.util.Random; 


public class BugZap extends PApplet
{
    public void settings()
    {
        size(900,900);
    }

    public void setup(){

    }

    public void draw()
    {

        background(255);
        drawPlayer(playerX, playerY, playerWidth);
        if ((frameCount % 60) == 0){
            
            drawBug(bugX,bugY,bugWidth);
        }
        
    }

    float playerX = 450;
    float playerY = 790; 
    float playerWidth = 50; 
    float bugX = 10;
    float bugY = 10;
    float bugWidth = 10;
    // create instance of Random class 
    Random rand = new Random();

    void drawPlayer(float x, float y, float w){

        float h = w/2;

        x = x + 20;

        w = w * 0.5f;

        stroke(51,204,255);

        fill(0,0,0);
        ellipse(x,y,w,h);

    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            if (playerX < 10){
                playerX = 10;
            }
            else{
                playerX = playerX - 6;
            }
    
		}
        
        if (keyCode == RIGHT)
		{
            if(playerX > 869){
                playerX = 869;
            }
            else{
                playerX = playerX + 6;
            }  
        }
        
		if (key == ' ')
		{
            //not working 
            fill(51,204,255);
            line(playerX, playerY, playerX, 0);
            
		}
	}

    void drawBug(float x, float y, float w){

        float h = w;

        x = rand.nextInt(900);

        y = rand.nextInt(900);

        stroke(0, 0, 0);

        fill(0,0,0);
        
        rect(x,y,w,h);

    }
}
