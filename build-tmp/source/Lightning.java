import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;

public void setup()
{
  size(400,400);
  strokeWeight(8);
  stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
  noLoop();
}

public void draw()
{
	 background(0);
	while(endY < 400)
	{
    endY = startY + (int)(Math.random()*9);
    endX = startX + (int)(Math.random()*9)-4;
    line(startX,startY,endX,endY);
    startX = endX;
  	startY = endY;
  }
}

 public void mousePressed()
{
  redraw();
  stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
 startX = (int)(Math.random()*400);
 startY = 0;
 endX = 150;
 endY = 0;
 }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
