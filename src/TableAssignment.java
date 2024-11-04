import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		//document.querySelector(".tableFixHead").scrollTop=5000
		Thread.sleep(3000);
		List<WebElement> rowCount=driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rowCount.size());
		List<WebElement> columnCount = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(columnCount.size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
	}

}
