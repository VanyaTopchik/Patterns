package observer.jdk;

import java.util.Observable;

public class ONewsAgency extends Observable {//deprecated since java9

  public void setNews(String news) {
    setChanged();
    notifyObservers(news);
  }
}