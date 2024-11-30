package factory.simplefactory.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDriver {
  private static final Logger logger = LoggerFactory.getLogger(FactoryDriver.class);

  public static void main(String[] args) {
    Polygon p;
    PolygonFactory factory = new PolygonFactory();

    //get the shape which has 4 sides
    p = factory.getPolygon(4);
    logger.info("The shape with 4 sides is a {}", p.getType());

    //get the shape which has 8 sides
    p = factory.getPolygon(8);
    logger.info("The shape with 8 sides is a {}", p.getType());
  }
}
