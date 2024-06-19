import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		
		//Arrays
		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 9;
		arr[2] = 4;
		
		int[] arr2 = {4,7,6,5}; //Integer
		String[] name = {"John","James","Peter"}; //Strings
		
		//for loop
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced for loop
		for (String s: name)
		{
			System.out.println(s);
		}
		
		//if else condition
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0) //To check for multiples of 2
			{
				System.out.println(arr2[i]);
				//break; - use this to stop execution once condition is met.
			}
			else
			{
				System.out.println(arr2[i] + " is not a multiple of 2");	
			}
			
		}
		
		//ArrayList - to dynamically increase array size
		ArrayList<String> a = new ArrayList<String>();
		a.add("Fav");
		a.add("GFN");
		a.add("Nwo");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
			
		}
		System.out.println(a.contains("Fav"));
		
		//Convert normal array to array list
		List<String> nameList = Arrays.asList(name);
		System.out.println(nameList.get(0));
		
		
		
		
		
		
		
		
		
		
	}

}
