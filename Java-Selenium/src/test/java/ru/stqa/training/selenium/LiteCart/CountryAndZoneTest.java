package ru.stqa.training.selenium.LiteCart;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by Sakardin on 06.02.2017.
 */


public class CountryAndZoneTest extends LoginLocal {

    @Before
    public void Login() {
        LoginAdmin(new LoginData("admin", "admin"));

        wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");
//        List<WebElement> countris = new ArrayList<>();
//        countris.add((WebElement) wd.findElements(By.cssSelector("tr.row")));
    }

    @Test
    public void countryTest(){

//        wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        List<WebElement> countris =  wd.findElements(By.cssSelector("tr.row > td:nth-child(5) a"));
        ArrayList<String> contryName = new ArrayList<>();
        for (WebElement country: countris)  {

          contryName.add(country.getText());
        }
        ArrayList<String> sortedCounteys = new ArrayList<>(contryName);
        Collections.sort(sortedCounteys);
        assert contryName.equals(sortedCounteys);
    }

    @Test
    public void zoneTest() throws InterruptedException {
//        wd.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        List<WebElement> contris = wd.findElements(By.cssSelector("tr.row"));
        List<String> zones = new ArrayList<>();
        for (WebElement contri: contris){
            int contriZoneInt = Integer.parseInt(contri.findElement(By.cssSelector("td:nth-child(6)")).getText());
            if(contriZoneInt != 0){

                zones.add(contri.findElement(By.cssSelector("a")).getAttribute("href"));
            }
        }

        for (String zone: zones) {
            wd.get(zone);
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
            List<WebElement> zoneList = wd.findElements(By.cssSelector("#table-zones > tbody > tr > td:nth-child(3)"));

            List<String> zoneName = new ArrayList<>();
            for (WebElement zoneSingle : zoneList) {
                zoneName.add(zoneSingle.getText());
            }
            zoneName.remove(zoneName.size() - 1);

            List<String> sortedZones = new ArrayList<>(zoneName);

            Collections.sort(sortedZones);
            assert zoneName.equals(sortedZones);
        }


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
