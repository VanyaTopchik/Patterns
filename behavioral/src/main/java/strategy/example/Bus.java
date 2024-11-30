package strategy.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bus implements TransportStrategy {
    private static final Logger logger = LoggerFactory.getLogger(Bus.class);

    @Override
    public void transportation() {
        logger.info("bus");
    }
}
