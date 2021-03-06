package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

public class HomePageTest extends HomePage {
    //    @Test
//    public void testCheckSearchBox() {
//        checkSearchBox();
//        String expectedText = "\"Mask\"";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
//        Assert.assertEquals(actualText, expectedText, "product does not match");
//    }
//
//    @Test
//    public void testPageTitle(){
//        String expectedText="Amazon.com: Ring Video Doorbell – newest generation, 2020 release – 1080p HD video, improved motion detection, easy installation – Satin Nickel: Amazon Devices";
//        String actualText= driver.getTitle();
//        Assert.assertEquals("actualText","expectedText","product does not match");
//
//
//    }
    @Test(priority = 1)
    public void testBestSallers() throws InterruptedException {
        checkBestSallers();
        String expectedText = "Amazon.com Best Sellers: The most popular items on Amazon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "product does not match");
        //Thread.sleep(5000);

    }


    @Test(priority = 2)
    public void testCheckCameraAndPhotoLocator() {
        checkcameraAndPhotoLocator();
        String expectedText = "Amazon Best Sellers: Best Camera";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "product does not match");
        //String expectedText1 = "Camera & Photo";
    }

    @Test(priority = 3)
    public void testCheckBaby() {
        checkBaby();
        String expectedText = "Amazon Best Sellers: Best Baby";
        String actualText = driver.getTitle();
        // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(priority = 4)
    public void testcheckAll() {
        checkAll();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        // System.out.println("ActualResult: "+actualText);
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(priority = 5)
    public void testcheckAmazonHome() {
        checkAmazonHome();
        String expectedText = "Shop Amazon Home Products";
        String actualText = driver.getTitle();
        // System.out.println("Actual Text: "+actualText);
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(priority = 6)
    public void testcheckShoppingCart() {
        checkShoppingCart();
        String expectedText = "0\n" + "Cart";
        String actualText = driver.findElement(By.cssSelector(shoppingCartLocator)).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 7)
    public void testcheCkShopTodayDeals() {
        checkShopTodayDeals();
        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 8)
    public void testCheckToysAndGames() {
        checkToysAndGame();
        String expectedText = "Toys & Games";
        String actualText = driver.findElement(By.cssSelector(toysAndGameLocator)).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "failed");
    }


    @Test(priority = 9)
    public void testcheckShopByAge() {
        checkShopByAge();
        String expectedText = "Birth to 24 Months";
        String actualText = driver.findElement(By.xpath(birthTo24MonthsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 10)
    public void testcheck2To4Years() {
        check2To4Years();
        String expectedText = "2 to 4 Years";
        String actualText = driver.findElement(By.xpath(twoTofourYearsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "failed");
    }

    @Test(priority = 11)
    public void test5To7Years() {
        check5To7Years();
        String expectedText = "5 to 7 Years";
        String actualText = driver.findElement(By.xpath(fiveTo7YearsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "failed");
    }

    @Test(priority = 12)
    public void testeigthTo13Years() {
        checkEightTo13Years();
        String expectedText = "8 to 13 Years";
        String actualText = driver.findElement(By.xpath(eightTo13YearsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "failed");

    }

    @Test(priority = 13)
    public void testcheck14YearsAndUp() {
        check14YearsAndUp();
        String expectedText = "14 Years & Up";
        String actualText = driver.findElement(By.xpath(fourteenYearsAndUpLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "failed");
    }

    @Test(priority = 14)
    public void testcheckamazonFresh() {
        checkAmazonFresh();
        String expectedText = "Amazon Fresh";
        String actualText = driver.findElement(By.xpath(amazonFreshLocator)).getText();
        //System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "failed");
    }

    @Test(priority = 15)
    public void testcheckBeverages() throws InterruptedException {
        checkBeverages();
        String expectedText = "Amazon.com: Beverages: Amazon Fresh";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 16)
    public void testcheckBreadsAndBakery() throws InterruptedException {
        checkBreadsAndBakery();
        String expectedText = "Amazon.com: Breads & Bakery: Amazon Fresh";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 17)
    public void testcheckFrozen() throws InterruptedException {
        checkFrozen();
        String expectedText = "Amazon.com: Frozen: Amazon Fresh";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 18)
    public void testcheckFruits() throws InterruptedException {
        checkFruits();
        String expectedText = "Amazon.com: Fruits: Amazon Fresh";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 19)
    public void testcheckHobbies() {
        checkHobbies();
        String expectedText = "Slot Cars, Race Tracks & Accessories";
        String actualText = driver.findElement(By.xpath(hobbiesLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 20)
    public void testcheckartAndCrafts() {
     checkartAndCrafts();
        String expectedText = "Arts & Crafts Supplies";
        String actualText = driver.findElement(By.xpath(artAndCraftsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 21)
    public void testcheckkidsElectonics() {
        checkkidsElectonics();
        String expectedText = "Kids' Electronics";
        String actualText = driver.findElement(By.xpath(kidsElectonicsLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 22)
    public void testkidsElectonics(){
        checkmarvel();
        String expectedText = "Marvel";
        String actualText = driver.findElement(By.xpath(marvelLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }

    @Test(priority = 23)
    public void testcheckAutomotive(){
      checkAutomotive();
        String expectedText = "Amazon Best Sellers: Best Automotive";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }

    @Test(priority = 24)
    public void testcheckGiftCards(){
        checkGiftCards();
        String expectedText = "Amazon Best Sellers: Best Gift Cards";
        String actualText = driver.getTitle();
        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }
    @Test(priority = 25)
    public void testcheckPrimeVideo(){
        checkPrimeVideo();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
       // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }


    @Test(priority = 26)
    public void testcheckamazonMusic(){
      checkamazonMusic();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }

    @Test(priority = 27)
    public void testcheckBuildingToys(){
    checkBuildingToys();
    String expectedText = "Amazon.com : Building Toys";
    String actualText = driver.getTitle();
    // System.out.println(actualText);
    Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 28)
    public void testcheckbabyAndToddlerToys(){
        checkbabyAndToddlerToys();
        String expectedText = "Amazon.com: Baby & Toddler Toys: Toys & Games: Early Development & Activity Toys, Bath Toys, Musical Toys & More";
        String actualText = driver.getTitle();
        // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 29)
    public void testcheckPuzzles(){
        checkPuzzles();
        String expectedText = "Amazon.com : Puzzles";
        String actualText = driver.getTitle();
        // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 20)
    public void testcheckToyFiguresAndPlaySets(){
        checkToyFiguresAndPlaySets();
        String expectedText = "Amazon.com : Toy Figures & Playsets";
        String actualText = driver.getTitle();
        // System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }





























//    @Test
//    public void testchecklocalMarket() throws InterruptedException {
//        checklocalMarket();
//        String expectedText="Local Market";
//        String actualText=driver.findElement(By.xpath("//div[@id=\"hmenu-container\"]//div[@id=\"hmenu-content\"]//ul[11]//li[18]//a[1]")).getText();
//        System.out.println(actualText);
//       Assert.assertEquals(actualText, expectedText, "Product does not match");
////
//        String expectedText ="Local Market";
//        String actualText = driver.getTitle();
//        System.out.println(actualText);
//       Assert.assertEquals(actualText, expectedText, "Product does not match");
//
    //}






}













































