package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.CompareTwoLists;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US1_TruckDriver_can_see_all_vehicles {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("user150"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submitBtn.click();
    }

    @Test
    public void truck_driver_can_see_all_vehicles(){

        HomePage homePage = new HomePage();

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(homePage.fleetModule).perform();

        List<WebElement> fleetList = Driver.getDriver().findElements(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1'])[1]//a/span"));
        ArrayList<String> fleetListExpected = new ArrayList<>(Arrays.asList("Vehicles", "Vehicle Odometer", "Vehicle Costs", "Vehicle Contracts","Vehicles Fuel Logs", "Vehicle Services Logs", "Vehicles Model"));
        CompareTwoLists.CompareTwoLists(fleetList,fleetListExpected);

        homePage.Vehicles.click();

        List<WebElement> allCarsInfoActual = Driver.getDriver().findElements(By.xpath("//tr[@class='grid-header-row']/th"));
        ArrayList<String> allCarsInfoExpected = new ArrayList<>(Arrays.asList("LICENSE PLATE", "TAGS", "DRIVER", "LOCATION", "CHASSIS NUMBER", "MODEL YEAR", "LAST ODOMETER", "IMMATRICULATION DATE", "FIRST CONTRACT DATE", "CVVI", "SEATS NUMBER", "DOORS NUMBER", "COLOR", "TRANSMISSION", "FUEL TYPE", "CO2 EMISSIONS", "HORSEPOWER", "HORSEPOWER TAXATION", "POWER (KW)",""));

        CompareTwoLists.CompareTwoLists(allCarsInfoActual,allCarsInfoExpected);


    }
}
