package SeleniumJavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJavaClass {
    public static void main(String[] args){
        try {
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\firefox\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            //comment the above 2 lines and uncomment below 2 lines to use Chrome
            //System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chrome\\chromedriver.exe");
            //WebDriver driver = new ChromeDriver();

            String baseUrl = "http://automationpractice.com/index.php";
            String expectedTitle = "My Store";
            String actualTitle = "";
            String tagName = "";

            // launch Firefox and direct it to the Base URL
            driver.get(baseUrl);

            // get the actual value of the title
            actualTitle = driver.getTitle();
            System.out.println(actualTitle);

            // get the actual value of the tag of the login class
            tagName = driver.findElement(By.className("login")).getTagName();
            System.out.println(tagName);

            // click on login
            driver.findElement(By.className("login")).click();

            /*
             * compare the actual title of the page with the expected one and print
             * the result as "Passed" or "Failed"
             */
            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }

            //close Firefox
            //driver.close();
        } catch(Exception e){
            System.out.println("Algo salió mal");
            System.out.println(e);
            throw e;
        }
    }
}
