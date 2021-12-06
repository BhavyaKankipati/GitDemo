package deafaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("-disable-notificaions");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://spicejet.com");
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
	}

}
