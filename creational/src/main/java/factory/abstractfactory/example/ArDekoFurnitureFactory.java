package factory.abstractfactory.example;

public class ArDekoFurnitureFactory implements AbstractFurnitureFactory {
  @Override
  public Chair createChair() {
    return new ArDekoChair();
  }

  @Override
  public Table createTable() {
    return new ArDekoTable();
  }

  @Override
  public Sofa createSofa() {
    return new ArDekoSofa();
  }
}
