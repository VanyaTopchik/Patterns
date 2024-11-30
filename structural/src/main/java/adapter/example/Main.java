package adapter.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    new Main().usePattern();
    new Main().alternative();
  }

  public void usePattern() {
    var rotaryHammer = new RotaryHammer();
    var drill = new Drill();
    // Используем сверло через адаптер
    rotaryHammer.drill(new SDSadapter(drill));
  }

  public void alternative() {
    var rotaryHammer = new RotaryHammer();
    var drill = new Drill();
    // В нашем простом примере можно использовать и просто лямбду
    rotaryHammer.drill(() -> logger.info("{}", drill));
  }
}
