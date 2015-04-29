
public class Coin {
		  
	 //instance fields
	  private String face = "";
	  
	  //default constructor
	  public Coin(){} 
	  
	  //assessor and mutator methods
	  //should be public becuase you can not only flip the coin but turn it yourself
	  public String getFace(){ return face; }
	  public void setFace(String f){ face = f; }
	  
	  //method to flip the coin
	  public void flip(){
	    int result = (int) (Math.random() * 2);
	     if (result == 0) { 
	      face = "Heads"; }
	    else { face = "Tails"; }
	  }
	  
	  //method to return the current state of the coin
	  public String toString(){
	    return getFace();
	  }
	  
	} //end of class