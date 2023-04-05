package com.fidexio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/html-report.html",
                "json:target/json-report.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/fidexio/step_definitions",
        dryRun =false,
        tags = "@FID10-439"
)
public class CukesRunner {
}
