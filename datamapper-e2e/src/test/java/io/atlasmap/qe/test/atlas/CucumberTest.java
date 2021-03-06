package io.atlasmap.qe.test.atlas;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "io.atlasmap.qe.test.atlas.steps",
        plugin = {"io.atlasmap.qe.test.atlas.AtlasmapInit",
                "pretty",
                "html:target/cucumber/cucumber-html",
                "junit:target/cucumber/cucumber-junit.xml",
                "json:target/cucumber/cucumber-report.json",
                "io.atlasmap.qe.test.atlas.utils.MailFormatter:target/cucumber/cucumber-mail/"
        },
        tags = {"not @Ignore"})
public class CucumberTest {
}
