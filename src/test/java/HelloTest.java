import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void greetReturnsExpectedMessage() {
        assertEquals("Hello, World!", new Hello().greet("World"));
    }
}
