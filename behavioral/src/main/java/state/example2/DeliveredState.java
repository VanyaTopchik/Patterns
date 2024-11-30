package state.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeliveredState implements PackageState {

  private static final Logger logger = LoggerFactory.getLogger(DeliveredState.class);

  @Override
  public void next(Package pkg) {
    pkg.setState(new ReceivedState());
  }

  @Override
  public void prev(Package pkg) {
    pkg.setState(new OrderedState());
  }

  @Override
  public void printStatus() {
    logger.info("Package delivered to post office, not received yet.");
  }

  @Override
  public String toString() {
    return "DeliveredState{}";
  }

}