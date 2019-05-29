package day49_inheritance02;

public class PaperBook extends Book{
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString() {
		//title, author, price, type, pages
		return getTitle() + " | " + getAuthor() + " | " + getPrice() + " | " + getType() + " | " + getPages();
	}

}
