package proxy.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    lazy();
  }

  private static void lazy() {
    HeavyObject heavyObject = new HeavyObjectImpl();
    logger.info("{}", heavyObject);

    HeavyObject heavyObjectProxy = new LazyProxy(heavyObject);

    logger.info("{}", heavyObjectProxy.getValue());
    logger.info("{}", heavyObject);
    logger.info("{}", heavyObjectProxy.getValue());
  }
}
