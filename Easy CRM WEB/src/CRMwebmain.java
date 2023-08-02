import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CRMwebmain {

	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException{

		
		System.setProperty("webdriver.chrome.driver", "E:\\OneDrive - Software Shop Ltd\\Automation & Load Testing\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://crm-test.sslwireless.com/dashboard");	
	    Thread.sleep(2000);
	    
	    System.out.println("Welcome to The Easy CRM ");
	 
        Scanner sc = new Scanner(System.in);
        
        
        //Login
		Login.main(driver, sc);
		
	   //Market_scanning
		Market_scanning.main(driver, sc);
		
		
		sc.close();
	  //Login

        /*Login objlogin = new Login(driver);
        objlogin.signin();*/
	    
	    
	    
	}

}


