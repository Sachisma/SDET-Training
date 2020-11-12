package SeleniumPkgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/simple-form");
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		firstName.sendKeys("Sachisma");
		lastName.sendKeys("Tripathy");
		
		driver.findElement(By.id("email")).sendKeys("test@example.com");
		
		driver.findElement(By.id("Contactnumber")).sendKeys("9900990099");
		 
		//WebElement contactNumber = driver.findElement(By.id("Contactnumber"));
		//contactNumber.sendKeys("9900990099");
		

        driver.findElement(By.id("SubmitButton")).submit();
        
        driver.close();
		
	}
}
