package Codingpractice14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatePasswordPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaupasswd.ccbp.tech/");
        driver.manage().window().maximize();
        //Test the submission with empty fields:
        WebElement el1= driver.findElement(By.cssSelector("div[class='container']>input:nth-child(3)"));
        el1.sendKeys("admin");
        WebElement el2= driver.findElement(By.cssSelector("div[class='container']>button"));
        el2.click();
        Alert al1=driver.switchTo().alert();
        System.out.println(al1.getText());
        al1.accept();
        //Test the submission with a mismatch in the new and re-enter password fields:
        WebElement el3=driver.findElement(By.cssSelector("div[class='container']>input:nth-child(5)"));
        el3.sendKeys("admin1234");
        WebElement el4=driver.findElement(By.cssSelector("div[class='container']>input:nth-child(7)"));
        el4.sendKeys("admin");
        WebElement el5= driver.findElement(By.cssSelector("button:last-child"));
        el5.click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
       //Test the dismissal of the confirmation alert:
        el4.clear();
        WebElement el6= driver.findElement(By.cssSelector("input:nth-child(7)"));
        el6.sendKeys("1234");
        WebElement el7= driver.findElement(By.cssSelector("button:last-child"));
        el7.click();
        Alert ac1=driver.switchTo().alert();
        System.out.println(ac1.getText());
        ac1.dismiss();
        //Test the successful submission:
        el1.clear();
        WebElement el8= driver.findElement(By.cssSelector("input:nth-child(3"));
        el8.sendKeys("123");
        WebElement el9= driver.findElement(By.cssSelector("button:last-child"));
        el9.click();
        Alert ac2=driver.switchTo().alert();
        System.out.println(ac2.getText());
        ac2.accept();
        driver.quit();
    }
}
