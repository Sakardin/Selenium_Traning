package ru.stqa.training.selenium.LiteCart;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LoginLocal extends TestBase {

    @Test
    public void LoginAdmin(){
        wd.get("http://localhost/litecart/admin/login.php");
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("login")).click();
        wait.until(titleIs("My Store"));
    }

}
