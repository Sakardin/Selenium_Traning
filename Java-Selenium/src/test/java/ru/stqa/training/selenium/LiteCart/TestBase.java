package ru.stqa.training.selenium.LiteCart;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sakar on 01.02.2017.
 */
public class TestBase {
    protected static WebDriver wd;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void start(){
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 10);

    }

    @AfterClass
    public static void stop(){
        wd.quit();
        wd = null;
    }
}
