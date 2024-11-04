import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abiraa");
		names.add("Ram");
		names.add("Arshiya");
		names.add("Adam");
		names.add("Sima");
		
		Long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//Making a direct stream rather than converting the collection 
		//Stream.of("Abir","Ram","Arshi","Adam","Shital").filter(s->s.startsWith("A")).count();
		long d = Stream.of("Abir","Ram","Arshi","Adam","Shital").filter(s->
		{
		s.startsWith("A");
		return true;
		}).count();
		System.out.println(d);
    // We need to print name which has more than 4 alphabet
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//With below we can print the result limited to 1 string - need first result only i.e first name 
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

	}

}
