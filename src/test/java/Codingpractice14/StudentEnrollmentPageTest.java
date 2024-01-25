package Codingpractice14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentEnrollmentPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qastdenroll.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1= driver.findElement(By.cssSelector("input[placeholder='Name']"));
        el1.sendKeys("John");
        WebElement el2= driver.findElement(By.cssSelector("button[class='submit-button']"));
        el2.click();
        Alert Al=driver.switchTo().alert();
        System.out.println(Al.getText());
        Al.accept();
        WebElement el3=driver.findElement(By.cssSelector("input[placeholder='Email']"));
        el3.sendKeys("john@gmail.com");
        WebElement el4= driver.findElement(By.cssSelector("button[class='submit-button']"));
        el4.click();
        Alert Al1=driver.switchTo().alert();
        System.out.println(Al1.getText());
        Al1.accept();
        driver.findElement(By.cssSelector("div[class='registration-form-container']>div>button")).click();
    }
}
