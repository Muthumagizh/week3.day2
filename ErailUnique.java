package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@id='tdDateOnly']//input")).click();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Delhi");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("buttonFromTo")).click();
		driver.findElement(By.xpath("//td[@id='tdDateOnly']//input")).click();
		Thread.sleep(1000);
		List<WebElement> trainname =driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		int sizetrn=trainname.size();
		System.out.println(sizetrn);
		List<String> trainnames=new ArrayList<String>();
		for (int i = 0; i < sizetrn; i++) {
			WebElement trainname1=trainname.get(i);
			trainnames.add(trainname1.getText());	
			
	}
		int sizetrnlist=trainnames.size();
		System.out.println("List size"+ sizetrnlist);
		Set<String> settrn=new LinkedHashSet<String>();
for (String strtrn : trainnames) {
	settrn.add(strtrn);
	
	
}
System.out.println("Set size "+settrn.size());
	}

}
