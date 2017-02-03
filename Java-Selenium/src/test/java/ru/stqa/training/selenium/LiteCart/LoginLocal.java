package ru.stqa.training.selenium.LiteCart;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LoginLocal extends TestBase {


    public void LoginAdmin(LoginData loginData){
        wd.get("http://localhost/litecart/admin/login.php");
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys(loginData.getName());
        wd.findElement(By.name("password")).sendKeys(loginData.getPass());
        wd.findElement(By.name("login")).click();
        wait.until(titleIs("My Store"));
    }

}
