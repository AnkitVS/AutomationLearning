package introtosel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Adam Jones");
		driver.findElement(By.name("email")).sendKeys("AdamJones@gmail.com");
		driver.findElement(By.id("exampleInputPassword1l")).sendKeys("AdamJones");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select drop = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		drop.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("08/10/2023");
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
