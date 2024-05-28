
public class DisplayFaceObject extends MyFrame
{
  public void run()
  {
	  Face face1=new Face(50,50,10,5);
	  Face face3 = new Face(200,100,-10,5);
	
	  for (int i= 0; i < 30; i++)
	  {
		  clear();
		  
		  face1.draw(this);
		  face3.draw(this);
		  
		  face1.move();
		  face3.move();
		  sleep(0.5);
	  }
  }
}
