package InterviewPrograms;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeapYear {

	public static void leapYear() {

		List<Integer> years = new ArrayList<Integer>();
		years.add(2018);
		years.add(2019);
		years.add(2020);
		years.add(2021);
		years.add(2024);

		List<Integer> leapYear = new ArrayList<Integer>();
		for (Integer year : years) {
			if (Year.of(year).isLeap()) {
				leapYear.add(year);
			}
		}

		for (Integer year : leapYear) {
			System.out.println(year);
		}

	}

	public static void main(String[] args) {
		
		
		System.out.println("Without java8 Streams");
		 LeapYear.leapYear();
		 
		 System.out.println("With Java8");

		List<Integer> years = List.of(1990, 1986, 1900, 2024, 2030, 2000);

		List<Integer> leapYear = years.stream() // Calling .stream() converts the collection into a Stream.
				.filter( // filter is an intermediate operation on the stream.
						year -> Year.of(year).isLeap())

				/*
				 * year → each element from the stream (each Integer year).
				 * 
				 * Year.of(year) → creates a java.time.Year object for that integer.
				 * 
				 * .isLeap() → checks whether the given year is a leap year according to the
				 * ISO-8601 calendar.
				 * 
				 * If true, the year stays in the stream.
				 * 
				 * If false, the year is filtered out.
				 */

				.collect(Collectors.toList());
		/*
		 * collect() is a terminal operation — it triggers the execution of the stream
		 * pipeline. Collectors.toList() gathers all elements that passed the filter
		 * into a new List.
		 * 
		 * The resulting list contains only leap years.
		 */
		leapYear.forEach(System.out::println);
	}

}
