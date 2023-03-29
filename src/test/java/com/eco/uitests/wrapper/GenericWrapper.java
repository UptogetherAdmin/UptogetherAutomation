package com.eco.uitests.wrapper;

import com.eco.uitests.stepdef.Uptogether.Login;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public abstract class GenericWrapper {
    public WebDriver driver;
    public WebElement element;
    public List<WebElement> elements;
    public static final Logger logger = Logger.getLogger(Login.class);


    public WebElement getWebElement(String locator) {

        int start = locator.indexOf("==");
        String identifier = locator.substring(0, start).toLowerCase();
        String attrValue = locator.substring(start + 2);
        logger.info("attrValue: " + attrValue);

        try {
            if (identifier.equalsIgnoreCase("id")) {
                element = driver.findElement(By.id(attrValue));
            } else if (identifier.equalsIgnoreCase("name")) {
                element = driver.findElement(By.name(attrValue));
            } else if (identifier.equalsIgnoreCase("xpath")) {
                element = driver.findElement(By.xpath(attrValue));
            } else if (identifier.equalsIgnoreCase("css")) {
                element = driver.findElement(By.cssSelector(attrValue));
            } else if (identifier.equalsIgnoreCase("link")) {
                element = driver.findElement(By.linkText(attrValue));
            } else if (identifier.equalsIgnoreCase("partiallink")) {
                element = driver.findElement(By.partialLinkText(attrValue));
            } else if (identifier.equalsIgnoreCase("tagname")) {
                element = driver.findElement(By.tagName(attrValue));
            } else if (identifier.equalsIgnoreCase("classname")) {
                element = driver.findElement(By.className(attrValue));
            } else {
                logger.error("No such object exists ");
            }
        } catch (NoSuchElementException e) {
            logger.error(" No Element  found ");
            logger.error(e);
            Assert.fail("FAIL: Element  <" + locator + ">", e);
        } catch (ElementNotVisibleException notvisible) {
            logger.error("Element not visible ");
            Reporter.log("</p><b><font color='red'>" + "Test Method getWebElement Failed... "
                    + ":  FAILED</p></i></b></b>\n", true);
            Reporter.log("Error: " + notvisible);
            return null;
        }
        return element;
    }

    public List<WebElement> getWebElements(String locator) {

        int start = locator.indexOf("==");
        String identifier = locator.substring(0, start).toLowerCase();
        String attrValue = locator.substring(start + 2);
        logger.info("attrValue: " + attrValue);

        try {
            if (identifier.equalsIgnoreCase("id")) {
                elements = driver.findElements(By.id(attrValue));
            } else if (identifier.equalsIgnoreCase("name")) {
                elements = driver.findElements(By.name(attrValue));
            } else if (identifier.equalsIgnoreCase("xpath")) {
                elements = driver.findElements(By.xpath(attrValue));
            } else if (identifier.equalsIgnoreCase("css")) {
                elements = driver.findElements(By.cssSelector(attrValue));
            } else if (identifier.equalsIgnoreCase("link")) {
                elements = driver.findElements(By.linkText(attrValue));
            } else if (identifier.equalsIgnoreCase("partiallink")) {
                elements = driver.findElements(By.partialLinkText(attrValue));
            } else if (identifier.equalsIgnoreCase("tagname")) {
                elements = driver.findElements(By.tagName(attrValue));
            } else if (identifier.equalsIgnoreCase("classname")) {
                elements = driver.findElements(By.className(attrValue));
            } else {
                logger.error("No such object exists ");
            }
        } catch (NoSuchElementException e) {
            logger.error(" No Element  found ");
            logger.error(e);
            Assert.fail("FAIL: Element  <" + locator + ">", e);
        } catch (ElementNotVisibleException notvisible) {
            logger.error("Element not visible ");
            Reporter.log("</p><b><font color='red'>" + "Test Method getWebElement Failed... "
                    + ":  FAILED</p></i></b></b>\n", true);
            Reporter.log("Error: " + notvisible);
            return null;
        }
        return elements;
    }

    public long fnGetSize(String locator) {

        return getWebElements(locator).size();

    }

    public String fnGetText(String locator) throws IOException {
        String text = null;
        try {
            fnWaitPresenceOfElement(locator,driver);
            text = getWebElement(locator).getText();
        } catch (Exception e) {
            logger.error("FAIL: Element <" + locator + "> not present");
            logger.info("Element <" + locator + "> not present on screen? -> \n");
            Assert.fail("FAIL: Element  <" + locator + ">", e);
        }
        return text;
    }

    public boolean isElementPresents(String locator) {
        return getWebElements(locator).size() > 0;
    }

    public By getWebBy(String locator) {
        int start = locator.indexOf("==");
        String identifier = locator.substring(0, start).toLowerCase();
        String attrValue = locator.substring(start + 2);
        logger.info("attrValue: " + attrValue);
        By by = null;

        try {
            if (identifier.equalsIgnoreCase("id")) {
                by = By.id(attrValue);
            } else if (identifier.equalsIgnoreCase("name")) {
                by = By.name(attrValue);
            } else if (identifier.equalsIgnoreCase("xpath")) {
                by = By.xpath(attrValue);
            } else if (identifier.equalsIgnoreCase("css")) {
                by = By.cssSelector(attrValue);
            } else if (identifier.equalsIgnoreCase("link")) {
                by = By.linkText(attrValue);
            } else if (identifier.equalsIgnoreCase("partiallink")) {
                by = By.partialLinkText(attrValue);
            } else if (identifier.equalsIgnoreCase("tagname")) {
                by = By.tagName(attrValue);
            } else if (identifier.equalsIgnoreCase("classname")) {
                by = By.className(attrValue);
            } else {
                logger.error("No such object exists ");
            }
        } catch (NoSuchElementException e) {
            logger.error(" No Element  found ");
            logger.error(e);
            Assert.fail("FAIL: Element  <" + locator + ">", e);
        } catch (Exception e) {
            logger.error(" Exception ");
            logger.error(e);
        }
        return by;

    }

    public By getWebByConst(String locator)
    {
        By by = By.id(locator);
        System.out.println("the locator is"+locator);
        return by;
    }
    public void elementToBeClickable(WebDriver driver, String locator) {

        WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.elementToBeClickable(getWebBy(locator)));

    }

    public void visibilityOfWrapper(String locator, WebDriver driver) {
       WebDriverWait wait = new WebDriverWait((driver), 10);
       wait.until(visibilityOfElementLocated(getWebBy(locator)));
    }

    public void fnWaitInvisibility(WebDriver driver, String locator) {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(invisibilityOfElementLocated(getWebBy(locator)));
    }
    public void fnWaitInvisibility1(WebDriver driver, String locator) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 90);
        wait.until(ExpectedConditions.presenceOfElementLocated(getWebBy(locator)));
        wait.until(invisibilityOfElementLocated(getWebBy(locator)));
        Thread.sleep(2000);
    }

    public WebElement fnWaitVisibility(WebDriver driver, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
         return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(locator)));
    }

    public void fnWaitForThePresence(WebDriver driver,String locator,int time)
    {
        WebDriverWait wait = new WebDriverWait((driver),time);
       wait.until(visibilityOfAllElementsLocatedBy(getWebByConst(locator)));

    }

    public void fnWaitPresenceOfElement(String locator,WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(presenceOfElementLocated(getWebBy(locator)));

    }



   // public void fnWaitPresenceOfElement(String locator, long waitTime) {

    public void fnWaitPresenceOfElementWeb(WebDriver driver, String locator, long waitTime) {


       WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(presenceOfElementLocated(getWebBy(locator)));
    }

    public void fnEdit(String locator, String sData) throws IOException {
        try {
            elementToBeClickable(driver, locator);
            element = getWebElement(locator);
            element.clear();
            element.sendKeys(sData);
            logger.info("Textbox " + locator + " is input with data " + sData);
        } catch (StaleElementReferenceException stale) {
            System.out.println("Stale Element");
            fnEdit(locator, sData);
        } catch (Exception e) {
            logger.error("FAIL: Type in textbox <" + locator + "> with data <" + sData + ">");
            logger.info("Is Textbox <" + locator + "> present on screen? -> " + element + "\n");
            Assert.fail("FAIL: Type in textbox <" + locator + "> with data <" + sData + ">", e);
        }

    }

    public void fnEnter(String locator) throws IOException {
        try {
            elementToBeClickable(driver, locator);
            getWebElement(locator).sendKeys(Keys.ENTER);
            logger.info("Button " + locator + " is Clicked .");
        } catch (Exception e) {
            logger.error("FAIL: Button <" + locator + ">");
            logger.info("Is Button <" + locator + "> present on screen? -> " + element + "\n");
            Assert.fail("FAIL: Button <" + locator + ">", e);
        }

    }

    public void fnButton(String locator) throws IOException {
        try {
            elementToBeClickable(driver, locator);
            getWebElement(locator).click();
            logger.info("Button " + locator + " is Clicked .");
        } catch (StaleElementReferenceException stale) {
            System.out.println("Stale Element");
            fnButton(locator);
        } catch (Exception e) {
            logger.error("FAIL: Button <" + locator + ">");
            logger.info("Is Button <" + locator + "> present on screen? -> " + element + "\n");
            Assert.fail("FAIL: Button <" + locator + ">", e);
        }

    }


    public String fnTimeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("yyMMddssmmHH");
        java.util.Date date = new java.util.Date();
        String dateStr = dateFormat.format(date);
        return (dateStr);
    }

    public void fnCloseDriver() {
        driver.close();
        logger.info("Driver closed.....");
        driver.quit();

    }

    public void fnRefreshPage() throws IOException {
        try {
            driver.navigate().refresh();
            logger.info("Refreshing page");
        } catch (Exception e) {
            logger.error("FAIL: Refreshing page");
            Assert.fail("FAIL:Refreshing page");
        }
    }

    public void fnActionClick(String locator) {

        Actions action = new Actions(driver);
        action.moveToElement(getWebElement(locator)).click().perform();

    }

    public void fnNewTab(String url) {

        ((JavascriptExecutor) driver).executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        driver.get(url);
    }

    public void fnSwitchToNewTab() {

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1)); //switches to new tab

    }


    /*public String fnJsonToString(String filepath) {
        String filePath = System.getProperty("user.dir") + "/" + prop.getProperty("jsonFiles") + filepath;
        System.out.println(filePath);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            Object object = parser
                    .parse(new FileReader(filePath));

            //convert Object to JSONObject
            jsonObject = (JSONObject) object;


        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject.toString();

    }*/

    public void javaScriptExecutor(WebDriver driver, String params) {

        ((JavascriptExecutor) driver).executeScript(params);
    }

    public void fnScrollIntoView(String locator) {

        fnWaitPresenceOfElement(locator,driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", getWebElement(locator));

    }

    public void fnNavigateTo(String Url) {
        driver.navigate().to(Url);
    }

    public void fnClear(String locator) {

        elementToBeClickable(driver, locator);
        element = getWebElement(locator);
        element.click();
        element.clear();

    }

    public String fnGetAttribute(String locator, String attrName) throws IOException {
        String attr = null;
        try {
            getWebElement(locator);
            if (element.isDisplayed()) {
                attr = element.getAttribute(attrName);

            }
        } catch (Exception e) {
            Assert.fail("FAIL: Element  <" + locator + ">", e);
        }
        return attr;
    }

    /*public void fnFluentWait(WebDriver driver, final String element) {
        final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(ElementClickInterceptedException.class);
        WebElement example = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(element));
            }
        });
    }*/
}
