package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//float[] rainFall = new float[12];
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan","Feb", "Mars", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};



	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=0; i < rainFall.length; i++){
			println(months[i]+ "\t" +rainFall[i]);
		

			if(rainFall[i]>rainFall[maxIndex]){
				maxIndex = i;
			}

			if (rainFall[i]<rainFall[minIndex]){
				minIndex = i;
			}
		}

		for (float f:rainFall){
			println(f);
		}
		for (String s:months)
		{
			println(s);
		}

		println("Max Rain Fall was in: "+months[maxIndex]+". It was:"+rainFall[maxIndex]+"mm..");
		println("Min Rain Fall was in: "+months[minIndex]+". It was:"+rainFall[minIndex]+"mm..");
		
	}


	float offset = 0;

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		drawBarChart();
	}

	void drawBarChart(){
		float w = width / rainFall.length;
		float cGap = 255/rainFall.length;

		colorMode(HSB);
		for(int i= 0; i< rainFall.length; i++)
		{
			float x = i *w;
			fill (i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	void test(){

	}
	
}
