import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main (String args[]) throws NoAlertPresentException,InterruptedException {
        System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\Admin\\Documents\\S.t softwares\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("1010");
        driver.findElement(By.name("submit")).click();

        //switch to alert
        Alert alert=driver.switchTo().alert();

        //capturing alert msg
        String alertmsg=driver.switchTo().alert().getText();

        //displaying alert msg
        System.out.println(alertmsg);
        Thread.sleep(1000);

        //accepting alert
        alert.accept();
        //alert.dismiss();

        //System.out.println(alertmsg);
        driver.close();

    }
}
