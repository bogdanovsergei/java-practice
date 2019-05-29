package day50_inheritance03;

public class Google extends SearchEngine{
	@Override
	public int search(String word) {
		System.out.println("Seardhing for: " + word);
		int resultCount = word.length();
		return resultCount;
	}
	
	//also can be protected
	public void search(String item, String item2) {
		System.out.println("Seardhing for: " + item + ", " + item2);
		int resultCount = item.length() + item2.length();
		System.out.println("Total result: " + resultCount);

	}
	
	//can be default, protected or public
	public String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
	
	
	
	
	
}
