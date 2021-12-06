package deafaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMultipleActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHAVYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		WebElement text1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement text2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		
		text1.sendKeys("Welcome to selenium");
		Actions act=new Actions(driver);
		
		//CTRL + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB--shift ti input2 box
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//compare texts
		if(text1.getAttribute("value").equals(text2.getAttribute("value")))
			System.out.println(" text copied");
		else
			System.out.println("text not copied");
		
		

	}

}
