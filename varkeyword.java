package assignment;

import java.util.List;
import java.util.stream.*;
import java.util.function.*;
import java.util.function.Predicate;

public class varkeyword {
	public static void main(String [] args)
	{
		var numbers=List.of(9,22,18,17,16,24,2522,44,66,88);
		System.out.println("Given List Of Numbers");
		System.out.println(numbers);
	     Predicate<Integer> k=(var i)->i%2==0;
		List<Integer> evennum=numbers.stream().filter(k).collect(Collectors.toList());
		System.out.println("------------------------------------------------------------------");
		System.out.println("after filter the even numbers from the actual list is given below");
		System.out.println(evennum);
		
	}

}
