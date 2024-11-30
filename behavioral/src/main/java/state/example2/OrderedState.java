package state.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderedState implements PackageState {

  private static final Logger logger = LoggerFactory.getLogger(OrderedState.class);

  @Override
  public void next(Package pkg) {
    pkg.setState(new DeliveredState());
  }

  @Override
  public void prev(Package pkg) {
    logger.info("The package is in it's root state.");
  }

  @Override
  public void printStatus() {
    logger.info("Package ordered, not delivered to the office yet.");
  }

  @Override
  public String toString() {
    return "OrderedState{}";
  }
}