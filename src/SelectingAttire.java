import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingAttire {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("max dresses");
		driver.findElement(By.xpath("//span[text()='ZESICA Women's Bohemian Floral Printed Wrap V Neck Short Sleeve Split Beach Party Maxi Dress]'")).click();
		
		
		

	}

}
