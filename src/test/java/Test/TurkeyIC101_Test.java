package Test;

import Base.Base;
import Component.ICLines;
import Component.LeftMenu;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TurkeyIC101_Test extends Base {

    @BeforeSuite
    public void beforemethod(){
        super.beforemethod();
        super.loginmethod();
    }

    @Test (priority = 1)
    public void APL_Daily_Success() throws InterruptedException{
            LeftMenu leftmenu = new LeftMenu(driver);
            ICLines iclines = new ICLines(driver);
            Thread.sleep(2000);
        try {
            leftmenu.ComboboxTurkey().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.IC101()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(iclines.title().getText()+ " Daily");
            Thread.sleep(2000);
            actions.moveToElement(iclines.TabAPL()).click().build().perform();

            System.out.println(iclines.TabAPL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 2)
    public void ASL_Daily_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxTurkey().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.IC101()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(iclines.title().getText()+ " Daily");
            Thread.sleep(2000);
            actions.moveToElement(iclines.TabASL()).click().build().perform();

            System.out.println(iclines.TabASL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 3)
    public void IML_Daily_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxTurkey().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.IC101()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(iclines.title().getText()+ " Daily");
            Thread.sleep(2000);
            actions.moveToElement(iclines.TabIML()).click().build().perform();

            System.out.println(iclines.TabIML().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 4)
    public void COL_Daily_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            leftmenu.ComboboxTurkey().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.IC101()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(iclines.title().getText()+ " Daily");
            Thread.sleep(2000);
            actions.moveToElement(iclines.TabCOL()).click().build().perform();

            System.out.println(iclines.TabCOL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }

    @Test (priority = 5)
    public void APL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(iclines.title().getText() + " Weekly");
            Thread.sleep(2000);
            iclines.PeriodFilter().click();
            Thread.sleep(2000);
            iclines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(iclines.TabAPL()).click().build().perform();

            System.out.println(iclines.TabAPL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 6)
    public void ASL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(iclines.title().getText() + " Weekly");
            Thread.sleep(2000);
            iclines.PeriodFilter().click();
            Thread.sleep(2000);
            iclines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(iclines.TabASL()).click().build().perform();

            System.out.println(iclines.TabASL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 7)
    public void IML_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(iclines.title().getText() + " Weekly");
            Thread.sleep(2000);
            iclines.PeriodFilter().click();
            Thread.sleep(2000);
            iclines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(iclines.TabIML()).click().build().perform();

            System.out.println(iclines.TabIML().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test (priority = 8)
    public void COL_Weekly_Success() throws InterruptedException{
        LeftMenu leftmenu = new LeftMenu(driver);
        ICLines iclines = new ICLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(iclines.title().getText() + " Weekly");
            Thread.sleep(2000);
            iclines.PeriodFilter().click();
            Thread.sleep(2000);
            iclines.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(iclines.TabCOL()).click().build().perform();

            System.out.println(iclines.TabCOL().getText());
            System.out.println("OEE " + iclines.ValueOEE().getText());
            System.out.println("Availability " + iclines.ValueAvailability().getText());
            System.out.println("Performance " + iclines.ValuePerformance().getText());
            System.out.println("Quality " + iclines.ValueQuality().getText());

            System.out.println("Total Production " + iclines.TotalProduction().getText());
            System.out.println("Defect " + iclines.Defect().getText());
            System.out.println("PPM " + iclines.PPM().getText());
            System.out.println("Breakdowns " + iclines.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(iclines.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }

    @AfterTest
    public void aftertest(){
        super.aftermethod();
    }
}
