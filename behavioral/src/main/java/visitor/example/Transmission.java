package visitor.example;

public class Transmission implements Element {
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  String refreshOil() {
    return "Заменить масло";
  }
}
