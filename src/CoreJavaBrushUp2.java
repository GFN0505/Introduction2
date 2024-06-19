
public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		String s1 = "Rahul Shetty Academy"; //Literal
		String s2 = new String("Welcome"); //Using new key word
		
		//To split spring
		String[] splittedString = s1.split("Shetty");//Shetty is the delimiter
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1].trim()); //trim to remove white spaces before Academy
		
		for (int i=s1.length()-1; i>=0; i--) //To loop in reverse order
		{
			System.out.println(s1.charAt(i));
		}
		
		
		//To access the methods of a class you have to create an object of that class
		//To access the methods within your own class without creating an object, you can give it the access modifier of "Static"
		//If a method doesnt return anything, the modifier should include a void, if it returns a something it should contain type of what it returns, like String or int
		//Restrict the access of a method from other classes by using private as a modifier instead of public

	}

}
