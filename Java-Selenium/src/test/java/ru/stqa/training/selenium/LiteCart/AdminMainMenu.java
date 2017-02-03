package ru.stqa.training.selenium.LiteCart;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


public class AdminMainMenu extends LoginLocal{


    @Test
    public void menuClick() {

        String fistPointMenu = "#app-";
        String nextMenu = "li.selected+*";
        String headerCssSelector = "td#content h1";

        LoginAdmin(new LoginData("admin", "admin"));

        wd.findElement(By.cssSelector(fistPointMenu)).click();
        assert wd.findElement(By.cssSelector(headerCssSelector)).isDisplayed();
        do {
            wd.findElement(By.cssSelector(nextMenu)).click();
            assert wd.findElement(By.cssSelector(headerCssSelector)).isDisplayed();

        } while (isElementPresent(wd, nextMenu));
    }

        boolean isElementPresent(WebDriver wd, String cssSelector) {
            try {
                wd.findElement(By.cssSelector(cssSelector));
                return true;
            } catch (NoSuchElementException ex) {
                return false;
            }
//        Читерский способ ))
//        wd.findElement(By.xpath("//span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[2]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[2]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[2]/ul/li[2]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[4]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[5]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[6]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[7]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[8]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[9]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[3]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[10]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[6]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[7]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[7]/ul/li[2]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[8]/a/span[2]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[8]/ul/li[2]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-shipping > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-payment > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-order_total > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-order_success > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-order_action > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[9]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-order_statuses > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[10]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[11]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-most_sold_products > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-most_shopping_customers > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[12]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-defaults > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-general > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-listings > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-images > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-checkout > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-advanced > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-security > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[13]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[14]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-tax_rates > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[15]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-scan > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[16]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[17]")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
//        wd.findElement(By.xpath("//li[3]/a/span")).click();
//        assert wd.findElement(By.cssSelector("#content > h1")).isDisplayed();
    }

}
