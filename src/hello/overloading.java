package hello;

public class overloading {

	    public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	    
	    
	
	public static void main(String args[])
	   {
	       overloading obj = new overloading();
	       obj.disp('a');
	       obj.disp('a',10);
	   }
	}
	
	
	

