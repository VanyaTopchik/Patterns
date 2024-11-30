package interpreter.example;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Expression query = new Select("name", new From("people"));
    Context ctx = new Context();
    List<String> result = query.interpret(ctx);
    logger.info("{}", result);

    Expression query2 = new Select("*", new From("people"));
    List<String> result2 = query2.interpret(ctx);
    logger.info("{}", result2);

    Expression query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
    List<String> result3 = query3.interpret(ctx);
    logger.info("{}", result3);
  }
}
