package factory.abstractfactory.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ArDekoFurnitureFactory factory = new ArDekoFurnitureFactory();
    factory.createChair();
    factory.createSofa();
    factory.createTable();

    ModernFurnitureFactory factory1 = new ModernFurnitureFactory();
    factory.createChair();
    factory.createSofa();
    factory.createTable();
  }

  private static void createFurniture(AbstractFurnitureFactory factory) {
    Chair chair = factory.createChair();
    Sofa sofa = factory.createSofa();
    Table table = factory.createTable();
  }
}