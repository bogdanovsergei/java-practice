package assignments;
import java.util.*;
public class Ass74 {
	public static void main(String[] args) {
		String msg = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		String sender, phoneNumber, message;
		System.out.println("Sender: " + msg.substring(msg.indexOf("<")+1, msg.indexOf(">")));
		System.out.println("Phone Number: " + msg.substring(msg.indexOf("[")+1, msg.indexOf("]")));
		System.out.println("Message body: " + msg.substring(msg.indexOf("{")+1, msg.indexOf("}")));
	}

}
