import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Javastreams1 {

	public static void main(String[] args) {
		// Print the name ends with m to upper case
		Stream.of("Abir","Ram","Arshi","Adam","Shital").filter(s->s.endsWith("m"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print all name to upper case
		Stream.of("Abir","Ram","Arshi","Adam","Shital")
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print name which starts with A to upper case and sorted
		List<String> names=Arrays.asList("Abir","Ram","Arshi","Adam","Shital");
		names.stream().filter(s->s.startsWith("A")).sorted()
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));	

	}

}
