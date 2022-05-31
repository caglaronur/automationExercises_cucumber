package com.exercises.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"
        },
        features = "src/test/resources/features",
        glue = "com/exercises/step_definitions",
        dryRun = false, // false: tanimli ne kadar feature file varsa bunlarin step definitions lari calistirir
                        // true: eksik olan step definitions bize calistirir
        tags = "@contactUs"

        // Before version 4  {"@wip", "@smoke"} - - and
        // Before version 5  "@wip, @smoke" - - or
        // Before version 5    {"@smoke" , "~wip"} - - and not
)
public class CukesRunner {
}
