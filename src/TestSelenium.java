import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/george/Downloads/Compressed/chromedriver_linux64_3/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://portal.aait.edu.et/");
        System.out.println("Successfully opened the portal successfully");
        driver.findElement(By.id("UserName")).sendKeys("ATR/4668/09");
        driver.findElement(By.id("Password")).sendKeys("1769");
        driver.findElement(By.className("btn-success")).click();
//        driver.findElement(By.className("glyphicon glyphicon-edit")).click();
driver.findElements(By.className("dropdown-toggle")).get(1).click();
//driver.findElements(By.className("dropdown-toggle")).add(driver.)
driver.findElements(By.className("dropdown-menu")).get(1).isSelected();

        Thread.sleep(5);
    }
}
