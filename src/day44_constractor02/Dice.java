package day44_constractor02;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET", "Amazon", 130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		//Create a list of Jobs
		//and add 5 different jobs
		
		List<Job> jobsList = new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master", "Google", 123_000));
		jobsList.add(new Job("SDET", "FreddieMac", 100_000));
		jobsList.add(new Job("BA", "Leidos", 98000));
		jobsList.add(new Job("Senior QA Tester", "Delta", 150_000));
		
		System.out.println(jobsList.toString());
		
		//find the highest paying job print toString for that
		
		int highestIndex = -1;
		double maxSalary = 0;
		for(int i=0; i<jobsList.size(); i++) {
			if (jobsList.get(i).getAnnualSalary() > maxSalary) {
				maxSalary = jobsList.get(i).getAnnualSalary();
				highestIndex = i;
			}
		}
		System.out.println("Highest paying job: " + jobsList.get(highestIndex));
		
		Job bestJob = jobsList.get(highestIndex);
		System.out.println("Highest Salary: " + bestJob.getAnnualSalary());
		
		
	}

}
