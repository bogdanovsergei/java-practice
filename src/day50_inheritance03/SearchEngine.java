package day50_inheritance03;

public class SearchEngine {
	
	public int search(String item) {
		System.out.println("Seardhing for: " + item);
		int resultCount = item.length();
		return resultCount;
	}
	
	protected void search(String item, String item2) {
		System.out.println("Seardhing for: " + item + ", " + item2);
		int resultCount = item.length() + item2.length();
		System.out.println("Total result: " + resultCount);

	}
	
	//default method
	String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
	

}
