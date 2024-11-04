
public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//any variable without datatype in Java is meaningless
		int num=5;
		String website = "Rahul Shetty Academy";
		double dec = 5.99;
		char letter = 'r';
		boolean myCard = true;
		System.out.println(num);
//mixing a variable with string should be concanated 
		System.out.println(num+" is the value stored in num variable");
		
		//Array - Can store multiple value in one variable 
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		//another way for array defining
		//int[] arr2 = {1,2,3,4,5};
		//System.out.println(arr2[0]);
	
		//for loop to print all the arr value
		//for (int i=0; i< arr.length; i++)
		//{
			//System.out.println(arr[i]);
		//}
		String[] name = {"Rahul","Shetty","Selenium"};
		for (int i=0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for(String s : name)
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
 