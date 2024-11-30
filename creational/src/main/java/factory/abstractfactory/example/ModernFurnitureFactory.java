package factory.abstractfactory.example;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {
  @Override
  public Chair createChair() {
    return new ModernChair();
  }

  @Override
  public Table createTable() {
    return new ModernTable();
  }

  @Override
  public Sofa createSofa() {
    return new ModernSofa();
  }
}
