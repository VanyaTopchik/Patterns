package strategy.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Taxi implements TransportStrategy {
    private static final Logger logger = LoggerFactory.getLogger(Taxi.class);

    @Override
    public void transportation() {
        logger.info("taxi");
    }
}
