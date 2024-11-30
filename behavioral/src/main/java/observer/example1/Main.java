package observer.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();

    observable.addObserver(observer);

    observable.setNews("news");
    logger.info(observer.getNews());
  }
}
