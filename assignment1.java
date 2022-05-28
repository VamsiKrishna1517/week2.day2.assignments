package Selenium.week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //open the browser( set up chrome driver)
		WebDriverManager.chromedriver().setup();
		//open browser chrome
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://en-gb.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//implement implcit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vamshi");
		//sur name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krishna");
		// email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9731431947");
		// password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password1234");
		//Day dropdown
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(ele);
		day.selectByValue("17");
		//Month
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(ele1);
		month.selectByVisibleText("May");
		//Year
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(ele2);
		year.selectByVisibleText("1991");
		//Click Female
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		//Click Submit
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
