import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Market_scanning {

	public static void main(WebDriver driver, Scanner sc) throws InterruptedException  {
		// TODO Auto-generated method stub
		//Search field
		System.out.println("Search Menu: ");
    	String search = sc.nextLine();
    	WebElement searchInput = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/section[1]/aside[1]/section[1]/header[1]/div[1]/input[1]"));
    	searchInput.sendKeys(search);
    	Thread.sleep(1000);
    	
        //Marketscanning
    	WebElement Marketscanning = driver.findElement(By.linkText(" Market Scanning"));
    	Marketscanning.click();
    	Thread.sleep(1000);
        
        
        
	}

}
