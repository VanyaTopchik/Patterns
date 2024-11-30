package singleton.synchronization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {
  private static final Logger logger = LoggerFactory.getLogger(Singleton.class);

  private static Singleton instance;

  private Singleton() {
    logger.info("run constructor");
  }

  public static synchronized Singleton getInstance() {
    // ок, но медленно
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
