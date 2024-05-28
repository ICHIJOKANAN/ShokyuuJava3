
public class Face 
{
  int x,y;
  public Face(int x,int y)
  {
	  this.x=x;
	  this.y=y;
	 
  }
  public void draw(MyFrame frame)
  {
	  fillRect(x,y,20,10);
	  fillRect(x-5,y+8,32,10);
	  fillOval(x-1,y+17,10,10);
	  fillOval(x+12,y+17,10,10);
	
  }
  public void move() 
  {
	  x+=vx;
	  y+=vy;
  }
  
}
