package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[1]")).click();
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='name']"));
		int namecount=name.size();
		System.out.println(namecount);
		List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']"));
		int brandcount=brand.size();
		System.out.println(brandcount);
		for (int i = 0; i < name.size(); i++) {
			WebElement s=name.get(i);
			String X=s.getText();
			
			
			System.out.println(X);
			WebElement T=brand.get(i);
			String Y=T.getText();
			
			System.out.println(Y);
		}
		
	}

}
