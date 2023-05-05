package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cashwise {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver() ;

              driver.get("https://cashwise.us");
              driver.manage().window().maximize();
            String expectedCashwiseTitle = "Cashwise is the best!";
            String expectedCashwiseURL = "https://cashwise.us/home";
          if (driver.getTitle().equals(expectedCashwiseTitle)){
              System.out.println("Cashwise title passed");

          }
          else {
              System.out.println(" title Failed");
          }
          if (driver.getCurrentUrl().equals(expectedCashwiseURL)){
              System.out.println("Cashwise url passed");

          }
          else{
              System.out.println("url Failed");
          }



        }
    }

