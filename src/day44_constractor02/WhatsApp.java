package day44_constractor02;

public class WhatsApp {
	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		//this("12313123","Hi!");	//==> it's like a infinity loop and cannot be compiled
		//this();	==> you cannot call itself
		System.out.println("No-Args constructor");
	}
	
	public WhatsApp(String toNumber, String message) {
		this();											//it should be on top
		System.out.println("2 Args constractor");
		this.message = message;
		this.toNumber = toNumber;
	}
	
	public WhatsApp(String toNumber) {
		//toNumber, "[]"
		//this.toNumber = toNumber;
		//this.message = "[]";
		this(toNumber, "[]");
		System.out.println("One-arg constractor");
	}
	
	
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	

}
