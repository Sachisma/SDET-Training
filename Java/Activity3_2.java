import java.util.HashSet;

public class Activity3_2 {
	
public static void main(String [] args)
{
	
	HashSet<String> hs = new HashSet<>();
	hs.add("Tom");
	hs.add("Mary");
	hs.add("Harry");
	hs.add("Jack");
	hs.add("Bann");
	hs.add("Sony");
	System.out.println("The set has " + hs.size() + " elements");
	
	hs.remove("Sony");
	System.out.println("Sony is removed");
	if(hs.remove("Chiny"))
	{
		System.out.println("Chiny is removed");
	
	}
	else 
	{
		System.out.println("Chiny is not present in the set");
	}
	
	hs.contains("Jack");
	 System.out.println("Checking if Jack is present: " + hs);
	 
	 System.out.println("Updated HashSet: " + hs);
	

}
}
