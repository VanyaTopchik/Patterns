package state.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceivedState implements PackageState {

  private static final Logger logger = LoggerFactory.getLogger(ReceivedState.class);

  @Override
  public void next(Package pkg) {
    logger.info("This package is already received by a client.");
  }

  @Override
  public void prev(Package pkg) {
    pkg.setState(new DeliveredState());
  }

  @Override
  public void printStatus() {
    logger.info("Package was received by client.");
  }

  @Override
  public String toString() {
    return "ReceivedState{}";
  }
}