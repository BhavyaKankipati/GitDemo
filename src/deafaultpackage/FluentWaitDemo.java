package deafaultpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitDemo {

	public static void main(String[] args) {
		//Fluent wait find out webelement repeatedly at regular intervals of time until the timeout or till the object found
		//WebDriveWait and FluentWait implements Wait interface
		//WebDriverWait=10 sec
		//FluenWait=10 sec,polling time=2 sec
		
		//
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}

}
