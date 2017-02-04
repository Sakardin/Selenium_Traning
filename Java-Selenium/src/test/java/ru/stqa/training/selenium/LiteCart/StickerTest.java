package ru.stqa.training.selenium.LiteCart;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class StickerTest extends Navigate {



    @Test
//    равное количество
    public void stickerTest() {
        openPage( "http://localhost/litecart/public_html/en/" );
        List<WebElement> pictures = wd.findElements(By.cssSelector("li.product"));
        List<WebElement> stickers = wd.findElements(By.cssSelector("div.sticker"));
        Assert.assertEquals(pictures.size(), stickers.size());
    }

    @Test
//    Есть у каждого картинки
    public void stickerInside() {
        openPage( "http://localhost/litecart/public_html/en/" );
        List<WebElement> pics = wd.findElements(By.cssSelector("li.product"));
        for (WebElement pic : pics) {
            assert pic.findElement(By.cssSelector("div.sticker")).isDisplayed();
        }

    }

}
