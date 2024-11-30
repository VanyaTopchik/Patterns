package observer.jdk2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    PCLNewsAgency observable = new PCLNewsAgency();
    PCLNewsChannel observer = new PCLNewsChannel();

    observable.addPropertyChangeListener(observer);

    observable.setNews("news");
    logger.info(observer.getNews());

    observable.removePropertyChangeListener(observer);
  }
}
