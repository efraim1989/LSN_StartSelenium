package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hw9_leumi {

    WebDriver wd;


    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();

        wd.navigate().to("https://www.leumi.co.il/");
        wd.manage().window().maximize();

    }


    @Test
    public void leumiTest() {

        String text = wd.findElement(By.xpath("//*[.='פרטי']")).getText();
        Assert.assertEquals(text, "פרטי");
        Assert.assertTrue(text.contains("פר"));



    }

    @AfterMethod

    public void postcondition() {
        wd.quit();
    }


}
