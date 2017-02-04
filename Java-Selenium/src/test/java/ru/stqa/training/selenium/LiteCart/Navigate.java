package ru.stqa.training.selenium.LiteCart;

/**
 * Created by Sakardin on 02.02.2017.
 */
public class Navigate extends TestBase {

    protected void openPage(String url) {
        wd.get( url );
    }
}
