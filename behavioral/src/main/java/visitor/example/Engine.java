package visitor.example;

public class Engine implements Element {
  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  String checkEngine() {
    return "Engine Ok";
  }
}
