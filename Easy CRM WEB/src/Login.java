import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login {

	public static void main(WebDriver driver, Scanner sc) throws InterruptedException {
		// TODO Auto-generated method stub
		//Enter UserName
        /*WebElement userName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/form[1]/div[1]/input[1]"));
        userName.sendKeys("admin@sslwireless.com");
        Thread.sleep(3000);*/
        
        System.out.println("User Name: ");
    	String userName = sc.nextLine();
    	WebElement userNameInput = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/form[1]/div[1]/input[1]"));
        userNameInput.sendKeys(userName);
    	Thread.sleep(1000);

        //Enter Password
        /*WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/form[1]/div[2]/input[1]"));
        password.sendKeys("12345678");
        Thread.sleep(3000);*/
        
        System.out.println("Password: ");
    	String password = sc.nextLine();
    	WebElement passwordInput = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/form[1]/div[2]/input[1]"));
    	passwordInput.sendKeys(password);
    	Thread.sleep(1000);
        
        
        //Submit
        WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/section[1]/form[1]/div[3]/button[1]"));
        submit.click();
        Thread.sleep(2000);
        
        
	}

}
