import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkRedirect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1	Set the path to the ChromeDriver executable
				System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebDriver\\chromeDriver\\chromedriver.exe");
						
						
				// 2	create new instance of ChromeDriver
				WebDriver driver = new ChromeDriver();
				
				// 3	Open desired site
				driver.get("http://127.0.0.1:5500/LinkRedirect.html");
				
				// 4	Get the title in the terminal
				System.out.println(driver.getTitle());
				
				
				WebElement youtube = driver.findElement(By.className("linkRel"));
				
				Thread.sleep(5000);
				
				youtube.click();
				
				

	}

}
