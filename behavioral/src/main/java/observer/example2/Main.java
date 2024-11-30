package observer.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    var producer = new EventProducer();
    var consumerA = new ConsumerA();
    var consumerB = new ConsumerB();

    boolean[] first = {true};

    Listener temp = data -> {
      logger.info("Temp listener:{}", data);
      if (first[0]) {
        first[0] = false;
        producer.event("EventB");
        //producer.addListener(consumerB.getListener());
      }
    };

    producer.addListener(temp);
    producer.addListener(consumerA);
    producer.addListener(consumerB.getListener());

    producer.event("eventA");
    producer.event("eventB");

    producer.removeListener(temp);
    producer.removeListener(consumerA);
    producer.removeListener(consumerB.getListener());
    //Все реализации требуют явной отмены регистрации наблюдателей, чтобы избежать проблемы с Lapsed Listener Problem.
    //Забыв сделать это - может привести к утечке памяти.

    producer.event("eventC");
    producer.event("eventD");
  }
}
