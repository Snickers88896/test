import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;

public class MainClassTest {

    @Test
    public static void main(String[] args)   {
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@class = 'gNO89b']")).click();
        System.out.println(driver.getTitle() + " response title");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        String title =driver.getTitle();
        jsx.executeScript("alert('"+title+"')");
    }
}