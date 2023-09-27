import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wait {
    public static void main(String[] args) {
        System.out.println("Welcome");

        System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\Admin\\Documents\\S.t softwares\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.quit();

    }
}
