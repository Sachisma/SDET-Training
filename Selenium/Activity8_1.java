package SeleniumPkgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {
	
	public static void main(String args[]) 
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		
		
		
		WebElement checkBox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox'])"));	
		
		toggleCheckboxButton.click();
				
	     toggleCheckboxButton.click();
	    
	     wait.until(ExpectedConditions.invisibilityOf(checkBox));
	        
	
	        toggleCheckboxButton.click();
	        
	     
	        wait.until(ExpectedConditions.visibilityOf(checkBox));
	        checkBox.click();
	        
	        //Close browser
	        driver.close();
	}

}
