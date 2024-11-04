
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name =d.getData();
		System.out.println(name);
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
		getData2();
		//getData2 is the method of this class which used with static keyword so no need to make
		//object to call this method
		//to call methods from other class we first need to make object for that class to call the method
	}
	
	public String getData()
	{
		System.out.println("Hello World");
		return "Mazhar Rahi";
	}
	public static String getData2()
	{
		System.out.println("Hello World");
		return "Mazhar Rahi";
	}

}
