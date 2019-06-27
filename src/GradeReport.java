import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GradeReport {

    public static void main(String[] args) throws InterruptedException {

        //Tesfaye Berhanu ...ATR/4668/09.....Sectio:3

        System.setProperty("webdriver.chrome.driver", "/home/george/Downloads/Compressed/chromedriver_linux64_3/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://portal.aait.edu.et/");
        System.out.println("Successfully opened the portal successfully");
        driver.findElement(By.id("UserName")).sendKeys("ATR/4668/09");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.className("btn-success")).click();
        driver.navigate().to("https://portal.aait.edu.et/Grade/GradeReport");
        String hh = driver.getCurrentUrl();
        driver.get(hh);
        System.out.println(driver.findElement(By.tagName("table")).getText());
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("grade.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("");

            printWriter.append(driver.findElement(By.tagName("table")).getText());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
