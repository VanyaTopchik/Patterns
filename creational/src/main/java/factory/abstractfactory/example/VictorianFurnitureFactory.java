package factory.abstractfactory.example;

public class VictorianFurnitureFactory implements AbstractFurnitureFactory {
  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Table createTable() {
    return new VictorianTable();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }
}
