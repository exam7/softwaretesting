import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\seleniumWebDriver\\\\chromeDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/harsh/eclipse-workspace/seleniumTest_1/src/seleniumTest_1_package/check_test.html");
	
		WebElement item1 = driver.findElement(By.id("checkbox1"));
		
		Thread.sleep(2000);
		
		item1.click();
		
WebElement item2 = driver.findElement(By.id("checkbox2"));
		
		Thread.sleep(1000);
		
		item2.click();
		
WebElement item3 = driver.findElement(By.id("checkbox3"));
		
		Thread.sleep(1000);
		
		item1.click();
		item3.click();
		
WebElement item4 = driver.findElement(By.id("checkbox4"));
		
		Thread.sleep(1000);
		
		item2.click();
		item4.click();
		
		Thread.sleep(1000);
		
		item3.click();
		
		Thread.sleep(1000);
		
		item4.click();

	}

}
