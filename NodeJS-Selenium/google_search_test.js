
const {Builder, By, until} = require('selenium-webdriver');
const test = require("selenium-webdriver/testing");

test.describe('Google Search', function() {
  let driver;

  test.before(function *() {
    driver = yield new Builder().forBrowser('chrome').build();
  });

  // You can write tests either using traditional promises.
  // it('works with promises', function() {
  //  return driver.get('http://www.google.com')
  //      .then(_ => driver.findElement(By.name('q')).sendKeys('webdriver'))
  //      .then(_ => driver.findElement(By.name('btnG')).click())
  //      .then(_ => driver.wait(until.titleIs('webdriver - Google Search'), 1000));
  //  });


  test.it('works with generators', function*() {
    driver.get('http://www.google.com/ncr');
    driver.findElement(By.name('q')).sendKeys('webdriver');
    driver.findElement(By.name('btnG')).click();
    driver.wait(until.titleIs('webdriver - Google Search'), 1000);
  });

  test.after(function(){
      driver.quit();
      }
    );
});
