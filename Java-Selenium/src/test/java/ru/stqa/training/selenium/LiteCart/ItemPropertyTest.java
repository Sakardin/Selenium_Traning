package ru.stqa.training.selenium.LiteCart;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by sakar on 03.02.2017.
 */
public class ItemPropertyTest extends Navigate{


    @Test

    public void itemPropertyTest(){
// HP Duck
        openPage( "http://localhost/litecart/en/" );
        WebElement homePageDuck = wd.findElement( By.cssSelector( "#box-campaigns > div > ul > li " ) );
        String mainDuckText = homePageDuck.findElement(By.className("name")).getText() ;
        String mainDuckRegularPrice = homePageDuck.findElement( By.className( "regular-price" ) ).getText();
        String mainDuckCompainPrice = homePageDuck.findElement( By.className( "campaign-price" ) ).getText();
        String mainDuckCompainPriceStrong = homePageDuck.findElement( By.className( "campaign-price" ) ).getTagName();
        String colorRegularPrice = homePageDuck.findElement( By.className( "regular-price" ) ).getCssValue( "color" );
        String colorCompainPrice = homePageDuck.findElement( By.className( "campaign-price" ) ).getCssValue( "color" );
        String lineRegularPrice = homePageDuck.findElement( By.className( "regular-price" ) ).getTagName();
//        String dimensionRegularPrice = homePageDuck.findElement( By.className( "regular-price" ) ).getAttribute( "font-size" );

//        assert dimensionRegularPrice.equals("0.8em");
        assert lineRegularPrice.equals( "s" );
        assert mainDuckCompainPriceStrong.equals( "strong" );


//        Detail Page Duck
        homePageDuck.click();
        wait.until(titleContains( mainDuckText ));
        String detailDuckText = wd.findElement( By.cssSelector( "h1.title" ) ).getText();
        String detailDuckReguralPrice = wd.findElement( By.cssSelector( ".regular-price" ) ).getText();
        String detailDuckCompainPrice = wd.findElement( By.cssSelector( ".campaign-price" ) ).getText();
        String detailDuckCompainPriceStrong = wd.findElement( By.cssSelector( ".campaign-price" ) ).getTagName();
        String detailLineRegularPrice = wd.findElement( By.className( "regular-price" ) ).getTagName();
//        String sizeRegularPrice = wd.findElement(By.cssSelector("regular-price")).getAttribute("font-size");


        assert mainDuckText.equals( detailDuckText );
        assert mainDuckRegularPrice.equals( detailDuckReguralPrice );
        assert mainDuckCompainPrice.equals( detailDuckCompainPrice );
        assert detailLineRegularPrice.equals( "s" );
        assert detailDuckCompainPriceStrong.equals( "strong" );
//        assert sizeRegularPrice.equals("16px");


    }
}
