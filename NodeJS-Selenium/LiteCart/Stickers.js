const {Builder, By, until} = require('selenium-webdriver');
const test = require("selenium-webdriver/testing");

test.describe('Local Login', function() {

    let driver;

    test.before(function *() {
        driver = new Builder().forBrowser('chrome').build();
    });


    test.it('find sticker', function*(){
        driver.get('http://localhost/litecart/');
        driver.wait(until.titleIs('Online Store | My Store'), 1000);
        var pics = driver.findElements(By.css("li.product"));
        var sticks = driver.findElements(By.css("div.sticker"));
        assertEqual(pics.length(), sticks.length());
    });


    test.after(function(){
            driver.quit();
        }
    );

});