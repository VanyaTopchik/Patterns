package prototype.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    CopyableUser original = new CopyableUser("unknown");
    original.setCar(new Car("Volga"));

    CopyableUser copied = original.copy();

    logger.info("original = {}", original);
    logger.info("copied = {}", copied);

    logger.info("original.getCar() = {}", original.getCar());
    logger.info("copied.getCar() = {}", copied.getCar());

    copied.setName("Dolly");
    logger.info("original.getName() = {}", original.getName());
    logger.info("copied.getName() = {}", copied.getName());
  }

}
