package FabricaDeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public  class FDriver {


  private static WebDriver driver;

    @Before

    public  static void before() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" ,"src/test/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);


    }

    public static WebDriver getDrive(){
        return driver ;

    }

    @After
    public static void fecharDriver(){

        driver.close();
    }
    @AfterAll
    public static void endTest(){
        driver.quit();
    }
}
