package prototype.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import prototype.example.Car;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws CloneNotSupportedException {
    ClonableUser original = new ClonableUser("unknown");
    original.setCar(new Car("Volga"));

    ClonableUser cloned = original.clone();

    logger.info("original = {}", original);
    logger.info("cloned = {}", cloned);

    logger.info("original.getCar() = {}", original.getCar());
    logger.info("cloned.getCar() = {}", cloned.getCar());

    cloned.setName("Dolly");
    logger.info("original.getName() = {}", original.getName());
    logger.info("cloned.getName() = {}", cloned.getName());
  }

}
