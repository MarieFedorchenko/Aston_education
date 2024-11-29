import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OnlineAccountReplenishmentTest{

    protected WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //таймаут

        driver.get("https://www.mts.by/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void checkTitle() {
        WebElement title = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        Assertions.assertEquals(expectedTitle, title.getText(), "Некорректное название блока.");
    }

    @Test
    public void checkLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']/ul/li"));
        Assert.assertTrue(!logos.isEmpty(), "Логотипы отсутвуют");
    }

    @Test
    public void checkLink() {
        WebElement accept = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        if (accept.isDisplayed()) {
            accept.click();
        }
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
    }

    @Test
    public void checkButtonContinue() {
        WebElement accept = driver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
            if (accept.isDisplayed()) {
                accept.click();
            }
        WebElement servicesDropdownList = driver.findElement(By.xpath("//button[@class='select__header']"));
        servicesDropdownList.click();

        WebElement inputNumber = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        inputNumber.sendKeys("297777777");

        WebElement amountMoney = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        amountMoney.sendKeys("100");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        continueButton.click();
    }
}