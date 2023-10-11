package requesters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestRequester {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void testLogger() {
        LOGGER.info("Hi! This is Logger!");
        LOGGER.info("This is first info message");
        LOGGER.info("This is send info Message");
        //.......
    }
}
