package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stingOperations {
	private static final List<Integer> Lists = null;

	public static void main(String[]args) {
		String name1="   ravi            ";
		String name2="teja                     ";
		String name3="kumar";
		String name4="kumar\nkoushal\nsudheer\nmallik";
		System.out.println(name1.isBlank());
		System.out.println(name1.repeat(78));
		System.out.println(name1.stripLeading());//remove white spaces before the string.
		System.out.println(name2.stripTrailing());//remove whitespaces after the string
		System.out.println(name1.strip());//remove white spaces
	   List<Integer> names=new ArrayList<>();
	   names.add(9);
	   names.add(9);
	   System.out.println(names);
	  Stream<String> m= name4.lines();
	  m.forEach(System.out::println);
	  List<String> guests=List.of("kumar","santhi","laku","9","89","90");//direct list creation
	  System.out.println(guests);
	  List<String> list1 = Arrays.asList("foo","bar","baz");
	  String[] array11 = list1.toArray(String[]::new);
	  System.out.println(list1);
	  for(String s:array11)
	  {
		  System.out.println(s);
	  }
	  
	}

}
