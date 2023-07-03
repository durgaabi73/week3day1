package week3day1;

public class Calculator {

	 public void add(int x,int y) {
	        System.out.println(x+y);
	    }
	    public void add(int x,int y,int z) {
	        System.out.println(x+y+z);
	    }
	  
	    
	    
	    
	    public void multiple (double x , double y) {
	    	
	    	System.out.println(x*y);
	    }
	    	
	    	public void multiple (float x , float y) {
	    		
	    		System.out.println(x*y);
	    	}
	    		
	    		public static void main(String[] args) {
	    	        Calculator obj=new Calculator();
	    	        obj.add(10,20);
	    	       obj.add(30,25,35);
	    	      obj.multiple(20, 20f);
		    	   obj.multiple(0.5,1.0 );
		    	        
		    	        
	    	       
	    	       
	  }
	
	
}


