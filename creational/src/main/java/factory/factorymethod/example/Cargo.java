package factory.factorymethod.example;

public record Cargo(double height, double width, double lendth, double weight) {
  @Override
  public String toString() {
    return String.format("Груз{высота=%7.2fм, ширина=%7.2fм, длина=%7.2fм, вес=%7.2fкг}", height, width, lendth, weight);
  }
}
