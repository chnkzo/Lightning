int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;

void setup()
{
  size(400,400);
  strokeWeight(8);
  stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
  noLoop();
}

void draw()
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

 void mousePressed()
{
  redraw();
  stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
 startX = (int)(Math.random()*400);
 startY = 0;
 endX = 150;
 endY = 0;
 }

