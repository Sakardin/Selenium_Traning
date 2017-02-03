
const {Builder, By, until} = require('selenium-webdriver');
const test = require("selenium-webdriver/testing");

test.describe('Local Login', function() {

  let driver;

  test.before(function *() {
    driver = new Builder().forBrowser('chrome').build();
  });

   test.it('Login Local', function*() {
    driver.get('http://localhost/litecart/admin/login.php');
    driver.findElement(By.name('username')).sendKeys('admin');
    driver.findElement(By.name('password')).sendKeys('admin');
    driver.findElement(By.name('login')).click();
    driver.wait(until.titleIs('My Store'), 1000);
  });

  test.after(function(){
      driver.quit();
      }
    );
});
