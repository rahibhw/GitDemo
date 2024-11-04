import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentJavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array
		//values.stream().distinct().forEach(i->System.out.println(i)); to get distinct or unique value
		//values.stream().distinct().sorted().forEach(i->System.out.println(i));
		
		//now if we need only the 3rd index integer from it ?
	List<Integer>	ls=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(ls.get(2));
		
	}

}
