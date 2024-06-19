import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromdriver", "/Users/godsfavournwoko/Downloads/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//CSS selector - tagname[attribute='value']
		//xpath - //tagname[@attribute='value']
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nwo@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("nwoko@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("08160140607"); //traversing parent to child tags with xpath
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();	
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//traversing parent to child tags with css
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //css Regular expression
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.close();
		
		
		
	}

}
