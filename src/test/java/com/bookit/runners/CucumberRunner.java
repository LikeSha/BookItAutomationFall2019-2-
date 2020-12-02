package com.bookit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/bookit/step_definitions", // glue need to connect with step_definitions
        features = "src/test/resources/features",// features specify feature files (copy content root)
        plugin = {
                "json:target/cucumber.json"
        }, // plugin for generating json report.
        tags = "@create_student_3",// tags to specify which scenario to run which to be ignored
        dryRun = false // dry run its test run, not execution ,it used to ensure that every step definition
                       // has code implementation

)
public class CucumberRunner {
}