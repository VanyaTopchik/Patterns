package state.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnState implements State {
    private static final Logger logger = LoggerFactory.getLogger(OnState.class);

    @Override
    public State action() {
        logger.info("current state: on");
        return StateProvider.getOffState();
    }
}
