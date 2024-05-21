
public class RectIf extends MyFrame
{
  public void run () 
  {
	  int x = 30;
	  int y = 20;
	  setColor(0,128,0);
	  
	  int a = 15;
	  int b = 15;
	 
	 
	  int i ; //繰り返しに使う変数iを宣言
	  for (i = 0; i < 7; i++ ) 
		  
	 
	  {
		  fillRect(x,y,a,b);
		  x += a;
		  y += b;
		  
		  a += 20;
		  b += 20;
		
		  
		 
		  
		  
		  
	  }
  }
}
