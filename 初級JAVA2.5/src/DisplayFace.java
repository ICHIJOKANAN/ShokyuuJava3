
public class DisplayFace extends MyFrame
{
  public void run() 
  {
	  int x = 30;
	  int y = 40;
	  fillRect(x,y,20,10);
	  fillRect(x-5,y+8,32,10);
	  fillOval(x-1,y+17,10,10);
	  fillOval(x+12,y+17,10,10);
	  
	  
	  int x2 = 180;
	  int y2 = 120;
	  fillOval(x2,y2,50,100);
	  fillOval(x2+100,y2,50,100);
	  fillRect(x2,y2+160,150,10);
	  
  }
}
