
public class MyBook extends Book
{
	public String setTitle(String s)
	{
		return title =s;
	}
		


public static void main(String[] args)
{
	
    MyBook newNovel = new MyBook();
    
    newNovel.setTitle("Herry Poter");
	
	
	System.out.println("The title is: " + newNovel.getTitle());
}

}

