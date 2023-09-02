package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class hw9_table {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){

        wd = new ChromeDriver();

        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();

    }

    @Test
    public void tableTest(){

        List<WebElement> elements = wd.findElements(By.xpath("//table[@id='customers']//tr"));
        System.out.println("Amount of table rows: " + elements.size());

        List<WebElement> elements1 = wd.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
        System.out.println("Amount of table columns: " + elements1.size());

        WebElement element = wd.findElement(By.xpath("//table[@id='customers']//tr[3]"));
        System.out.println("Row #3: " + element.getText());



//        // Найти таблицу по её id
//        WebElement table = wd.findElement(By.id("customers"));
//
//        // Найти все строки в таблице
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        // Пройти по каждой строке и получить текст последней ячейки
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            if (!cells.isEmpty()) {
//                WebElement lastCell = cells.get(cells.size() - 1);
//                System.out.println(lastCell.getText());
//            }
//        }

        System.out.println("\n================================");
        System.out.println("Last column:");

        // Найти все последние ячейки (td) в таблице с id="customers"
        List<WebElement> lastCells = wd.findElements(By.xpath("//table[@id='customers']//tr/td[last()]"));

        // Вывести текст из каждой последней ячейки
        for (WebElement cell : lastCells) {
            System.out.println(cell.getText());
        }

    }


    @AfterMethod
    public void postcondition(){
        wd.quit();
    }












}
