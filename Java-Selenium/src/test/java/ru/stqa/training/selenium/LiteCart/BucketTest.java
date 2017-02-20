package ru.stqa.training.selenium.LiteCart;

import com.google.common.base.Predicate;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

/**
 * Created by Sakardin on 16.02.2017.
 */
public class BucketTest extends Navigate {

    @Test
    public void bucketTest(){
        openPage("http://localhost/litecart/en/");
        for(int i = 0; i<3; i++) {
            wd.findElement(By.cssSelector("#box-most-popular > div > ul > li:nth-child(1)")).click();
            WebElement count = wd.findElement(By.cssSelector("span.quantity"));

            int item = Integer.parseInt(count.getText());
            if (isElementPresent(wd, "select")){
                new Select(wd.findElement(By.cssSelector("select"))).selectByVisibleText("Small");
            }
            wd.findElement(By.cssSelector("button[value='Add To Cart']")).click();
            wait.until(textToBePresentInElement(count, String.valueOf(item+1)));

            wd.findElement(By.cssSelector("img[title='My Store']")).click();
        }
        wd.findElement(By.cssSelector("#cart")).click();
        wait.until(urlContains("/checkout"));


        while (isElementPresent(wd, "#box-checkout-cart > ul > li:nth-child(1)")) {

            wd.findElement(By.cssSelector("#box-checkout-cart > ul > li:nth-child(1)")).click();
            wd.findElement(By.cssSelector("button[name='remove_cart_item']")).click();
            WebElement table = wd.findElement(By.cssSelector(".dataTable tBody > tr:nth-child(3)"));
            wait.until(stalenessOf(table));
        }

        wd.findElement(By.cssSelector("button[name='remove_cart_item']")).click();
        WebElement table = wd.findElement(By.cssSelector(".dataTable tBody > tr:nth-child(3)"));
        wait.until(stalenessOf(table));
        String empty = wd.findElement(By.cssSelector("p:nth-child(1) > em")).getText();
        Assert.assertEquals(empty, "There are no items in your cart.");


    }
    boolean isElementPresent(WebDriver wd, String cssSelector) {
        try {
            wd.findElement(By.cssSelector(cssSelector));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return false;
        }
    }
}
