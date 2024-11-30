package factory.factorymethod.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LogisticApp {

  private static final Random random = new Random();

  public static void main(String[] args) {
    List<Cargo> cargos = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      cargos.add(generateCargo());
    }

    for (var cargo : cargos) {
      Logistics logistics = configure(cargo);
      logistics.planDelivery(cargo);
    }
  }

  private static Cargo generateCargo() {
    return new Cargo(random.nextFloat(1, 4), random.nextFloat(1, 4),
        random.nextFloat(1, 25), random.nextFloat(1, 3000));
  }

  private static Logistics configure(Cargo cargo) {
    if (cargo.weight() > 2500 || cargo.height() > 3 || cargo.lendth() > 20 || cargo.width() > 3) {
      return new SeaLogistics();
    } else {
      return new RoadLogistics();
    }
  }
}