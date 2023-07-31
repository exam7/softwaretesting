import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\seleniumWebDriver\\\\chromeDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/harsh/eclipse-workspace/seleniumTest_1/src/seleniumTest_1_package/check_test.html");
	
		WebElement radio1 = driver.findElement(By.id("radio1"));
		
		Thread.sleep(2000);
		
		radio1.click();
		
		Thread.sleep(1000);
		
		WebElement radio2 = driver.findElement(By.id("radio2"));
		
		radio2.click();
		
WebElement radio3 = driver.findElement(By.id("radio3"));
		
		Thread.sleep(1000);
		
		radio3.click();
		
		Thread.sleep(1000);
		
		WebElement radio4 = driver.findElement(By.id("radio4"));
		
		radio4.click();

	}

}
