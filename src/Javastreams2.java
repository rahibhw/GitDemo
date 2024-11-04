import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Javastreams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abiraa");
		names.add("Ram");
		names.add("Arshiya");
		names.add("Adam");
		names.add("Sima");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Sabi");
		names2.add("Rahim");
		names2.add("Arshiyan");
		names2.add("Adani");
		names2.add("Simaya");
		//names.addAll(names2);
		//System.out.println(names);
		//merging two list and making a stream using concat method
		Stream<String> newStream= Stream.concat(names.stream(), names2.stream());
		//newStream.sorted().forEach(s-> System.out.println(s));
		//Need to find whether the list contains adam? see below
		boolean flag =newStream.anyMatch(s-> s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		// After performing stream ops converting the result to collector/another list
		List<String> ls=Stream.of("Abhijia","Nami","Bipasha","Kohinoora").filter(s-> s.endsWith("a")).map(s-> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	}

}
