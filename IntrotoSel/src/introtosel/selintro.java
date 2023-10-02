package introtosel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://www.spicejet.com/");
		/*
		 * Select staticdrop = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * staticdrop.selectByIndex(2);
		 * System.out.println(staticdrop.getFirstSelectedOption().getText());
		 * staticdrop.selectByVisibleText("AED");
		 * System.out.println(staticdrop.getFirstSelectedOption().getText());
		 * staticdrop.selectByValue("INR");
		 * System.out.println(staticdrop.getFirstSelectedOption().getText());
		 */

		WebElement ele = driver
				.findElement(By.xpath("//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar' and text()='INR']"));
		ele.click();
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-ubezar' and text()='AED']")).click();
		Assert.assertEquals((String) ele.getText(), "AED");
		ele.click();
		driver.findElement(By.xpath("//*[@class='css-76zvg2 r-homxoj r-ubezar' and text()='INR']")).click();
		Assert.assertEquals((String) ele.getText(), "INR");

		// Dynamic Dropdown
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='BHO']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 */
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.sendKeys("BHO");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.sendKeys("BLR");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();

		driver.findElement(By.xpath("//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar' and text()='1 Adult']"))
				.click();
		driver.findElement(By.xpath(
				"//*[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']"))
				.click();
		driver.findElement(By.xpath("//*[@data-testid='home-page-travellers-done-cta']")).click();

		Assert.assertEquals(
				driver.findElement(By.xpath("(//*[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText(),
				"2 Adults");

		driver.findElement(
				By.xpath("//*[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa' and text()='Family & Friends']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();

		// Selecting passenger
		/*
		 * driver.findElement(By.xpath("//a[@id='divpaxinfo']")).click();
		 * driver.findElement(By.xpath("//a[@id='hrefIncAdt']")).click();
		 * driver.findElement(By.xpath("//a[@id='btnclosepaxoption']")).click();
		 */
	}

}
