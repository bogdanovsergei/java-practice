package assignments;

public class Carpet {
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	  
	  public Carpet() {
		  width = 300;
		  length = 300;
		  totalPrice = 200;
		  unitPrice = 0;
	  }
	  
	  public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		  this.width = width;
		  this.length = length;
		  this.unitPrice = unitPrice;
		  this.isPersian = isPersian;
		  this.totalPrice = (this.width + this.length) * this.unitPrice;
		  if (this.isPersian) {
		  this.totalPrice += 200; 
		  }
	  }
}
	  
	  
