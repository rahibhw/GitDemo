import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		//My output should only contain multiple of 2 ( 2, 4, 6, 8 , 10, 122 )
		for (int i=0; i<arr2.length; i++)
		{
			if(arr2[i] %2 == 0)
			{
				System.out.println(arr2[i]);
				break; 
				//if we just need to know whether the array has multiple of 2
			}
			else
			{
				System.out.println(arr2[i]+ " Not a multiple of 2");
			}
		}
		//ArrayList is java class which used for dynamic app where product counts may change and traditional array can't handle it
		ArrayList <String> a = new ArrayList <String>();
        a.add("Mazhar");
        a.add("Rahi");
        a.add("Selenium");
        a.add("Sikho");
        for (int i =0;i< a.size();i++ )
        {
        	System.out.println(a.get(i));
        }
        System.out.println("************************************");
        // Enhanced foor loop to ArrayList
        for (String s :a);
        {
        	System.out.println(a);
        }
        System.out.println(a.contains("Mazhar"));
        //Converting normal Array to ArrayList
        String[] name = {"Rahul","Shetty","Selenium"};
        List<String> nameArrayList =Arrays.asList(name);
        nameArrayList.contains("Selenium");
	}

}
