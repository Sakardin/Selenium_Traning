package ru.stqa.training.selenium.LiteCart;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Sakardin on 08.02.2017.
 */
public class NewUserTest extends TestBase {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    LocalDate localDate = LocalDate.now();
    Date timeStamp = new Date();


    @Test
    public void newUserTest()  {
        String eMail = new String("user" + timeStamp.getTime() + "@test.com");
        wd.get("http://localhost/litecart/en/");
        wd.findElement(By.linkText("New customers click here")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("FisrtName" + localDate);
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("LastName" + localDate);
        wd.findElement(By.name("address1")).clear();
        wd.findElement(By.name("address1")).sendKeys("Adress1");
        wd.findElement(By.name("postcode")).clear();
        wd.findElement(By.name("postcode")).sendKeys("12345");
        wd.findElement(By.name("city")).clear();
        wd.findElement(By.name("city")).sendKeys("Greenville");

        Select selectCountry = new Select(wd.findElement(By.cssSelector("select[name='country_code']")));
        selectCountry.selectByVisibleText("United States");
        Select selectState = new Select(wd.findElement(By.cssSelector("select[name='zone_code']")));
        selectState.selectByVisibleText("Maryland");

        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(eMail);
        wd.findElement(By.name("phone")).clear();
        wd.findElement(By.name("phone")).sendKeys("654987");
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("123456");
        wd.findElement(By.name("confirmed_password")).clear();
        wd.findElement(By.name("confirmed_password")).sendKeys("123456");
        wd.findElement(By.name("create_account")).click();
        wd.findElement(By.linkText("Logout")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(eMail);
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("123456");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.linkText("Logout")).click();
    }
}






