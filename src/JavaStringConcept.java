
public class JavaStringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String is an object - collection of character, Two methods of creating string by using new memory operator or using strng literal
		//below two var. will point to same object and no new space will be created
		String s1 = "Rahul Shetty Academy";
		
		//by creating with new memory operator new object will be created in java memory
		String s3 = new String("Welcome");
		//Splitting a string and will become an array - method is s.split delimeter can be white space or word like here Shetty
		String s = "Rahul Shetty Academy";
		String[] splittedString=s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		//printing all character from above string - consider this as character array and its not standard array so s[i] method not print and we need to use s.char method
		for(int i=0; i< s.length(); i++)
		{
		System.out.println(s.charAt(i));
		}
		//Printing in reverse order all the character
		for(int i= s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}

}
