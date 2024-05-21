
public class RectIf extends MyFrame
{
  public void run () 
  {
	  int x = 30;
	  int y = 20;
	  
	  int a = 0;
	  int b = 0;
	  int c = 0;
	 
	  int i ; //繰り返しに使う変数iを宣言
	  for (i = 0; i < 9; i++ ) 
		  
	 
	  {
	    setColor(a,b,c);
		fillRect(x,80,10,100);
		  
		  x += 20;
		  y += 20;
		  
		  a += 20;
		  b += 20;
		  c += 20;
		 
		  
		  
	  }
  }
}
