package day07_;

public class PreAndPost2 {
	public static void main(String[] args) {
		int messages = 10;
		messages++;
		++messages;
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages; // decreasing first
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		int unreadMessages = readMessages--;
		System.out.println("UnreadMessages: " + unreadMessages);//11
		System.out.println("ReadMessages: " + readMessages);	//10
		
		int total = unreadMessages++ - readMessages--;
		
		System.out.println("UnreadMessages: " + unreadMessages);//12
		System.out.println("ReadMessages: " + readMessages);	//9
		System.out.println("Total: " + total);					//1
		
		int count = 20;
		int count2 = 10;
		int totalCount = ++count + --count2;
		System.out.println("Count: " + count);		//21
		System.out.println("Count2: " + count2);	//9
		System.out.println("Total: " + totalCount);	//30
		
					//  21(+1)+ (+1) + 23
		int myCount = count++ + ++count;
		System.out.println("count: " + count);
		System.out.println("myCount: " + myCount);
		
	}

}
