import com.aplana.chameleon.ChameleonCucumberRunner;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(ChameleonCucumberRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.aplana.chameleon","com.aplana.chameleonTest"},
        plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
)
public class TestRunner {

}
