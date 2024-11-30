package strategy.jdk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    Comparator<User> comparator = Comparator.comparingInt(User::getAge);

    List<User> list = new ArrayList<>();
    list.add(new User("first", 22));
    list.add(new User("second", 26));
    list.add(new User("third", 14));
    list.sort(comparator);

    logger.info("after sort:{}", list);
  }
}
