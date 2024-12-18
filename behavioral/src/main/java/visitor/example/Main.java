package visitor.example;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Element> elements = Arrays.asList(new Brake(), new Engine(), new Transmission());

    Visitor visitor = new CarService();
    elements.forEach(elem -> elem.accept(visitor));

    Visitor visitorVip = new CarServiceVip();
    elements.forEach(elem -> elem.accept(visitorVip));
  }
}
