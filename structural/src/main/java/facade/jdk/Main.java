package facade.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    String variable = "Hello John";
    if (logger.isDebugEnabled()) {
      logger.info("Printing variable value: {}", variable);
    }
  }
}
