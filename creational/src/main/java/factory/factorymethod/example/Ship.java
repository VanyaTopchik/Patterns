package factory.factorymethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ship implements Transport {

  private static final Logger logger = LoggerFactory.getLogger(Ship.class);

  @Override
  public void deliver(Cargo cargo) {
    logger.info("Доставить {} на судне по морю", cargo);
  }
}
