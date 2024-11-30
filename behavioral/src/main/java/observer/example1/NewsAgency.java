package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
  private final List<Channel> channels = new ArrayList<>();

  public void addObserver(Channel channel) {
    this.channels.add(channel);
  }

  public void removeObserver(Channel channel) {
    this.channels.remove(channel);
  }

  public void setNews(String news) {
    for (Channel channel : this.channels) {
      channel.update(news);
    }
  }
}
