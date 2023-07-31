import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1	Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebDriver\\chromeDriver\\chromedriver.exe");
				
				
		// 2	create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// 3	Open desired site
		driver.get("http://127.0.0.1:5500/index.html");
		
		// 4	Get the title in the terminal
		System.out.println(driver.getTitle());
				
		// 5	find the search box element        
		WebElement dropList = driver.findElement(By.id("dropList"));
		
		dropList.click();
		
		

	}

}
