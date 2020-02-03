package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet /*PApplet is a supper class that HelloProcessing of HP*/
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	public void draw()
	{	
		background(255,0,0);
		/*example shapes
		
		outline for shapes
		stroke(0,0,255);
		
		line(10, 10, 100, 100); // x1, y1, x2 ,y2

		point(50,50); //x, y

		rect(70, 150, 90, 10); //tlx, tly, w, h

		*/

		noStroke();
		
		fill(255,204,0);
		circle(250, 290, 390);

		fill(0,0,255); 
		triangle(250, 50, 50, 450, 450, 450); //requires cordinates for each point of a triangle

		fill(102,102,102);
		ellipse(250, 250, 170, 100); // center point cx, cy, w,h width & height

		fill(0,0,0);
		circle(mouseX, mouseY, 50);


		/*
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
		*/
	}
}
