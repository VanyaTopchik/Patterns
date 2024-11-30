package factory.factorymethod.example;

public class SeaLogistics implements Logistics {
  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
