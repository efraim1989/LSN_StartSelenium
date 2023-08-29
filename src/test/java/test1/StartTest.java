package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {

    WebDriver wd;


    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();

//      wd.get("https://telranedu.web.app/home");

       wd.navigate().to("https://telranedu.web.app/home");

//      wd.navigate().back());
//        wd.navigate().forward();
//      wd.navigate().refresh();
;
    }

    @Test
    public void testMethod(){
        WebElement element = wd.findElement(By.tagName("a"));

        List<WebElement> elements = wd.findElements(By.tagName("div"));
        System.out.println(elements.size());

        wd.findElement(By.id("root"));
        wd.findElement(By.className("container"));
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("OM"));
    }

    public void testMethod1(){
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.cssSelector("[href^='/log']"));
        wd.findElement(By.cssSelector("[href$='gin']"));
        wd.findElement(By.cssSelector("[class='active']"));

        System.out.println(wd.findElement(By.cssSelector("[href='/about']")).getAttribute("href"));
    }



    @AfterMethod
    public void postcondition(){
    //    wd.close();
    //   wd.quit();

    }









}
