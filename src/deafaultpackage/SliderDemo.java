package deafaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of the min slider :"+min_slider.getLocation());
		System.out.println("Size of the element : "+min_slider.getSize());
		
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider,59,0).perform();
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of the max slider :"+max_slider.getLocation());
		
		
		act.dragAndDropBy(max_slider,-100,0).perform();
		System.out.println("Location of the max slider :"+max_slider.getLocation());
		

	}

}
