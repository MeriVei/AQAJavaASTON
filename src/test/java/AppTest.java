import org.example.maven.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testFactorial() {
        Assertions.assertEquals(6, Main.factprial(3));
        Assertions.assertEquals(1, Main.factprial(1));
        Assertions.assertEquals(1, Main.factprial(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Main.factprial(-3);
        });
    }
}
