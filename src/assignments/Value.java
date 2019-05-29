package assignments;

public class Value {
	  //WRITE YOUR CODE HERE
	  int value;
	  int modified=0;
	  public Value(int param) {
	    value = param;
	  }
	  
	  public Value() {
	    value=0;
	  }
	  
	  public int setValue(int param) {
		modified=1;
	    return value = param;
	  }
	  
	  public boolean wasModified() {
	    if (modified==1) {
	    	return true;
	    }
	    return false;
	  }
	  
	  public int getVal() {
		  return value;
	  }
	  
	  
	}
