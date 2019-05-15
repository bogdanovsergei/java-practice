package day44_constractor02;

public class Job {
	
	private String title;
	private String company;
	private double annualSalary;
	
	public Job() {
		System.out.println("No-args constructor");	//normally we dont do print
		title = "undefined";
		company = "undefined";
	}
	
	public Job(String title) {
		System.out.println("One-args constructor");
		this.title = title;
		this.company = "undefined";
	}
	
	public Job(String title, String company, double annualSalary) {
		System.out.println("Three-args constructor");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
	}

	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
