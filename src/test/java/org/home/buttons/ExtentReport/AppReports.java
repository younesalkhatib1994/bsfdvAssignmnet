package org.home.buttons.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;



public class AppReports {
    ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;



    @BeforeSuite
    public void reportSetup() throws IOException {
         htmlReporter = new ExtentHtmlReporter("extent.html");
         extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
         htmlReporter.config().setTheme(Theme.DARK);
         htmlReporter.config().setReportName("Younes");
    }

    @AfterSuite
    public void reportTearDown(){
        extent.flush();
    }


}
