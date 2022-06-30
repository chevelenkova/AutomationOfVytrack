package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTwoLists {
    public static void CompareTwoLists(List<WebElement> actualListOfWebElements,ArrayList<String> expectedList){
        ArrayList<String> actualListOfStrings = new ArrayList<>();
        for(WebElement item : actualListOfWebElements){
            actualListOfStrings.add(item.getText());
        }
        System.out.println(actualListOfStrings);

        Assert.assertTrue(actualListOfStrings.equals(expectedList),"Modules under list is incorrect");
    }
}
