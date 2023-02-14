package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Endtoendtesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\eclipse-workspace\\hello\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i = 1; i < 5; i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		/*WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);*/
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
