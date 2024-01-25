package Codingpractice14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecretContentPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qascrtcontent.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the failure case:
        WebElement el1= driver.findElement(By.cssSelector("button:last-child"));
        el1.click();
        Alert ac=driver.switchTo().alert();
        System.out.println(ac.getText());
        ac.sendKeys("admin");
        ac.accept();
        ac.accept();
        //Test the success case:
        WebElement el2= driver.findElement(By.cssSelector("button:last-child"));
        el2.click();
        Alert ac1=driver.switchTo().alert();
        ac1.sendKeys("password");
        System.out.println(ac1.getText());
        ac1.accept();
    }
}
