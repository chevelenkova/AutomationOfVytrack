package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Model;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Vehicles;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement VehicleOdometer;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement VehicleCosts;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement VehicleContracts;

    @FindBy(xpath = "//span[.='Vehicles Fuel Logs']")
    public WebElement VehiclesFuelLogs;

    @FindBy(xpath = "//span[.='Vehicle Services Logs']")
    public WebElement VehicleServicesLogs;

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement VehiclesModel;
}
