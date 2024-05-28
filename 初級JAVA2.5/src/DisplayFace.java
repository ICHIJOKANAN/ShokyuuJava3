
public class DisplayFace extends MyFrame
{
  public void run() 
  {
	  
	 
	  int x = 30;
	  int y = 40;
	  
	  Car car1 = new car(30,40);
	 
	  
	  
	  int x2 = 330;
	  int y2 = 140;
	  fillRect(x2,y2,20,10);
	  fillRect(x2-5,y2+8,32,10);
	  fillOval(x2-1,y2+17,10,10);
	  fillOval(x2+12,y2+17,10,10);
	  
	  for (int i= 0; i < 30; i++)
	  {
		  clear();
		  
		  face1.draw(this);
		  tree1.draw(this);
		  
		  face1.move();
		  tree1.move();
		  sleep(0.5);
	  }
	  
	  
  }
}
