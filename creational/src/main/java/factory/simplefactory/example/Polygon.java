package factory.simplefactory.example;

public interface Polygon {
  default String getType() {
    return this.getClass().getSimpleName();
  }
}
