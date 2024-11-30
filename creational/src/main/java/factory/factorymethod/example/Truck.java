package factory.factorymethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck implements Transport {

  private static final Logger logger = LoggerFactory.getLogger(Truck.class);

  @Override
  public void deliver(Cargo cargo) {
    logger.info("Доставить {} на грузовике по суше", cargo);
  }
}
