
import java.util.Vector;


public class DisplayFaceObject extends MyFrame
{
  public void run()
  {
	  Vector<Carcar> cars=new Vector<Carcar>();
	  cars.add(new Carcar(50,50,1,0));
	  cars.add(new Carcar(60,120,2,0));
	  cars.add(new Carcar(70,190,3,0));
	  cars.add(new Carcar(80,260,4,0));
	  cars.add(new Carcar(90,330,5,0));
	  
	  for(int i = 0; i < 30; i++)
	  {
		  clear();
		  for(int j = 0; j<cars.size();j++) 
		  {
			  cars.get(j).draw(this);
			  cars.get(j).move();
		  }
		  
		 sleep(0.1);
	  }
		 
		  
		  
	  
  }
}
