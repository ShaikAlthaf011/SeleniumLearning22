package Codingpractice14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecureFileDownloaderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qasecdwnld.ccbp.tech/");
        driver.manage().window().maximize();
       //Test the invalid Email submission:
        WebElement el1= driver.findElement(By.cssSelector("input[id='email']"));
        el1.sendKeys("example");
        WebElement el2= driver.findElement(By.cssSelector("button[id='otpButton']"));
        el2.click();
        Alert s=driver.switchTo().alert();
        System.out.println(s.getText());
        s.accept();
        //Test the valid Email submission:
        el1.clear();
        WebElement el3= driver.findElement(By.cssSelector("input[id='email']"));
        el3.sendKeys("@gmail.com");
        WebElement el4= driver.findElement(By.cssSelector("button[id='otpButton']"));
        el4.click();
        Alert ac1=driver.switchTo().alert();
        System.out.println(ac1.getText());
        ac1.accept();
        //Test the valid OTP submission:
        el3.clear();
        WebElement el5= driver.findElement(By.cssSelector("input[id='email']"));
        el5.sendKeys("123456");
        WebElement el6= driver.findElement(By.cssSelector("button[id='otpButton']"));
        el6.click();
        Alert ac2=driver.switchTo().alert();
        System.out.println(ac2.getText());
        ac2.accept();
        //Test the valid Authentication Key submission:
        el5.clear();
        WebElement el7= driver.findElement(By.cssSelector("button[id='otpButton']"));
        el7.click();
        Alert ac3=driver.switchTo().alert();
        System.out.println(ac3.getText());
        ac3.accept();
        WebElement el8= driver.findElement(By.cssSelector("input[id='email']"));
        el8.sendKeys("password123");
        WebElement el9= driver.findElement(By.cssSelector("button[id='otpButton']"));
        el9.click();
        Alert ac4=driver.switchTo().alert();
        System.out.println(ac4.getText());
        ac4.accept();
    }
}
