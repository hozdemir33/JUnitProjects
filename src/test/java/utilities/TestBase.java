package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class TestBase {

// Making this abstract, because we just want to implement the methods without showing the details.
    //we also do not want to create an object on TestBase, just want to use the method
    //TestBase will have only two methods
    //1.Before
    //2.After
    //Why TestBase?
    //We use TestBase for repeated pre condition and after condition
    //TestBase is reusable
    //This will make actual test class shorter

    //Access modifier must be protected or public
    //because they are in different packages

    protected WebDriver driver;
    //extent testing from the mavenrepository by using apache library
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentReports extentReports;
    protected ExtentTest extentTest;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //  Create html report under test-output folder. name = my_project_report.html
//        Path of the html report
        String reportPath =  System.getProperty("user.dir")+ "/test-output/my_project_report.html";
//        Creating html report in the file path
        extentHtmlReporter= new ExtentHtmlReporter(reportPath);





//        Creating extent report
        extentReports=new ExtentReports();
        // Addition custom information
        extentReports.setSystemInfo("Test Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Team","Team Galaxy");
        extentHtmlReporter.config().setReportName("GMI Bank test resports");
        extentHtmlReporter.config().setDocumentTitle("JUnit Reports");



//        Attaching html report the Extent report
        extentReports.attachReporter(extentHtmlReporter);
//      So far the report creating is DONE.
        extentTest =extentReports.createTest("My Project Extent Report","My first extent reports");

    }
    @After
    public void tearDown(){
     //   driver.close();
        extentReports.flush();

    }
}
