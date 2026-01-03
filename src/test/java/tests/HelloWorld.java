package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	
	@Test
	public void hello()
	{
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		options.addArguments("--headless=new");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		
		driver.get("https://www.google.com");
		System.out.println("Gaurav Neware");
	}

}
