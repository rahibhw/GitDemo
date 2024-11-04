import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Maz");
		driver.findElement(By.name("email")).sendKeys("herath@gmail.com");
		driver.findElement(By.cssSelector("input[id*='InputPassword1']")).sendKeys("Pass1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='bday']")).sendKeys("01/09/1998");
		driver.findElement(By.cssSelector("input[class*='btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
	}

}
