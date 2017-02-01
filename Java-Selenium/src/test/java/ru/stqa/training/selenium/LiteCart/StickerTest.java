package ru.stqa.training.selenium.LiteCart;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sakar on 01.02.2017.
 */
public class StickerTest extends TestBase {
    @Test
    public void stickerTest() {
        wd.get("http://localhost/litecart/public_html/en/");
        List<WebElement> pictures = wd.findElements(By.cssSelector("li.product"));
        List<WebElement> stickers = wd.findElements(By.cssSelector("div.sticker"));
        Assert.assertEquals(pictures.size(), stickers.size());
    }

}
