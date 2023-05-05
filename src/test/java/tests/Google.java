package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) {

        System.out.println("Hello");

        WebDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "/Users/eldiiaramanturo/Desktop");

        driver.get("https://google.com");
        String expectedGoogleTitle = "Hi, Google!";

        //System.out.println(driver.getTitle());
        if (driver.getTitle().equals (expectedGoogleTitle)){
            System.out.println("Google title passed");


        }
        else{
            System.out.println("Google title test didn't pass");
        }


        driver.navigate().to("https://amazon.com");//get(url) for first but same doing
       // System.out.println(driver.getTitle());
       if (driver.getTitle().equals("Hi amazon")){
           System.out.println("Amazon title passed");
       }
       else{
           System.out.println("Amazon title test didn't pass");
       }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();




//        WebDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://chrome.com");
//        chromeDriver.quit();
//
//        chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://super.kg");
//        chromeDriver.quit();




    }
}
