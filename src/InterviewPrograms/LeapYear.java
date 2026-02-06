package InterviewPrograms;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> years = List.of(1990,1986,1900,2024,2030,2000);
		
		
		
		
		List<Integer> leapYear = years.stream()    // Calling .stream() converts the collection into a Stream.
				.filter (                           // filter is an intermediate operation on the stream.
				year-> Year.of(year).isLeap()) 
				
				/*
				 * year → each element from the stream (each Integer year).
				 * 
				 * Year.of(year) → creates a java.time.Year object for that integer.
				 * 
				 * .isLeap() → checks whether the given year is a leap year according to the ISO-8601 calendar.
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
