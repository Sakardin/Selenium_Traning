package ru.stqa.training.selenium.LiteCart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;
import java.util.Set;

/**
 * Created by Sakardin on 20.02.2017.
 */
public class ExternalLinksTest extends LoginLocal {

    @Test
    public void externalLinksTest(){
        LoginAdmin(new LoginData("admin", "admin"));
        wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        wd.findElement(By.cssSelector("#content > form > table > tbody > tr:nth-child(2) > td:nth-child(5) > a")).click();
        List<WebElement> externalLinks = wd.findElements(By.cssSelector(".fa-external-link"));
        for (WebElement link: externalLinks) {
            String mainWindow = wd.getWindowHandle();
            Set<String> oldWindows = wd.getWindowHandles();

            link.click();
            wait.until(anyWindowOtherThan(oldWindows));
            String newWindow = wait.until(anyWindowOtherThan(oldWindows));
            wd.switchTo().window(newWindow);
            wd.close();
            wd.switchTo().window(mainWindow);


        }

    }

    public ExpectedCondition<String>anyWindowOtherThan(Set<String> oldWindow) {
        return new ExpectedCondition<String>() {
                public String apply(WebDriver wd) {
                Set<String> handles = wd.getWindowHandles();
                handles.removeAll(oldWindow);
                return handles.size() > 0 ? handles.iterator().next() : null;
            }
        };
    }


}
