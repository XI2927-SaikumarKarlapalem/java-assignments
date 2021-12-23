package assignment;

import java.util.ArrayList;
import java.util.stream.Stream;

public class varoperations {
	public static void main(String[]args)
	{
		
	 var<> names=new ArrayList<>();
	 names.add("sai");
	 names.add(99);
	 names.add("kumar");
	 names.add(87);
	 System.out.println(names);
	 System.out.println("By using for each");
	names.forEach(System.out::println);
	 
	}

}
