package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;//its comes from selenium jar
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageOld {
    public static  void main(String[] args) throws InterruptedException {
        String amazonURL="https://www.amazon.com/";
        String productName="Mask";
        String searchBoxLocator="twotabsearchtextbox";
        String searchButtonLocator="nav-search-submit-button";


//        //chrombrowser
//        String chromeDrivePath="BrowserDriver/windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",chromeDrivePath);
//        WebDriver driver = new ChromeDriver();//this mean that i want to automate a chrome driver
//        //the driver url for any app
//        driver.get("https://www.amazon.com/");

//        //fireFox browser
//        String fireFoxDriverPath="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
//        WebDriver dr=new FirefoxDriver();
//        dr.get("https://www.amazon.com/");//should have the https://
//
//        //Edge browser
//        String edgeDriverPath="BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver",edgeDriverPath);
//        WebDriver dri=new EdgeDriver();
//        dri.get("https://www.amazon.com/");


        //chrombrowser
//        String chromeDrivePath="BrowserDriver/windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",chromeDrivePath);
//        WebDriver driver = new ChromeDriver();//this mean that i want to automate a chrome driver
//
//        //the driver url for any app
//        driver.get(amazonURL);
//        driver.manage().window().maximize();//maximize the screen
//        driver.manage().deleteAllCookies();//cookies means if you have Any information will be delete
//        //automation by using id value
//        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);//the id value should be unique if it not should use another attribute
//        driver.findElement(By.id(searchButtonLocator)).click();
//
//
//
//
//
//       Thread.sleep(5000);//wait time for 5 second
//        driver.close();//once the window it show up it gonna close automatically
//        //if the the id option is note unique and it and in so we can use
//        //right click on the id and copy select and past in footer for check if it is uniq or no





    }


}
