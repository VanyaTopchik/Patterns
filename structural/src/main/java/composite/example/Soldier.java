package composite.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Морской пехотинец.
 */
public class Soldier implements Unit {
    private static final Logger logger = LoggerFactory.getLogger(Soldier.class);

    @Override
    public void move() {
        logger.info("Soldier is moving");
    }
}
