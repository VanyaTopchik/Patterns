package decorator.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    var ds = new DataSourceImpl();
    printer(ds);

    printer(new DataSourceDecoratorAdder(ds));
    printer(new DataSourceDecoratorMultiplicator(ds));
    printer(new DataSourceDecoratorMultiplicator(new DataSourceDecoratorAdder(new DataSourceDecoratorMultiplicator(ds))));
  }

  private static void printer(DataSource ds) {
    logger.info("{}:", ds.getInteger());
  }
}
