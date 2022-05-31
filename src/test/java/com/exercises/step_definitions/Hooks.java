package com.exercises.step_definitions;


import com.exercises.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {//TestBase yerine gecen class


    @Before
    public void setup() {

        System.out.println("--- This Statement comes from BEFORE ---");
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }


    @Before("@db")
    public void setupDb() {

        System.out.println("*** - Connecting to Database - ***");
    }

    @After("@db")
    public void closeDb() {

        System.out.println("*** - Disconnecting Database - ***");
    }


}
