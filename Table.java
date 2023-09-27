import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        System.out.println("Welcome");

        System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\Admin\\Documents\\S.t softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2021/08");

        //finding table by using xpath
        List<WebElement>allHeaders=driver.findElements(By.xpath("//table[contains(@id,'customer')]//th"));
        System.out.println(allHeaders.size());
        for (WebElement Web:allHeaders)
        {
            String Value=Web.getText();
            System.out.println(Value);

        }
        driver.quit();



    }
}
