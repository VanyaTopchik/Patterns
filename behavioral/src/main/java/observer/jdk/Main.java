package observer.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ONewsAgency observable = new ONewsAgency();
    ONewsChannel observer = new ONewsChannel();

    observable.addObserver(observer);

    observable.setNews("news");
    logger.info(observer.getNews());
  }
}
