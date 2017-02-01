package ru.stqa.training.selenium.LiteCart;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sakar on 01.02.2017.
 */
public class TestBase {
    protected WebDriver wd;
    protected WebDriverWait wait;

    @Before
    public void start(){
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 10);
    }

    @After
    public void stop(){
        wd.quit();
        wd = null;
    }
}
