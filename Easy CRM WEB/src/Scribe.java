import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Scribe {
	static WebDriver driver;

	public Scribe(WebDriver driver){

        Scribe.driver = driver;
    }
	
	
	@SuppressWarnings("null")
	public void fetch1() throws InterruptedException{
		for(int i=1;i<=1;i++);{
			
		JavascriptExecutor driver = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement element = ((WebDriver) driver).findElement(By.xpath("//*[@id=\"fetch_button\"]"));
	               element.click(); 
	             //Locating element by id and click to skip button        		
	               WebElement Element = (WebElement) ((By) driver).findElements((SearchContext) By.id("fa_owner_nid_verification_skipped_ia"));

	               // Scrolling down the page till the element is found		
	               js.executeScript("arguments[0].scrollIntoView();", Element);
	               Element.click();
	               
	           //keep comments for skipping this section
	            WebElement element1=((WebDriver) driver).findElement(By.id("skipping-nid-verification-remark"));
	                       element1.click();
	                       element1.sendKeys("for automation purpose we have skiped it");
	            //Now click to skip the button
	            ((WebDriver) driver).findElement(By.xpath("//*[@id=\"showNIDSkippingRemark\"]/td[2]/div/div/button[2]")).click();
	            
	               //Now click on to initial approve button
	               // Scrolling down the page till the element is found	
	               ((WebDriver) driver).findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/a[1]")).click();
	               WebElement initialapprove=((WebDriver) driver).findElement(By.xpath("//*[@id=\"approve\"]"));
	               js.executeScript("arguments[0].scrollIntoView();", initialapprove);
	               initialapprove.click();
	               ((ChromiumDriver) driver).quit();                     
	                          
}
	}
}
