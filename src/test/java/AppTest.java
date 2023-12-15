import org.example.maven.Main;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AppTest {
    private Assertion assertion = new Assertion();

    @Test
    void testFactorial() {
        assertion.assertEquals(6, Main.factprial(3));
        assertion.assertEquals(1, Main.factprial(1));
        assertion.assertEquals(1, Main.factprial(0));
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    void testException() {
        int rez = Main.factprial(-3);
    }
}
