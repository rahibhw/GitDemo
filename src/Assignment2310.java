import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment2310 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		//.tableFixHead td:nth-child(4)
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> s=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for (int i=0;i<s.size();i++)
		{
			sum=sum+Integer.parseInt(s.get(i).getText());
			
		}
		String totalsum=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int newSum=Integer.parseInt(totalsum);
		Assert.assertEquals(sum, newSum);
		System.out.println(newSum);
	}

}
