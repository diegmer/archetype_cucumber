package com.atd.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")
//@CucumberOptions(
//        features = {"src/test/resources/features/consult_dictionary/LookupADefinition.feature"},
//        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},
//        glue = {"com.atd.serenity.steps.serenity"}
//)

public class DefinitionTestSuite {
    private DefinitionTestSuite() {
    }
}
