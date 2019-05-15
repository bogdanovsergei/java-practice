package day26_array04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		System.out.println("Total names: " + names.length);

		// print all names in single line
		System.out.println(Arrays.toString(names));

		// print in column format

		for (int i = 0; i < names.length - 1; i += 2) {
			System.out.println(names[i] + ", " + names[i + 1]);
		}

		// print male
		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i]);
		}

		// print random name
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("Random name: " + names[r]);

		// print all names that are up to 4 (including) characters in uppercase, in same
		// line
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				System.out.print(names[i].toUpperCase() + ", ");
			}
		}
		System.out.println();

		for (String name : names) {
			if (name.length() <= 4) {
				System.out.print(name.toUpperCase() + ", ");
			}
		}

		System.out.println("\nNAMES LENGTH SORT");
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		for (String name : names) {
			if (name.length() <= 4) {
				namesUpto4 += name + ", ";
			} else if (name.length() >= 5 && name.length() <= 6) {
				names5to6 += name + ", ";
			} else if (name.length() >= 7) {
				names7orMore += name + ", ";
			}
		}

		System.out.println("NamesUpto4: "+namesUpto4);
		System.out.println("Names5to6: "+names5to6);
		System.out.println("Names7orMore: "+names7orMore);
		
		//switch columns male and females
		
		System.out.println(Arrays.toString(names));
		
		String temp = "";
		for (int i = 0; i < names.length - 1; i += 2) {
			temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;
		}
		System.out.println(Arrays.toString(names));
	}

}
