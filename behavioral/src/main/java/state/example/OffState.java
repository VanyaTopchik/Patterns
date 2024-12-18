package state.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffState implements State {
    private static final Logger logger = LoggerFactory.getLogger(OffState.class);

    @Override
    public State action() {
        logger.info("current state: off");
        return StateProvider.getOnState();
    }
}
