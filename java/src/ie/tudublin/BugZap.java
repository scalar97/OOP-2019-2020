package ie.tudublin;


import processing.core.PApplet;
import java.util.Random; 


public class BugZap extends PApplet
{
    int score;

    float playerX = 450;
    float playerY = 790; 
    float playerWidth = 50; 
    float halfPlayerwidth = playerWidth/2;

    //delcaring bug attributes
    float bugX = 100;
    float bugY = 100;
    float bugWidth = 40;
    float halfBugWidth = bugWidth / 2;



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
    
        drawBug(bugX,bugY,bugWidth);

        moveBug();
        
        drawScore();
        
    }

    void drawPlayer(final float x, final float y, float w) {

        final float h = w / 2;

        w = w * 0.5f;

        stroke(51, 204, 255);

        fill(0, 0, 0);
        ellipse(x, y, w, h);

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
            fill(51,204,255);
            line(playerX, playerY, playerX, 0);
            
			if ((playerX-halfPlayerwidth) < bugX && playerX < (bugX-bugWidth))
            {
                resetBug();
                score++;

            }
		}
    }

    void test(int x) {
        x = 1000000;
    }

    void drawBug(final float x, final float y, final float w) {

        final float h = w;

        stroke(0, 0, 0);

        fill(0,0,0);
        
        rect(x,y,w,h);
        test(100);

    }

    void moveBug(){
        
        if (frameCount % 15 == 0){

            bugX = bugX + random(-5, 5);
        
            bugY = bugY + 1;

        }

    }


    void reset()
	{
		resetBug();
		playerX = width / 2;
		playerY = height - 50;
	}

    void resetBug()
	{
		bugX = random(halfBugWidth, width - halfBugWidth);
		bugY = 50;
    }
    
    void drawScore(){
        textSize(14);
        text("Score:"+ score, 750,50);
        fill(0,0,0);

    }

}