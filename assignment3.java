package Selenium.week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//open browser chrome
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("https://acme-test.uipath.com/login");
		//maximize the window
		driver.manage().window().maximize();
		//enter user name
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//enter password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Get title
		String title = driver.getTitle();
		System.out.println(title);
		//Log out
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		Thread.sleep(5000);
		//close the windows
		driver.close();
		
		

	}

}
