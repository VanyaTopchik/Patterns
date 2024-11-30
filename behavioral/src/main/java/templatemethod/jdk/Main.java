package templatemethod.jdk;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    AbstractList<String> list = new ArrayList<>();
    list.addAll(List.of("first", "second"));
    list.addAll(List.of("third", "fourth"));

    logger.info("{}", list);
  }
}
