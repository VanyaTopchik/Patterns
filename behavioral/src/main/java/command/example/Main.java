package command.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    var object = new SomeObject("initVal");
    var executor = new Executor(object);

    // нужную операцию выделяем в отдельный класс
    executor.addCommand(new AdderABC());
    executor.addCommand(new Echo());
    executor.addCommand(obj -> {
      obj.setValue(obj.getValue() + "+DEF");
      return "DEF added";
    });

    // при необходимости можно выполнить позднее
    executor.executeCommands();

    logger.info("result object:{}", object);
  }
}
