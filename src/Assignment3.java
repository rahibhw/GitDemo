import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select (dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(opt))
		{
			System.out.println("Option available in alert");
		}
		else {
			System.out.println("Something wrong in the execution");
		}
		driver.switchTo().alert().accept();
		
		}

	}


