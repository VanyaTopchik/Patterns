package observer.jdk2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

  private String news;

  public void propertyChange(PropertyChangeEvent event) {
    this.setNews((String) event.getNewValue());
  }

  public String getNews() {
    return news;
  }

  public void setNews(String news) {
    this.news = news;
  }
}