package testfor;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.System.setProperty;

public class testNG {
    public static void main(String[] args) {

                // Подключаем драйвер браузера
                setProperty("webdriver.chrome.driver","D:\\Project\\chromedriver\\chromedriver.exe");

                // Открываем браузер, разворачиваем и переходим на сайт
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://igorakintev.ru/admin/");

                // По ID ищем поля User и Password, с помощью метода sendKeys вводим данные
                driver.findElement(By.id("id_username")).sendKeys("silenium");
                driver.findElement(By.id("id_password")).sendKeys("super_password");

                // С помощью локатора css ищем класс кнопки и нажимаем
                driver.findElement(By.cssSelector("div.submit-row")).click();

                // С помощью локатора xpath ищем элемент с  ID=content и идем к следующему элементу
                // Получаем текст и сравниваем
                String namePanel = driver.findElement(By.xpath("//*[@id='content']/h1")).getText();
                Assert.assertEquals("Панель управления", namePanel);

            }
        //изменения от пользюкааа !!!!!!!!!!!!
    //изменения от пользюкааа !!!!!!!!!!!!
    //изменения от пользюкааа !!!!!!!!!!!!
    //изменения от пользюкааа !!!!!!!!!!!!
    //изменения от пользюкааа !!!!!!!!!!!!
           
        }

