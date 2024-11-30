package observer.example2;

import java.util.ArrayList;
import java.util.List;

class EventProducer {

  private final List<Listener> listeners = new ArrayList<>();

  public void addListener(Listener listener) {
    listeners.add(listener);
  }

  public void removeListener(Listener listener) {
    listeners.remove(listener);
  }

  public void event(String data) {
    for (int i = 0; i < listeners.size(); ++i) {
      try {
        listeners.get(i).onUpdate(data);
      } catch (Exception ex) {
        // обработка исключения
      }
    }
  }
}
