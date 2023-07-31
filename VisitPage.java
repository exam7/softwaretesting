import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//this program opens youtube.com via search result from google.com

public class VisitPage {

	public static void main(String[] args) {
		
		
		// 1	Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebDriver\\chromeDriver\\chromedriver.exe");
		
		
		// 2	create new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		
		// 3	Open desired site
		driver.get("https://google.com/");
		
		
		// 4	Get the title in the terminal
		System.out.println(driver.getTitle());
		

	}

}
