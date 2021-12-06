package deafaultpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  Thread.sleep(1000);
	  
	}

}
