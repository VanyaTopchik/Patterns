package observer.jdk2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLNewsAgency {
  private String news;

  private final PropertyChangeSupport support;

  public PCLNewsAgency() {
    support = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener) {
    support.removePropertyChangeListener(listener);
  }

  public void setNews(String value) {
    support.firePropertyChange("news", this.news, value);
    this.news = value;
  }
}