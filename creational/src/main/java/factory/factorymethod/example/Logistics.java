package factory.factorymethod.example;

public interface Logistics {

  default void planDelivery(Cargo cargo) {
    Transport transport = createTransport();
    transport.deliver(cargo);
  }

  Transport createTransport();
}
