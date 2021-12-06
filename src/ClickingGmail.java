import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingGmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=google&oq=goo&aqs=chrome.0.0i355i433i512j46i199i433i465i512j0i131i433i512j69i57j0i131i433i512l2j0i433i512l2j0i131i433i512j0i433i512.2612j0j15&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("svg.gb_Pe")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[role='presentation']")));
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(size);
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		//driver.findElement(By.xpath("//span[text()='Gmail']")).click();
		
		

	}

}
