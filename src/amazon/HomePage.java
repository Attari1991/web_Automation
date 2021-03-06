package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class HomePage {
//    WebDriver driver;
//    String amazonURL="https://www.amazon.com/";
//    String productName="Mask";
//    String searchBoxLocator="twotabsearchtextbox";
//    String searchButtonLocator="nav-search-submit-button";
//
//    @BeforeMethod//this one help to execute this methode before test cases execution
//    public void setUp(){
//        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get(amazonURL);
//    }
//
//
//        public void checkSearchBox () {
//            driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
//            driver.findElement(By.id(searchButtonLocator)).click();
//
//
//        }
//
//        @AfterMethod
//        public void tearDwn () {
//            //driver.close();
//            driver.quit();}
     WebDriver driver;
    String amazonURL="https://www.amazon.com/";


    String bestsellerLocator="//div[@id='nav-xshop']//a[contains(text(),'Best Sellers')]";
    //*[@id=\"nav-xshop\"]/a[1]";
    String cameraAndPhotoLocator="//ul[@id='zg_browseRoot']//li[12]";
    String babyLocator="//div[@id='zg']//a[contains(text(),'Baby')]";
    String allLocator="hm-icon-label";
    String amazonHomeLocator="//*[@id=\"nav-xshop\"]/a[12]";
    String shoppingCartLocator="#nav-cart";
    String shopTodayDealsLocator="//*[@id=\"sc-active-cart\"]/div/div/div[2]/div[2]/a";
    String toysAndGameLocator="#nav-xshop > a:nth-child(12)";
    String birthTo24MonthsLocator="//div[@id='s-refinements']//span[contains(text(),'Birth to 24 Months')]";
    String twoTofourYearsLocator="//div[@id=\"s-refinements\"]//span[contains(text(),'2 to 4 Years')]";
    String fiveTo7YearsLocator="//div[@id=\"s-refinements\"]//span[contains(text(),'5 to 7 Years')]";
    String eightTo13YearsLocator="//div[@id=\"s-refinements\"]//span[contains(text(),'8 to 13 Years')]";
    String fourteenYearsAndUpLocator="//div[@id=\"s-refinements\"]//span[contains(text(),'14 Years & Up')]";
    String amazonFreshLocator="//*[@id=\"hmenu-content\"]/ul[1]/li[18]/a";
    String beveragesLocator="//*[@id=\"hmenu-content\"]/ul[11]/li[4]/a" ;
    String breadsAndBakeryLocator="//div[@id='hmenu-content'] //a[contains(text(),'Breads & Bakery')]";
    String DairyAndCheeseAndEggs="#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a";
    String frozenLocator="//*[@id=\"hmenu-content\"]/ul[11]/li[7]/a";
    String fruitsLocator="#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(8) > a";
   // String localMarketLocator="//div[@id=\"hmenu-container\"]//div[@id=\"hmenu-content\"]//a[contains(text(),\"Local Market\")]";
    String hobbiesLocator="//*[@id=\"s-refinements\"]/div[2]/ul/li[9]/span/a/span";
    String artAndCraftsLocator="//div[@id='s-refinements']//span[contains(text(),'Arts & Crafts')]";
    String kidsElectonicsLocator="//div[@id=\"s-refinements\"]//span[contains(text(),\"Kids' Electronics\")]";
    String marvelLocator="//*[@id=\"s-refinements\"]//span[contains(text(),'Marvel')]";
    String automotiveLocator="//div[@id='zg']//*[@id=\"zg_left_col2\"]//a[contains(text(),'Automotive')]";
    String giftcards="//*[@id=\"zg_browseRoot\"]/ul/li[21]/a";
    String primeVideoLocator ="//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div";
    String amazonMusicLocator="//*[@id=\"hmenu-content\"]//div[contains(text(),'Amazon Music')]";
    String buildingToysLocator="//*[@id=\"s-refinements\"]/div[2]/ul/li[4]/span/a/span";
    String babyAndToddlerToys="//*[@id=\"s-refinements\"]/div[2]/ul/li[3]/span/a/span";
    String puzzlesLocator="//*[@id=\"s-refinements\"]/div[2]/ul/li[17]/span/a/span";
    String toyFiguresAndPlaySetsLocator="//*[@id=\"s-refinements\"]/div[2]/ul/li[20]/span/a/span";





    @BeforeMethod//this one help to execute this methode before test cases execution
    public void setUp(){
        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonURL);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }



    public void checkcameraAndPhotoLocator (){
        driver.findElement(By.xpath(bestsellerLocator)).click();
        driver.findElement(By.xpath(cameraAndPhotoLocator)).click();
    }

    public void checkBestSallers(){
        driver.findElement(xpath(bestsellerLocator)).click();
    }

    public void checkBaby() {
        driver.findElement(By.xpath(bestsellerLocator)).click();
        driver.findElement(By.xpath(babyLocator)).click();
    }

    public void checkAll(){
        driver.findElement(By.className(allLocator)).click();
    }

    public void checkAmazonHome () {
        driver.findElement(By.xpath(amazonHomeLocator)).click();

    }
    public void checkShoppingCart(){
        driver.findElement(By.cssSelector(shoppingCartLocator)).click();

    }

    public void checkShopTodayDeals(){
        driver.findElement(By.cssSelector(shoppingCartLocator)).click();
        driver.findElement(By.xpath(shopTodayDealsLocator)).click();

    }


    public void checkToysAndGame(){
        driver.findElement(By.cssSelector(toysAndGameLocator)).click();

    }

    public void checkShopByAge(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();//i did not the name of the value because the sys was confusing between toys & amazon home
       driver.findElement(By.xpath(birthTo24MonthsLocator)).click();
    }

    public void check2To4Years(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(twoTofourYearsLocator)).click();
    }

    public void check5To7Years(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(fiveTo7YearsLocator)).click();
    }


    public void checkEightTo13Years(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(eightTo13YearsLocator)).click();

    }

    public void check14YearsAndUp(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(fourteenYearsAndUpLocator)).click();

    }
    public void checkAmazonFresh(){
        driver.findElement(By.className(allLocator)).click();
        driver.findElement(By.xpath(amazonFreshLocator)).click();
    }

    public void checkBeverages() throws InterruptedException {
        driver.findElement(By.className(allLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonFreshLocator)).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath(beveragesLocator)).click();

    }

    public void checkBreadsAndBakery() throws InterruptedException {
        driver.findElement(By.className(allLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonFreshLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(breadsAndBakeryLocator)).click();
    }


    public void checkDairyAndCheeseAndEggs() throws InterruptedException {
        driver.findElement(By.className(allLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonFreshLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(DairyAndCheeseAndEggs)).click();

    }

    public void checkFrozen() throws InterruptedException {
        driver.findElement(By.className(allLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonFreshLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(frozenLocator)).click();

    }

    public void checkFruits() throws InterruptedException {
        driver.findElement(By.className(allLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(amazonFreshLocator)).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(fruitsLocator)).click();

    }

    public void checkHobbies(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(hobbiesLocator)).click();
    }
    public void checkartAndCrafts(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(artAndCraftsLocator)).click();
    }

    public void checkkidsElectonics(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(kidsElectonicsLocator)).click();
    }

    public void checkmarvel(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(marvelLocator)).click();

    }

    public void checkAutomotive(){
        driver.findElement(By.xpath(bestsellerLocator)).click();
        driver.findElement(By.xpath(automotiveLocator)).click();

    }

    public void checkGiftCards(){
        driver.findElement(By.xpath(bestsellerLocator)).click();
        driver.findElement(By.xpath(giftcards)).click();
    }

    public void checkPrimeVideo(){
        driver.findElement(By.className(allLocator)).click();
        driver.findElement(By.xpath(primeVideoLocator)).click();
    }

    public void checkamazonMusic(){
        driver.findElement(By.className(allLocator)).click();
        driver.findElement(By.xpath(amazonMusicLocator)).click();

    }

    public void checkBuildingToys(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(buildingToysLocator)).click();
    }

    public void checkbabyAndToddlerToys(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(babyAndToddlerToys)).click();
    }

    public void checkPuzzles(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(puzzlesLocator)).click();
    }
    public void checkToyFiguresAndPlaySets(){
        driver.findElement(By.xpath("//a[contains(text(),'Toys & Games')]")).click();
        driver.findElement(By.xpath(toyFiguresAndPlaySetsLocator)).click();
    }























//
////is not working as expected
//    public void checklocalMarket() throws InterruptedException {
//        driver.findElement(By.className(allLocator)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(amazonFreshLocator)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(localMarketLocator)).click();
//
//    }














    @AfterMethod
    public void tearDwn () throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
        driver.quit();
    }












}
