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
/*
                // С помощью xpath указываем путь до кнопки "Добавить" и жмем
                // С помощью xpath ищем элемент "а" с определенной ссылкой
                //driver.findElement(By.xpath("//*[@id='module_2']/div/ul[1]/li[1]/ul/li[1]/a")).click();
                driver.findElement(By.xpath("//a[@href='/admin/blog/entry/add/']")).click();

                //С помощью xpath ищем  тег "h1" с определенным текстом, получаем текст и сравниваем
                String namePanel2 = driver.findElement(By.xpath("//h1[text()='Добавить entry']")).getText();
                Assert.assertEquals("Добавить entry", namePanel2);

                // Заполняем поля с соответствующими масками(Title и Slug) и случайным набором цифр с помощью метода rand()
                StringBuilder rand = rand();
                driver.findElement(By.id("id_title")).sendKeys("Title" + rand);
                driver.findElement(By.id("id_slug")).clear();
                driver.findElement(By.id("id_slug")).sendKeys("Slug" +  rand);
                driver.findElement(By.id("id_text_markdown")).sendKeys("Slug" +  rand);
                driver.findElement(By.id("id_text")).sendKeys("Slug" +  rand);

                // Ищем элемент по имени и жмем "Сохранить"
                driver.findElement(By.name("_save")).click();

                // Переходим на страницу
                driver.get("http://igorakintev.ru/admin/blog/");
                System.out.println("Верный " + rand);

                //Ищем последний созданный элемент, получаем его текст и сравниваем
                String namePane3 = driver.findElement(By.xpath("//*[@id='module_2']/div/ul/li/a")).getText();

                System.out.println("namePane3 " + namePane3);
                //Assert.assertEquals("Entry " + "Title" + rand, namePane3);

                // Ищем элемент "а" с определенным классом и переходим в созданный ранее элемент
                driver.findElement(By.xpath("//a[@class=' addlink']")).click();
                // Жмем на удалить и подтверждаем удаление
                driver.findElement(By.xpath("//a[@class='deletelink']")).click();
                driver.findElement(By.xpath("//input[@type='submit']")).click();
            }

            // Метод создает случайную последовательность заданных символов
            public static StringBuilder rand()
            {
                String symbols = "123456789";   // Задаем строку символов
                StringBuilder randString = new StringBuilder();  // Создаем новый объект класса StringBuffer
                for(int i=1; i<11; i++)     // Цикл/счетчик
                    randString.append(symbols.charAt((int)(Math.random()*symbols.length()))); // Добавляет  в строку созданный случайный символ
                return randString;*/
            }
        }

