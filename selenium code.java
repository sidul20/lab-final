/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkgfinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author student_user
 */
public class LabFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.gecko.driver", "/home/student_user/Downloads/geckodriver-v0.33.0-linux64/geckodriver");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        String credentials[][] = {{"Admin", "123"}, {"name**45","Admin123"}, {"Admin", "Admin123"}};
        
        for(int i=0; i<credentials.length; i++){
            driver.get("https://demo.openmrs.org/openmrs");
            Thread.sleep(1000);
            driver.findElement(By.id("username")).sendKeys(credentials[i][0]);
            driver.findElement(By.id("password")).sendKeys(credentials[i][1]);
            driver.findElement(By.id("Inpatient Ward")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("loginButton")).click();
            
            if(driver.getTitle().equals("Home")){
                System.out.println("Login Successful!");
            }else{
                System.out.println("Login Failed!");
            }
        }
        
        
    }
    
}

