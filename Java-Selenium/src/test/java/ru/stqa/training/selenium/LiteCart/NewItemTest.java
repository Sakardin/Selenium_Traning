package ru.stqa.training.selenium.LiteCart;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by Sakardin on 08.02.2017.
 */
public class NewItemTest extends LoginLocal {


    @Test
    public void newItemTest(){
//        AbsolutePath
        File file = new File("src/Pics/Homer.jpg");
        String filePath = file.getAbsolutePath();

//        Test
        LoginAdmin(new LoginData("admin", "admin"));
        wd.findElement(By.xpath("(//li[@id='app-']/a/span[2])[2]")).click();
        wd.findElement(By.linkText("Add New Product")).click();
        wd.findElement(By.name("name[en]")).clear();
        wd.findElement(By.name("name[en]")).sendKeys("TestDuck");
        wd.findElement(By.name("code")).clear();
        wd.findElement(By.name("code")).sendKeys("12");
        wd.findElement(By.xpath("(//input[@name='product_groups[]'])[3]")).click();
        wd.findElement(By.xpath("(//input[@name='categories[]'])[2]")).click();
        wd.findElement(By.name("quantity")).clear();
        wd.findElement(By.name("quantity")).sendKeys("11");
        new Select(wd.findElement(By.name("sold_out_status_id"))).selectByVisibleText("Sold out");
        wd.findElement(By.name("new_images[]")).sendKeys(filePath);

        wd.findElement(By.linkText("Information")).click();
        new Select(wd.findElement(By.name("manufacturer_id"))).selectByVisibleText("ACME Corp.");
        wd.findElement(By.name("keywords")).clear();
        wd.findElement(By.name("keywords")).sendKeys("test");
        wd.findElement(By.name("short_description[en]")).clear();
        wd.findElement(By.name("short_description[en]")).sendKeys("test");
        wd.findElement(By.name("head_title[en]")).clear();
        wd.findElement(By.name("head_title[en]")).sendKeys("test");
        wd.findElement(By.name("meta_description[en]")).clear();
        wd.findElement(By.name("meta_description[en]")).sendKeys("test");

        wd.findElement(By.linkText("Prices")).click();
        wd.findElement(By.name("purchase_price")).clear();
        wd.findElement(By.name("purchase_price")).sendKeys("110");
        new Select(wd.findElement(By.name("purchase_price_currency_code"))).selectByVisibleText("US Dollars");

//        wd.findElement(By.name("save")).click();
//        wd.get("http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1");
//        wd.


    }
}
