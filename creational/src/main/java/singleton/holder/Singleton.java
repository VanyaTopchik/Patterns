package singleton.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {
  private static final Logger logger = LoggerFactory.getLogger(Singleton.class);

  private Singleton() {
    logger.info("lazy creation");
  }

  static Singleton getInstance() {
    logger.info("getInstance");
    return SingletonHolder.instance;
  }

  private static class SingletonHolder {
    static {
      logger.info("init SingletonHolder");
    }

    static final Singleton instance = new Singleton();
  }
}
