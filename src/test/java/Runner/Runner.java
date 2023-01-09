package Runner;


import FabricaDeDriver.FDriver;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,

        features = "src/test/Feature/Login.feature",
        glue = {"Stepes","FabricaDeDriver"},
        tags = "@web",
        monochrome = true,
        publish = false,
        snippets = SnippetType.CAMELCASE,
        stepNotifications = true)



public class Runner {




}
