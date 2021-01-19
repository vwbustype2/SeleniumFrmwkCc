package com.pages;

import com.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;

public class KbcPage extends BasePageObject implements KbcModel{

    //CONSTRUCTOR
    protected KbcPage(WebDriver driver) {
        super(driver);
    }

    //WEBELEMENTS
    private String kbcCalc = "https://www.kbc.ie/our-products/savings-and-investments/regular-saver/regular-saver-calculator";
    private WebElement calcTitle = driver.findElement(By.xpath("//h1[normalize-space()='Regular Saver Calculator']"));

    private WebElement calcTimeLabel = driver.findElement(By.xpath("//label[normalize-space()='How much could I save over a period of time?']"));
    private WebElement calcTimeRadioBtn = driver.findElement(By.id("calcTabTwo"));
    private WebElement monthlyAmtLabel = driver.findElement(By.xpath("//div[@id='calcBlockTwo']//li[1]//label[1]"));//make this more specific
    private WebElement monthlyAmtTextbox = driver.findElement(By.xpath("//input[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_principal_period']"));
    private WebElement calcTimeLengthLabel = driver.findElement(By.xpath("//div[@id='calcBlockTwo']//li[1]//label[1]"));//make this more specific
    private WebElement calcTimeLengthDropdown = driver.findElement(By.xpath("//select[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_term_period']"));
    private WebElement calcTimeBtn = driver.findElement(By.xpath("//input[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_btnCalc2']"));

    private WebElement calcGoalLabel = driver.findElement(By.xpath("//label[contains(text(),'How much should I be saving to reach my savings go')]"));
    private WebElement calcGoalRadioBtn = driver.findElement(By.id("calcTabOne"));
    private WebElement savingsGoalLabel = driver.findElement(By.xpath("//div[@id='calcBlockOne']//li[1]//label[1]"));//make this more specific
    private WebElement savingsGoalTextbox = driver.findElement(By.xpath("//input[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_savings_goal']"));
    private WebElement calcGoalLengthLabel = driver.findElement(By.xpath("//div[@id='calcBlockOne']//li[1]//label[1]"));//make this more specific
    private WebElement calcGoalLengthDropdown = driver.findElement(By.xpath("//select[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_length_to_leave_for']"));
    private WebElement calcGoalBtn = driver.findElement(By.xpath("//input[@id='p_lt_PagePlaceHolderZone_MainPagePlaceHolder_p_lt_ContentZone_RegularSaverCalculator_btnCalc1']']"));

    //GETTERS
    public String getKbcCalc() {
        return kbcCalc;
    }
    public String getCalcTitle() { return calcTitle.getText(); }

    public String getCalcTimeLabel() { return calcTimeLabel.getText();   }
    public boolean isCalcTimeRadioBtn(){return calcTimeRadio.isSelected();}
    public String getMonthlyAmtLabel() { return monthlyAmtLabel.getText();   }
    public String getMonthlyAmtTextbox() { return monthlyAmtTextbox.getText();   }
    public String getCalcTimeLengthLabel() { return calcTimeLengthLabel.getText();   }
    /*public String getCalcTimeLengthDropdown() { return calcTimeLengthDropdown;  } */

    public String getCalcGoalLabel() { return calcGoalLabel.getText();   }
    public boolean isCalcGoalRadioBtn(){return calcGoalRadio.isSelected(); }
    public String getSavingsGoalLabel() { return savingsGoalLabel.getText();   }
    public String getSavingsGoalTextbox() { return savingsGoalTextbox.getText();   }
    public String getCalcGoalLengthLabel() { return calcGoalLengthLabel.getText();   }
    /*public String getCalcGoalLengthDropdown() { return calcGoalLengthDropdown.getOptions();  } */


    //SETTERS

    //select Calculator option A - Period of Time
    public void setCalcTimeRadio(){calcTimeRadioBtn.click();}

    //Enter Monthly Savings Amt
    /*String inMonthlyAmt = "1000"; //this should be in a json file */
    public void setMonthlyAmtTextbox(String inMonthlyAmt){monthlyAmtTextbox.sendKeys(inMonthlyAmt);}

    //Enter Length of Time
    /*String inTimeLength  = "1 month"; //this should be in a json file */
    public void setCalcTimeLengthDropdown(String inTimeLength){
        Select select=new Select(calcTimeLengthDropdown);
        select.selectByVisibleText(inTimeLength);
    }
    //Click Calculate
    public void selectCalcTimeBtn(){calcTimeBtn.click();}


    //select Calculator option B - Savings Goal
    public void setCalcGoalRadio(){calcGoalRadioBtn.click();}

    //Enter Goal Amt
    /*String inSavingsGoal = "20000"; //this should be in a json file */
    public void setSavingsGoalTextbox(String inSavingsGoal){savingsGoalTextbox.sendKeys(inSavingsGoal);}

    //Enter Length of Time
    /*String inGoalLength  = "18 months"; //this should be in a json file */
    public void setCalcGoalLengthDropdown(String inGoalLength){
        Select select=new Select(calcGoalLengthDropdown);
        select.selectByVisibleText(inGoalLength);
    }
    //Click Calculate
    public void selectCalcGoalBtn(){calcTimeBtn.click();}

}
